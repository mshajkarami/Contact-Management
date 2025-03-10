package ir.hajkarami.contactmanagement

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import ir.hajkarami.contactmanagement.databinding.ContactListItemBinding

class MyAdapter(private var contacts: List<Contact>) :
    RecyclerView.Adapter<MyAdapter.ContactViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val contactListItemBinding: ContactListItemBinding =
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.contact_list_item,
                parent,
                false
            )
        return ContactViewHolder(contactListItemBinding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val contact = contacts[position]
        holder.contactListItemBinding.contact = contact
    }

    override fun getItemCount(): Int = contacts.size

    fun setContacts(newContacts: List<Contact>) {
        contacts = newContacts
        notifyDataSetChanged()
    }



    class ContactViewHolder(val contactListItemBinding: ContactListItemBinding) :
        RecyclerView.ViewHolder(contactListItemBinding.root)

}