package ir.hajkarami.contactmanagement

import android.content.Context
import android.content.Intent
import android.view.View
import android.widget.Toast

class AddNewContactClickHandler(val contact: Contact, val context: Context,val viewModel: MyViewModel) {
    fun onSubmitClicked(view: View) {

        if (contact.name == null || contact.email == null)
            Toast.makeText(context, "Fields Cannot be empty", Toast.LENGTH_LONG).show()
        else {
            val intent = Intent(context, MainActivity::class.java)
            intent.putExtra("Name", contact.name)
            intent.putExtra("Email", contact.email)
            val c = Contact(contact.id, contact.name, contact.email)
            viewModel.addNewContact(c)
            context.startActivity(intent)
        }
    }
}