/*
 * This file is generated by jOOQ.
 */
package ch.v7.backend.persistence.tables


import ch.v7.backend.persistence.Backend
import ch.v7.backend.persistence.keys.KEY_T_RESSORT_PRIMARY
import ch.v7.backend.persistence.tables.records.RessortRecord

import java.util.UUID
import java.util.function.Function

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row3
import org.jooq.Schema
import org.jooq.SelectField
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.impl.AutoConverter
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class RessortTable(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, RessortRecord>?,
    aliased: Table<RessortRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<RessortRecord>(
    alias,
    Backend.BACKEND,
    child,
    path,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table()
) {
    companion object {

        /**
         * The reference instance of <code>backend.t_ressort</code>
         */
        val RESSORT: RessortTable = RessortTable()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<RessortRecord> = RessortRecord::class.java

    /**
     * The column <code>backend.t_ressort.id</code>.
     */
    val ID: TableField<RessortRecord, UUID?> = createField(DSL.name("id"), SQLDataType.CHAR(36).nullable(false), this, "", AutoConverter<String, UUID>(String::class.java, UUID::class.java))

    /**
     * The column <code>backend.t_ressort.name</code>.
     */
    val NAME: TableField<RessortRecord, String?> = createField(DSL.name("name"), SQLDataType.VARCHAR(255).nullable(false), this, "")

    /**
     * The column <code>backend.t_ressort.description</code>.
     */
    val DESCRIPTION: TableField<RessortRecord, String?> = createField(DSL.name("description"), SQLDataType.VARCHAR(255).defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.VARCHAR)), this, "")

    private constructor(alias: Name, aliased: Table<RessortRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<RessortRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>backend.t_ressort</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>backend.t_ressort</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>backend.t_ressort</code> table reference
     */
    constructor(): this(DSL.name("t_ressort"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, RessortRecord>): this(Internal.createPathAlias(child, key), child, key, RESSORT, null)
    override fun getSchema(): Schema? = if (aliased()) null else Backend.BACKEND
    override fun getPrimaryKey(): UniqueKey<RessortRecord> = KEY_T_RESSORT_PRIMARY
    override fun `as`(alias: String): RessortTable = RessortTable(DSL.name(alias), this)
    override fun `as`(alias: Name): RessortTable = RessortTable(alias, this)
    override fun `as`(alias: Table<*>): RessortTable = RessortTable(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): RessortTable = RessortTable(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): RessortTable = RessortTable(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): RessortTable = RessortTable(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row3<UUID?, String?, String?> = super.fieldsRow() as Row3<UUID?, String?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (UUID?, String?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (UUID?, String?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
