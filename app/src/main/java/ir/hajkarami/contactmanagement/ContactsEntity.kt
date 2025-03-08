package ir.hajkarami.contactmanagement

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "contacts_table")
class ContactsEntity(contacts: Contacts) {



    @ColumnInfo(name = "contact_id")
    @PrimaryKey(autoGenerate = true)
    private val id: Int = contacts.id

    @ColumnInfo(name = "contact_name")
    private val name: String = contacts.name

    @ColumnInfo(name = "contact_email")
    private val email: String = contacts.email

}