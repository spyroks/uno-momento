/*
 * This file is generated by jOOQ.
*/
package ee.ttu.unomomento.db.tables.records;


import ee.ttu.unomomento.db.tables.Thesis;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


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
public class ThesisRecord extends UpdatableRecordImpl<ThesisRecord> implements Record10<Long, String, Short, Short, Short, String, String, String, String, Timestamp> {

    private static final long serialVersionUID = 1649017589;

    /**
     * Setter for <code>public.thesis.thesis_id</code>.
     */
    public ThesisRecord setThesisId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.thesis.thesis_id</code>.
     */
    public Long getThesisId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.thesis.supervisor_name</code>.
     */
    public ThesisRecord setSupervisorName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.thesis.supervisor_name</code>.
     */
    public String getSupervisorName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.thesis.faculty_code</code>.
     */
    public ThesisRecord setFacultyCode(Short value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.thesis.faculty_code</code>.
     */
    public Short getFacultyCode() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>public.thesis.thesis_state_code</code>.
     */
    public ThesisRecord setThesisStateCode(Short value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.thesis.thesis_state_code</code>.
     */
    public Short getThesisStateCode() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>public.thesis.degree_code</code>.
     */
    public ThesisRecord setDegreeCode(Short value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.thesis.degree_code</code>.
     */
    public Short getDegreeCode() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>public.thesis.ee_title</code>.
     */
    public ThesisRecord setEeTitle(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.thesis.ee_title</code>.
     */
    public String getEeTitle() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.thesis.en_title</code>.
     */
    public ThesisRecord setEnTitle(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.thesis.en_title</code>.
     */
    public String getEnTitle() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.thesis.ee_description</code>.
     */
    public ThesisRecord setEeDescription(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.thesis.ee_description</code>.
     */
    public String getEeDescription() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.thesis.en_description</code>.
     */
    public ThesisRecord setEnDescription(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.thesis.en_description</code>.
     */
    public String getEnDescription() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.thesis.reg_time</code>.
     */
    public ThesisRecord setRegTime(Timestamp value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>public.thesis.reg_time</code>.
     */
    public Timestamp getRegTime() {
        return (Timestamp) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Long, String, Short, Short, Short, String, String, String, String, Timestamp> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Long, String, Short, Short, Short, String, String, String, String, Timestamp> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Thesis.THESIS.THESIS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Thesis.THESIS.SUPERVISOR_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return Thesis.THESIS.FACULTY_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field4() {
        return Thesis.THESIS.THESIS_STATE_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field5() {
        return Thesis.THESIS.DEGREE_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Thesis.THESIS.EE_TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Thesis.THESIS.EN_TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Thesis.THESIS.EE_DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Thesis.THESIS.EN_DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return Thesis.THESIS.REG_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getThesisId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getSupervisorName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value3() {
        return getFacultyCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value4() {
        return getThesisStateCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value5() {
        return getDegreeCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getEeTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getEnTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getEeDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getEnDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getRegTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThesisRecord value1(Long value) {
        setThesisId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThesisRecord value2(String value) {
        setSupervisorName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThesisRecord value3(Short value) {
        setFacultyCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThesisRecord value4(Short value) {
        setThesisStateCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThesisRecord value5(Short value) {
        setDegreeCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThesisRecord value6(String value) {
        setEeTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThesisRecord value7(String value) {
        setEnTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThesisRecord value8(String value) {
        setEeDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThesisRecord value9(String value) {
        setEnDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThesisRecord value10(Timestamp value) {
        setRegTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThesisRecord values(Long value1, String value2, Short value3, Short value4, Short value5, String value6, String value7, String value8, String value9, Timestamp value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ThesisRecord
     */
    public ThesisRecord() {
        super(Thesis.THESIS);
    }

    /**
     * Create a detached, initialised ThesisRecord
     */
    public ThesisRecord(Long thesisId, String supervisorName, Short facultyCode, Short thesisStateCode, Short degreeCode, String eeTitle, String enTitle, String eeDescription, String enDescription, Timestamp regTime) {
        super(Thesis.THESIS);

        set(0, thesisId);
        set(1, supervisorName);
        set(2, facultyCode);
        set(3, thesisStateCode);
        set(4, degreeCode);
        set(5, eeTitle);
        set(6, enTitle);
        set(7, eeDescription);
        set(8, enDescription);
        set(9, regTime);
    }
}
