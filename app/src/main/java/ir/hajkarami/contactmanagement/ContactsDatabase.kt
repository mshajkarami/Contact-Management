package ir.hajkarami.contactmanagement

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [ContactsEntity::class], version = 1)
abstract class ContactsDatabase : RoomDatabase() {

    abstract fun getContactsDAO(): ContactsDAO

    companion object {
        private var dbInstance: ContactsDatabase? = null

        fun getInstance(context: Context): ContactsDatabase {
            if (dbInstance == null) {
                synchronized(ContactsDatabase::class.java) {
                    if (dbInstance == null) {
                        dbInstance = Room.databaseBuilder(
                            context.applicationContext,
                            ContactsDatabase::class.java,
                            "contacts_db"
                        )
                            .fallbackToDestructiveMigration()
                            .build()
                    }
                }
            }
            return dbInstance!!
        }
    }
}