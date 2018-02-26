CREATE DOMAIN d_name VARCHAR(128) NOT NULL
CONSTRAINT CK_d_name CHECK (TRIM(VALUE) != '' and VALUE !~ '^[[:digit:]]+$');

CREATE TABLE Person_State (
  person_state_code SMALLINT NOT NULL,
  ee_name d_name,
  en_name d_name,
  CONSTRAINT PK_Person_State_person_state_code PRIMARY KEY (person_state_code),
  CONSTRAINT AK_Person_State_ee_name UNIQUE (ee_name),
  CONSTRAINT AK_Person_State_en_name UNIQUE (en_name)
);

CREATE TABLE Grade (
  grade_code SMALLINT NOT NULL,
  ee_name d_name,
  en_name d_name,
  CONSTRAINT PK_Grade_grade_code PRIMARY KEY (grade_code),
  CONSTRAINT AK_Grade_ee_name UNIQUE (ee_name),
  CONSTRAINT AK_Grade_en_name UNIQUE (en_name)
);

COMMENT ON TABLE Grade IS '1 -- No Grade, 2 -- Bachelor, 3 -- Master, 4 -- Doctoral, 5 -- Applied Higher Education';

CREATE TABLE Person (
  person_id BIGSERIAL NOT NULL,
  grade_code SMALLINT NOT NULL,
  firstname VARCHAR(1000) NOT NULL,
  lastname VARCHAR(1000) NOT NULL,
  person_state_code SMALLINT NOT NULL DEFAULT 1,
  uniid VARCHAR(6) NOT NULL,
  /*
  id_code VARCHAR(11) NOT NULL,
  address VARCHAR(256) NOT NULL,
   */
  email VARCHAR(256) NOT NULL, /* TODO: make trigger uniid || '@ttu.ee' */
  password VARCHAR(72) NOT NULL,
  reg_time TIMESTAMP NOT NULL DEFAULT now(),
  CONSTRAINT PK_Person_person_id PRIMARY KEY (person_id),
  CONSTRAINT AK_Person_uniid UNIQUE (uniid),
  CONSTRAINT CK_Person_firstname CHECK (TRIM(firstname) != '' AND firstname !~ '^[[:digit:]]+$'),
  CONSTRAINT CK_Person_lastname CHECK (TRIM(lastname) != '' AND lastname !~ '^[[:digit:]]+$'),
  CONSTRAINT CK_Person_uniid CHECK (uniid ~ '^[a-z]{6}$'),
  CONSTRAINT CK_Person_email CHECK (email ~ '^[a-z0-9!#$%&''*+\/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&''*+\/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?$'),
  CONSTRAINT CK_Person_reg_time CHECK (reg_time = now()),
  CONSTRAINT FK_Person_person_state_code FOREIGN KEY (person_state_code) REFERENCES Person_state (person_state_code) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT FK_Person_grade_code FOREIGN KEY (grade_code) REFERENCES Grade (grade_code) ON DELETE RESTRICT ON UPDATE CASCADE
);

CREATE INDEX IXFK_Person_person_state_code ON Person (person_state_code ASC)
;
CREATE INDEX IXFK_Person_grade_code ON Person (grade_code ASC)
;
CREATE UNIQUE INDEX IXAK_Person_email ON Person (lower(email))
;

CREATE TABLE Faculty (
  faculty_code SMALLINT NOT NULL,
  ee_name d_name,
  en_name d_name,
  CONSTRAINT PK_Faculty_faculty_code PRIMARY KEY (faculty_code),
  CONSTRAINT AK_Faculty_ee_name UNIQUE (ee_name),
  CONSTRAINT AK_Faculty_en_name UNIQUE (en_name)
);

COMMENT ON TABLE Faculty IS '1 -- School of Business and Governance, 2 -- School of Engineering, 3 -- School of Information Technologies, 4 -- School of Science, 5 -- Estonian Maritime Academy';

CREATE TABLE Role (
  role_code SMALLINT NOT NULL,
  ee_name d_name,
  en_name d_name,
  CONSTRAINT PK_Role_role_code PRIMARY KEY (role_code),
  CONSTRAINT AK_Role_ee_name UNIQUE (ee_name),
  CONSTRAINT AK_Role_en_name UNIQUE (en_name)
);

COMMENT ON TABLE Role IS '1 -- Student, 2 -- Lecturer';

CREATE TABLE Role_Faculty (
  role_faculty_code SMALLINT NOT NULL,
  role_code SMALLINT NOT NULL,
  faculty_code SMALLINT NOT NULL,
  CONSTRAINT PK_Role_Faculty_role_faculty_code PRIMARY KEY (role_faculty_code),
  CONSTRAINT AK_Role_Faculty_role_code UNIQUE (role_code, faculty_code),
  CONSTRAINT FK_Role_Faculty_faculty_code FOREIGN KEY (faculty_code) REFERENCES Faculty (faculty_code) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT FK_Role_Faculty_role_code FOREIGN KEY (role_code) REFERENCES Role (role_code) ON DELETE RESTRICT ON UPDATE CASCADE
);

CREATE INDEX IXFK_Role_Faculty_faculty_code ON Role_Faculty (faculty_code ASC);

CREATE TABLE Role_Faculty_Owner (
  person_id BIGINT NOT NULL,
  role_faculty_code SMALLINT NOT NULL,
  CONSTRAINT PK_Role_Owner_role_faculty_code_person_id PRIMARY KEY (person_id, role_faculty_code),
  CONSTRAINT FK_Role_Owner_role_faculty_code FOREIGN KEY (role_faculty_code) REFERENCES Role_Faculty (role_faculty_code) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT FK_Role_Owner_person_id FOREIGN KEY (person_id) REFERENCES Person (person_id) ON DELETE CASCADE ON UPDATE RESTRICT
);

CREATE INDEX IXFK_Role_Owner_role_faculty_code ON Role_Faculty_Owner (role_faculty_code ASC);

CREATE TABLE Thesis_State (
  thesis_state_code SMALLINT NOT NULL,
  ee_name d_name,
  en_name d_name,
  CONSTRAINT PK_Thesis_State_thesis_state_code PRIMARY KEY (thesis_state_code),
  CONSTRAINT AK_Thesis_State_en_name UNIQUE (en_name),
  CONSTRAINT AK_Thesis_State_ee_name UNIQUE (ee_name)
);

COMMENT ON TABLE Thesis_State IS '1 -- Active, 2 - Inactive, 3 - Reserved';

CREATE TABLE Thesis (
  thesis_id BIGSERIAL NOT NULL,
  curator_id BIGINT NOT NULL,
  supervisor_id BIGINT DEFAULT NULL,
  faculty_code SMALLINT NOT NULL,
  thesis_state_code SMALLINT NOT NULL DEFAULT 1,
  ee_title d_name,
  en_title d_name,
  ee_description VARCHAR(1000) NOT NULL,
  en_description VARCHAR(1000) NOT NULL,
  CONSTRAINT PK_Thesis_thesis_id PRIMARY KEY (thesis_id),
  CONSTRAINT AK_Thesis_ee_title UNIQUE (ee_title),
  CONSTRAINT AK_Thesis_en_title UNIQUE (en_title),
  CONSTRAINT FK_Thesis_curator_id FOREIGN KEY (curator_id) REFERENCES Person (person_id) ON DELETE CASCADE ON UPDATE RESTRICT,
  CONSTRAINT FK_Thesis_faculty_code FOREIGN KEY (faculty_code) REFERENCES Faculty (faculty_code) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT FK_Thesis_supervisor_id FOREIGN KEY (supervisor_id) REFERENCES Person (person_id) ON DELETE SET NULL ON UPDATE RESTRICT,
  CONSTRAINT FK_Thesis_thesis_state_code FOREIGN KEY (thesis_state_code) REFERENCES Thesis_State (thesis_state_code) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT CK_Thesis_ee_description CHECK (TRIM(ee_description) != '' AND ee_description !~ '^[[:digit:]]+$'),
  CONSTRAINT CK_Thesis_en_description CHECK (TRIM(en_description) != '' AND en_description !~ '^[[:digit:]]+$')
);

CREATE INDEX IXFK_Thesis_curator_id ON Thesis (curator_id ASC);
CREATE INDEX IXFK_Thesis_supervisor_id ON Thesis (supervisor_id ASC);
CREATE INDEX IXFK_Thesis_faculty_code ON Thesis (faculty_code ASC);
CREATE INDEX IXFK_Thesis_State_thesis_state_code ON Thesis_State (thesis_state_code ASC);

CREATE TABLE Thesis_Candidate (
  thesis_id BIGINT NOT NULL,
  person_id BIGINT NOT NULL,
  CONSTRAINT PK_Thesis_Candidate_thesis_id_person_id PRIMARY KEY (thesis_id, person_id),
  CONSTRAINT FK_Thesis_Candidate_thesis_id FOREIGN KEY (thesis_id) REFERENCES Thesis (thesis_id) ON DELETE CASCADE ON UPDATE RESTRICT,
  CONSTRAINT FK_Thesis_Candidate_person_id FOREIGN KEY (person_id) REFERENCES Person (person_id) ON DELETE CASCADE ON UPDATE RESTRICT
);

CREATE INDEX IXFK_Thesis_Candidate_person_id ON Thesis_Candidate (person_id ASC);