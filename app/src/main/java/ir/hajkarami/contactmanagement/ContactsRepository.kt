package ir.hajkarami.contactmanagement

import android.app.Application
import kotlinx.coroutines.flow.Flow

class ContactsRepository(private val contactsDAO: ContactsDAO) {
    val allContacts: Flow<List<Contact>> = contactsDAO.getAllContacts()

    suspend fun insert(contact: Contact) {
        contactsDAO.insert(contact)
    }

    suspend fun delete(contact: Contact) {
        contactsDAO.delete(contact)
    }
}