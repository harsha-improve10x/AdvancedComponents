package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button luckyNumber;
    Button location;
    Button dateOfBirth;
    Button team;
    Button teamList;
    Button contacts;
    Button addMember;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Home");
        luckyNumber = findViewById(R.id.luckyNumber_btn);
        location = findViewById(R.id.location_btn);
        dateOfBirth = findViewById(R.id.date_of_birth_btn);
        team = findViewById(R.id.team_btn);
        teamList = findViewById(R.id.team_list_btn);
        contacts = findViewById(R.id.contacts_button_btn);
        addMember = findViewById(R.id.addMember_btn);
        setLuckyNumberBtn();
        setLocationBtn();
        setDateOfBirth();
        setTeam();
        setTeamList();
        setContacts();
        setAddMembers();
    }

    public void setLuckyNumberBtn() {
        luckyNumber.setOnClickListener(view -> {
            Intent intent = new Intent(this, LuckyNumberActivity.class);
            startActivity(intent);
        });
    }

    public void setLocationBtn() {
        location.setOnClickListener(view -> {
            Intent intent = new Intent(this, LocationActivity.class);
            startActivity(intent);
        });
    }

    public void setDateOfBirth() {
        dateOfBirth.setOnClickListener(view -> {
            Intent intent = new Intent(this, DateOfBirthActivity.class);
            startActivity(intent);
        });
    }

    public void setTeam() {
        team.setOnClickListener(view -> {
            Intent intent = new Intent(this, TeamActivity.class);
            startActivity(intent);
        });
    }

    public void setTeamList() {
        teamList.setOnClickListener(view -> {
            Intent intent = new Intent(this, TeamListActivity.class);
            startActivity(intent);
        });
    }

    public void setContacts() {
        contacts.setOnClickListener(view -> {
            Intent intent = new Intent(this, ContactsListActivity.class);
            startActivity(intent);
        });
    }

    public void setAddMembers() {
        addMember.setOnClickListener(view -> {
            Intent intent = new Intent(this, AddMembersActivity.class);
            startActivity(intent);
        });
    }
}