package ir.hajkarami.contactmanagement

import android.content.Context
import android.content.Intent
import android.view.View

class ActivityClickHandler(private val context: Context) {

    fun onFABClicked(view: View) {
        val intent = Intent(context, AddNewContactActivity::class.java)
        context.startActivity(intent)
    }
}
