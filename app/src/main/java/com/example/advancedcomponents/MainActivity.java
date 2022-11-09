package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button luckyNumber;
    Button location;
    Button dateOfBirth;
    Button team;
    Button addMember;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Home");
        luckyNumber = findViewById(R.id.luckyNumber_btn);
        location = findViewById(R.id.location_btn);
        dateOfBirth = findViewById(R.id.date_of_birth_btn);
        team = findViewById(R.id.team_btn);
        addMember = findViewById(R.id.addMember_btn);
        setLuckyNumberBtn();
        setLocationBtn();
        setDateOfBirth();
        setTeam();
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

    public void setAddMembers() {
        addMember.setOnClickListener(view -> {
            Intent intent = new Intent(this, AddMembersActivity.class);
            startActivity(intent);
        });
    }
}