package ir.hajkarami.contactmanagement

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import ir.hajkarami.contactmanagement.databinding.ActivityContactNewAddBinding

class AddNewContactActivity : AppCompatActivity() {

    private lateinit var binding: ActivityContactNewAddBinding

    private var contacts: Contact = Contact(0, "", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = DataBindingUtil.setContentView(this, R.layout.activity_contact_new_add)

        val viewModel: MyViewModel = ViewModelProvider(this)[MyViewModel::class.java]


        binding.apply {
            contact = contacts
            clickHandler =
                AddNewContactClickHandler(contacts, this@AddNewContactActivity, viewModel)
        }
    }
}
