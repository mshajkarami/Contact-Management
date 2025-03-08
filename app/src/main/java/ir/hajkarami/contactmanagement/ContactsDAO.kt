package ir.hajkarami.contactmanagement

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query


@Dao
interface ContactsDAO {

    @Insert
    fun insert(contacts: Contacts) {
    }

    @Delete
    fun delete(contacts: Contacts) {
    }

    @Query("SELECT * FROM contacts_table")
    fun getAllContacts(): LiveData<List<Contacts>>

}