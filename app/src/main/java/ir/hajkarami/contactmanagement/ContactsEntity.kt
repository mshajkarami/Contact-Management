package ir.hajkarami.contactmanagement

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "contacts_table")
data class ContactsEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo(name = "contact_name") val name: String,
    @ColumnInfo(name = "contact_email") val email: String
) {
    constructor(contact: Contact) : this(
        id = contact.id,
        name = contact.name,
        email = contact.email
    )
}
