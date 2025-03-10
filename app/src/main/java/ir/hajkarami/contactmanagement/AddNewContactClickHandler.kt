package ir.hajkarami.contactmanagement

import android.content.Context
import android.content.Intent
import android.view.View
import android.widget.Toast

class AddNewContactClickHandler(
    private val contact: Contact,
    private val context: Context,
    private val viewModel: MyViewModel
) {
    fun onSubmitClicked(view: View) {
        if (contact.name.isNullOrBlank() || contact.email.isNullOrBlank()) {
            Toast.makeText(context, context.getString(R.string.empty_fields_error), Toast.LENGTH_SHORT).show()
        } else {
            val intent = Intent(context, MainActivity::class.java).apply {
                putExtra("Name", contact.name)
                putExtra("Email", contact.email)
            }
            viewModel.addNewContact(contact)
            context.startActivity(intent)
        }
    }
}
