/*
 * This file is generated by jOOQ.
*/
package ee.ttu.unomomento.db.tables;


import ee.ttu.unomomento.db.Keys;
import ee.ttu.unomomento.db.Public;
import ee.ttu.unomomento.db.tables.records.ThesisStateRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * 1 -- Active, 2 - Inactive, 3 - Reserved
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ThesisState extends TableImpl<ThesisStateRecord> {

    private static final long serialVersionUID = -899713647;

    /**
     * The reference instance of <code>public.thesis_state</code>
     */
    public static final ThesisState THESIS_STATE = new ThesisState();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ThesisStateRecord> getRecordType() {
        return ThesisStateRecord.class;
    }

    /**
     * The column <code>public.thesis_state.thesis_state_code</code>.
     */
    public final TableField<ThesisStateRecord, Short> THESIS_STATE_CODE = createField("thesis_state_code", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>public.thesis_state.ee_name</code>.
     */
    public final TableField<ThesisStateRecord, String> EE_NAME = createField("ee_name", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>public.thesis_state.en_name</code>.
     */
    public final TableField<ThesisStateRecord, String> EN_NAME = createField("en_name", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * Create a <code>public.thesis_state</code> table reference
     */
    public ThesisState() {
        this("thesis_state", null);
    }

    /**
     * Create an aliased <code>public.thesis_state</code> table reference
     */
    public ThesisState(String alias) {
        this(alias, THESIS_STATE);
    }

    private ThesisState(String alias, Table<ThesisStateRecord> aliased) {
        this(alias, aliased, null);
    }

    private ThesisState(String alias, Table<ThesisStateRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "1 -- Active, 2 - Inactive, 3 - Reserved");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ThesisStateRecord> getPrimaryKey() {
        return Keys.PK_THESIS_STATE_THESIS_STATE_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ThesisStateRecord>> getKeys() {
        return Arrays.<UniqueKey<ThesisStateRecord>>asList(Keys.PK_THESIS_STATE_THESIS_STATE_CODE, Keys.AK_THESIS_STATE_EE_NAME, Keys.AK_THESIS_STATE_EN_NAME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThesisState as(String alias) {
        return new ThesisState(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ThesisState rename(String name) {
        return new ThesisState(name, null);
    }
}
