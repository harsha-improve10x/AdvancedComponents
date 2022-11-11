package com.example.advancedcomponents;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ContactAdapter extends ArrayAdapter<Contacts>{
    public ContactAdapter(@NonNull Context context, int resource, @NonNull List<Contacts> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.contact_list_view_item,parent,false);
        Contacts contacts = getItem(position);
        TextView nameTxt = view.findViewById(R.id.name_txt);
        nameTxt.setText(contacts.name);

        TextView phoneNumberTxt = view.findViewById(R.id.number_txt);
        phoneNumberTxt.setText(contacts.phoneNumber);
        return view;
    }
}