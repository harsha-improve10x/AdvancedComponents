package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ContactsListActivity extends AppCompatActivity {
    public ArrayList<Contacts> contacts;
    public ListView contactsLv;
    ContactAdapter contactAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts_list);
        getSupportActionBar().setTitle("Contacts");
        setContactsData();
        setContactsLv();
    }

    public void setContactsData() {
        contacts = new ArrayList<>();
        Contacts vissu = new Contacts();
        vissu.name = "Viswanath";
        vissu.phoneNumber = "+91 9000540052";
        contacts.add(vissu);

        Contacts renu = new Contacts();
        renu.name = "Renuka";
        renu.phoneNumber = "+91 9886655979";
        contacts.add(renu);

        Contacts harsha = new Contacts();
        harsha.name = "ShreeHarsha A";
        harsha.phoneNumber = "+91 6363396453";
        contacts.add(harsha);
    }

    public void setContactsLv() {
        contactsLv = findViewById(R.id.contacts_lv);
         contactAdapter = new ContactAdapter(this,R.layout.contact_list_view_item,contacts);
         contactsLv.setAdapter(contactAdapter);
    }
}