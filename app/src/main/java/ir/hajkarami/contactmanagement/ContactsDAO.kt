package ir.hajkarami.contactmanagement

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


@Dao
interface ContactsDAO {

    @Insert
    fun insert(contact: Contact) {
    }

    @Delete
    fun delete(contact: Contact) {
    }

    @Query("SELECT * FROM contacts_table")
    fun getAllContacts(): Flow<List<Contact>>

}