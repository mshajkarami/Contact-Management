package ir.hajkarami.contactmanagement

import android.content.Context
import android.content.Intent
import android.view.View

class ActivityClickHandler (private val context: Context) {

    fun onFABClicked(view: View){
        val intent = Intent(view.context, NewNoteActivity::class.java)
        context.startActivity(intent)
    }
}