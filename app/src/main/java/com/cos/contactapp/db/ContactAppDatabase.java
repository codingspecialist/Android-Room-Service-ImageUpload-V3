package com.cos.contactapp.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.cos.contactapp.db.model.Contact;
import com.cos.contactapp.repository.ContactRepository;

@Database(entities = {Contact.class}, version = 2)
public abstract class ContactAppDatabase extends RoomDatabase {
    public abstract ContactRepository contactRepository();
}
