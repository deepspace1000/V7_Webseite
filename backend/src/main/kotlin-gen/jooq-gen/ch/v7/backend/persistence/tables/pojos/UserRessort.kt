/*
 * This file is generated by jOOQ.
 */
package ch.v7.backend.persistence.tables.pojos


import java.io.Serializable


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
data class UserRessort(
    val userId: String,
    val ressortId: String
): Serializable {

    override fun equals(other: Any?): Boolean {
        if (this === other)
            return true
        if (other == null)
            return false
        if (this::class != other::class)
            return false
        val o: UserRessort = other as UserRessort
        if (this.userId != o.userId)
            return false
        if (this.ressortId != o.ressortId)
            return false
        return true
    }

    override fun hashCode(): Int {
        val prime = 31
        var result = 1
        result = prime * result + this.userId.hashCode()
        result = prime * result + this.ressortId.hashCode()
        return result
    }

    override fun toString(): String {
        val sb = StringBuilder("UserRessort (")

        sb.append(userId)
        sb.append(", ").append(ressortId)

        sb.append(")")
        return sb.toString()
    }
}
