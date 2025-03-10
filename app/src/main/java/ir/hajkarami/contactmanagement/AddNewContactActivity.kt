package ir.hajkarami.contactmanagement

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import ir.hajkarami.contactmanagement.databinding.ActivityContactNewAddBinding

class AddNewContactActivity : AppCompatActivity() {

    private lateinit var binding: ActivityContactNewAddBinding

    private lateinit var  contacts: Contact



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = DataBindingUtil.setContentView(this, R.layout.activity_contact_new_add)
        binding.apply {
            clickHandler = AddNewContactClickHandler(contact,this@AddNewContactActivity)
            contact = contacts
        }

    }
}