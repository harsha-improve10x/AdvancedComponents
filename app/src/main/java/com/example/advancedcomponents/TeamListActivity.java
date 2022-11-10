package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class TeamListActivity extends AppCompatActivity {
    public ArrayList<String> teamList;
    public ListView teamListLv;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_list);
        getSupportActionBar().setTitle("Team List");
        setTeamListLv();
        setTeamList();
        handleAdd();
        handleDelete();
    }

    public void handleDelete() {
        Button deleteListBtn = findViewById(R.id.delete_list_btn);
        deleteListBtn.setOnClickListener(view -> {
            EditText memberTxt = findViewById(R.id.member_txt);
            String name = memberTxt.getText().toString();
            arrayAdapter.remove(name);
            arrayAdapter.notifyDataSetChanged();
            memberTxt.setText("");
        });
    }

    public void handleAdd() {
        Button addTeamListBtn = findViewById(R.id.add_team_list_btn);
        addTeamListBtn.setOnClickListener(view -> {
            EditText memberTxt = findViewById(R.id.member_txt);
            String name = memberTxt.getText().toString();
            if (name.equals("") == false) {
                arrayAdapter.add(name);
                arrayAdapter.notifyDataSetChanged();
            }
            memberTxt.setText("");
        });
    }

    public void setTeamListLv() {
        teamList = new ArrayList<>();
        teamList.add("Viswanath");
        teamList.add("Renuka");
    }

    public void setTeamList() {
        teamListLv = findViewById(R.id.list_listView);
        arrayAdapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, teamList);
        teamListLv.setAdapter(arrayAdapter);
        teamListLv.setOnItemClickListener((adapterView, view, position, l) -> {
            Toast.makeText(
                    this, "Clicked : " + teamList.get(position), Toast.LENGTH_SHORT).show();
            String member = teamList.get(position);
            EditText memberTxt = findViewById(R.id.member_txt);
            memberTxt.setText(member);
        });
    }
}