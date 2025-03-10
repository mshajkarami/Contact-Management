package ir.hajkarami.contactmanagement

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ir.hajkarami.contactmanagement.databinding.ActivityMainBinding
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    // Data Source
    private var contactDatabase: ContactsDatabase? = null
    private val contacts: ArrayList<Contact> = ArrayList()

    // adapter
    private var adapter: MyAdapter? = null

    //Binding
    private lateinit var mainBinding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mainBinding.apply {
            this.clickHandler = ActivityClickHandler(this@MainActivity)
         }

        // RecyclerView
        val recyclerView : RecyclerView = mainBinding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)


        // Adapter
        adapter = MyAdapter(contacts)
        recyclerView.adapter = adapter


        //DataBase
        contactDatabase = ContactsDatabase.getInstance(this)

        //ViewModel
        val viewModel : MyViewModel = ViewModelProvider(this)[MyViewModel::class.java]

        // insert data to database
        viewModel.addNewContact(Contact(1, "ali", "ali@gmail.com"))

        // Loading the Data from Room DB
        lifecycleScope.launch {
            viewModel.allContact.collect {contacts ->
                adapter?.setContacts(ArrayList(contacts))
            }
        }



    }
}