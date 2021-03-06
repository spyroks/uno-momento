/*
 * This file is generated by jOOQ.
*/
package ee.ttu.unomomento.db;


import ee.ttu.unomomento.db.tables.Account;
import ee.ttu.unomomento.db.tables.AccountRole;
import ee.ttu.unomomento.db.tables.AccountState;
import ee.ttu.unomomento.db.tables.CuratorsWithTheses;
import ee.ttu.unomomento.db.tables.Degree;
import ee.ttu.unomomento.db.tables.Faculty;
import ee.ttu.unomomento.db.tables.Person;
import ee.ttu.unomomento.db.tables.PersonAccountOwner;
import ee.ttu.unomomento.db.tables.PersonFaculty;
import ee.ttu.unomomento.db.tables.PersonRole;
import ee.ttu.unomomento.db.tables.Role;
import ee.ttu.unomomento.db.tables.Thesis;
import ee.ttu.unomomento.db.tables.ThesisCandidate;
import ee.ttu.unomomento.db.tables.ThesisOwner;
import ee.ttu.unomomento.db.tables.ThesisPicked;
import ee.ttu.unomomento.db.tables.ThesisState;
import ee.ttu.unomomento.db.tables.ThesisTag;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = -1858916109;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.account</code>.
     */
    public final Account ACCOUNT = ee.ttu.unomomento.db.tables.Account.ACCOUNT;

    /**
     * The table <code>public.account_role</code>.
     */
    public final AccountRole ACCOUNT_ROLE = ee.ttu.unomomento.db.tables.AccountRole.ACCOUNT_ROLE;

    /**
     * The table <code>public.account_state</code>.
     */
    public final AccountState ACCOUNT_STATE = ee.ttu.unomomento.db.tables.AccountState.ACCOUNT_STATE;

    /**
     * The table <code>public.curators_with_theses</code>.
     */
    public final CuratorsWithTheses CURATORS_WITH_THESES = ee.ttu.unomomento.db.tables.CuratorsWithTheses.CURATORS_WITH_THESES;

    /**
     * 1 -- No Degree, 2 -- Bachelor, 3 -- Master, 4 -- Doctoral, 5 -- Applied Higher Education
     */
    public final Degree DEGREE = ee.ttu.unomomento.db.tables.Degree.DEGREE;

    /**
     * 1 -- School of Business and Governance, 2 -- School of Engineering, 3 -- School of Information Technologies, 4 -- School of Science, 5 -- Estonian Maritime Academy
     */
    public final Faculty FACULTY = ee.ttu.unomomento.db.tables.Faculty.FACULTY;

    /**
     * The table <code>public.person</code>.
     */
    public final Person PERSON = ee.ttu.unomomento.db.tables.Person.PERSON;

    /**
     * The table <code>public.person_account_owner</code>.
     */
    public final PersonAccountOwner PERSON_ACCOUNT_OWNER = ee.ttu.unomomento.db.tables.PersonAccountOwner.PERSON_ACCOUNT_OWNER;

    /**
     * The table <code>public.person_faculty</code>.
     */
    public final PersonFaculty PERSON_FACULTY = ee.ttu.unomomento.db.tables.PersonFaculty.PERSON_FACULTY;

    /**
     * The table <code>public.person_role</code>.
     */
    public final PersonRole PERSON_ROLE = ee.ttu.unomomento.db.tables.PersonRole.PERSON_ROLE;

    /**
     * 1 -- Student, 2 -- Curator
     */
    public final Role ROLE = ee.ttu.unomomento.db.tables.Role.ROLE;

    /**
     * The table <code>public.thesis</code>.
     */
    public final Thesis THESIS = ee.ttu.unomomento.db.tables.Thesis.THESIS;

    /**
     * The table <code>public.thesis_candidate</code>.
     */
    public final ThesisCandidate THESIS_CANDIDATE = ee.ttu.unomomento.db.tables.ThesisCandidate.THESIS_CANDIDATE;

    /**
     * The table <code>public.thesis_owner</code>.
     */
    public final ThesisOwner THESIS_OWNER = ee.ttu.unomomento.db.tables.ThesisOwner.THESIS_OWNER;

    /**
     * The table <code>public.thesis_picked</code>.
     */
    public final ThesisPicked THESIS_PICKED = ee.ttu.unomomento.db.tables.ThesisPicked.THESIS_PICKED;

    /**
     * 1 -- Active, 2 - Inactive, 3 - Reserved
     */
    public final ThesisState THESIS_STATE = ee.ttu.unomomento.db.tables.ThesisState.THESIS_STATE;

    /**
     * The table <code>public.thesis_tag</code>.
     */
    public final ThesisTag THESIS_TAG = ee.ttu.unomomento.db.tables.ThesisTag.THESIS_TAG;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        List result = new ArrayList();
        result.addAll(getSequences0());
        return result;
    }

    private final List<Sequence<?>> getSequences0() {
        return Arrays.<Sequence<?>>asList(
            Sequences.ACCOUNT_ACCOUNT_ID_SEQ,
            Sequences.PERSON_PERSON_ID_SEQ,
            Sequences.THESIS_THESIS_ID_SEQ);
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Account.ACCOUNT,
            AccountRole.ACCOUNT_ROLE,
            AccountState.ACCOUNT_STATE,
            CuratorsWithTheses.CURATORS_WITH_THESES,
            Degree.DEGREE,
            Faculty.FACULTY,
            Person.PERSON,
            PersonAccountOwner.PERSON_ACCOUNT_OWNER,
            PersonFaculty.PERSON_FACULTY,
            PersonRole.PERSON_ROLE,
            Role.ROLE,
            Thesis.THESIS,
            ThesisCandidate.THESIS_CANDIDATE,
            ThesisOwner.THESIS_OWNER,
            ThesisPicked.THESIS_PICKED,
            ThesisState.THESIS_STATE,
            ThesisTag.THESIS_TAG);
    }
}
