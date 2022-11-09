package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class LocationActivity extends AppCompatActivity {
    public ArrayList<String> statesList;
    public Spinner locationSp;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        getSupportActionBar().setTitle("Location");
        setAddData();
        setLocations();
    }

    public void setAddData() {
        statesList = new ArrayList<>();
        statesList.add("Andra Pradesh");
        statesList.add("Arunachal Pradesh");
        statesList.add("Assam");
        statesList.add("Bihar");
        statesList.add("Chhattisgarh");
        statesList.add("Goa");
        statesList.add("Gujarat");
        statesList.add("Haryana");
        statesList.add("Himachal Pradesh");
        statesList.add("Jammu & Kashmir");
        statesList.add("Jharkhand");
        statesList.add("Karnataka");
        statesList.add("Kerala");
        statesList.add("Madhya Pradesh");
        statesList.add("Maharashtra");
        statesList.add("Manipur");
        statesList.add("Meghalaya");
        statesList.add("Mizoram");
        statesList.add("Nagaland");
        statesList.add("Odisha");
        statesList.add("Punjab");
        statesList.add("Rajasthan");
        statesList.add("Sikkim");
        statesList.add("Tamil Nadu");
        statesList.add("Telangana");
        statesList.add("Tripura");
        statesList.add("UttarPradesh");
        statesList.add("Uttarakhand");
        statesList.add("West Bengal");
    }

    public void setLocations() {
        locationSp = findViewById(R.id.location_sp);
        arrayAdapter = new ArrayAdapter<String>(this, R.layout.uppercase_xml, statesList);
        locationSp.setAdapter(arrayAdapter);
        locationSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(LocationActivity.this, "Location : "+ statesList.get(position), Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }
}
