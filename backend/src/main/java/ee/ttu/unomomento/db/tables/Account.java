/*
 * This file is generated by jOOQ.
*/
package ee.ttu.unomomento.db.tables;


import ee.ttu.unomomento.db.Keys;
import ee.ttu.unomomento.db.Public;
import ee.ttu.unomomento.db.tables.records.AccountRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class Account extends TableImpl<AccountRecord> {

    private static final long serialVersionUID = -625302572;

    /**
     * The reference instance of <code>public.account</code>
     */
    public static final Account ACCOUNT = new Account();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AccountRecord> getRecordType() {
        return AccountRecord.class;
    }

    /**
     * The column <code>public.account.account_id</code>.
     */
    public final TableField<AccountRecord, Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('account_account_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.account.username</code>.
     */
    public final TableField<AccountRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>public.account.password</code>.
     */
    public final TableField<AccountRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR.length(72).nullable(false), this, "");

    /**
     * The column <code>public.account.email</code>.
     */
    public final TableField<AccountRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(256).nullable(false), this, "");

    /**
     * The column <code>public.account.account_state_code</code>.
     */
    public final TableField<AccountRecord, Short> ACCOUNT_STATE_CODE = createField("account_state_code", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * The column <code>public.account.account_role_code</code>.
     */
    public final TableField<AccountRecord, Short> ACCOUNT_ROLE_CODE = createField("account_role_code", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * The column <code>public.account.reg_time</code>.
     */
    public final TableField<AccountRecord, Timestamp> REG_TIME = createField("reg_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>public.account</code> table reference
     */
    public Account() {
        this("account", null);
    }

    /**
     * Create an aliased <code>public.account</code> table reference
     */
    public Account(String alias) {
        this(alias, ACCOUNT);
    }

    private Account(String alias, Table<AccountRecord> aliased) {
        this(alias, aliased, null);
    }

    private Account(String alias, Table<AccountRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
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
    public Identity<AccountRecord, Long> getIdentity() {
        return Keys.IDENTITY_ACCOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AccountRecord> getPrimaryKey() {
        return Keys.PK_ACCOUNT_ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AccountRecord>> getKeys() {
        return Arrays.<UniqueKey<AccountRecord>>asList(Keys.PK_ACCOUNT_ACCOUNT_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<AccountRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AccountRecord, ?>>asList(Keys.ACCOUNT__FK_ACCOUNT_ACCOUNT_STATE_CODE, Keys.ACCOUNT__FK_ACCOUNT_ACCOUNT_ROLE_CODE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Account as(String alias) {
        return new Account(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Account rename(String name) {
        return new Account(name, null);
    }
}
