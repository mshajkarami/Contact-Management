package ir.hajkarami.contactmanagement

import android.provider.ContactsContract.Contacts
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ir.hajkarami.contactmanagement.databinding.ContactListItemBinding

class MyAdapter() :
    RecyclerView.Adapter<MyAdapter.ContactViewHolder>() {



    class ContactViewHolder(private val binding: ContactListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

}