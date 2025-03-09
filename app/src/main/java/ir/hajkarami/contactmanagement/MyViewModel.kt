package ir.hajkarami.contactmanagement

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch


class MyViewModel(private val repository: ContactsRepository) : ViewModel() {

    val allContact: Flow<List<Contact>> = repository.allContacts

    fun addNewContact(contact: Contact) {
        viewModelScope.launch {
            repository.insert(contact)
        }
    }

    fun deleteContact(contact: Contact) {
        viewModelScope.launch {
            repository.delete(contact)
        }
    }
}