package ir.hajkarami.contactmanagement

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class ContactsRepository(private val contactsDAO: ContactsDAO) {

    val allContacts: Flow<List<Contact>> = contactsDAO.getAllContacts().map { entities ->
        entities.map { entity ->
            Contact(
                id = entity.id,
                name = entity.name,
                email = entity.email
            )
        }
    }

    suspend fun insert(contact: Contact) {
        val entity = ContactsEntity(
            id = contact.id,
            name = contact.name,
            email = contact.email
        )
        contactsDAO.insert(entity)
    }

    suspend fun delete(contact: Contact) {
        val entity = ContactsEntity(
            id = contact.id,
            name = contact.name,
            email = contact.email
        )
        contactsDAO.delete(entity)
    }
}
