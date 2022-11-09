package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class TeamActivity extends AppCompatActivity {
    public ArrayList<String> nameList;
    public Spinner teamMembersSp;
    public ArrayAdapter<String> arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);
        getSupportActionBar().setTitle("Team");
        setData();
        setTeamMembers();
        handleAdd();
    }

    public void handleAdd() {
        Button addBtn = findViewById(R.id.addteam_btn);
        addBtn.setOnClickListener(view -> {
            EditText nameTxt = findViewById(R.id.enterName_txt);
            String name = nameTxt.getText().toString();
            if (name.equals("") == false) {
                arrayAdapter.add(name);
                arrayAdapter.notifyDataSetChanged();
            }
            nameTxt.setText("");
        });
    }

    public void setData() {
        nameList = new ArrayList<>();
        nameList.add("Viswanath");
        nameList.add("Renuka");
    }

    public void setTeamMembers() {
        teamMembersSp = findViewById(R.id.name_sp);
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nameList);
        teamMembersSp.setAdapter(arrayAdapter);
        teamMembersSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(TeamActivity.this,
                        "Team Members : " + nameList.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}