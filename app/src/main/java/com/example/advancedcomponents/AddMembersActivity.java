package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class AddMembersActivity extends AppCompatActivity {
    public ArrayList<String> team;
    public ArrayList<String> allMembers;
    public ArrayList<String> teamA;
    public ArrayList<String> teamB;
    public Spinner teamSp;
    public Spinner allMembersSp;
    public Spinner teamASp;
    public Spinner teamBSp;
   public ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_members);
        getSupportActionBar().setTitle("Add Members");
        setAddTeam();
        setAddMembers();
        setAddTeamA();
        setAddTeamB();
        setTeam();
        setAllMembers();
        setTeamA();
        setTeamB();
    }
    public void setAddTeam() {
        team = new ArrayList<>();
        team.add("Team A");
        team.add("Team B");
    }
    public void setAddMembers() {
        allMembers = new ArrayList<>();
        allMembers.add("Viswanath");
        allMembers.add("Renuka");
    }
    public void setAddTeamA() {
        teamA = new ArrayList<>();
        teamA.add("Viswanath");
        teamA.add("Renuka");
    }
    public void setAddTeamB() {
        teamB = new ArrayList<>();
        teamB.add("Viswanath");
        teamB.add("Renuka");
    }

    public void setTeam() {
        teamSp = findViewById(R.id.team_select_sp);
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, team);
        teamSp.setAdapter(arrayAdapter);
        teamSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(AddMembersActivity.this,
                        "Team : " + team.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    public void setAllMembers() {
        allMembersSp = findViewById(R.id.allMembers_sp);
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, allMembers);
        allMembersSp.setAdapter(arrayAdapter);
        allMembersSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(AddMembersActivity.this,
                        "Members : " + allMembers.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    public void setTeamA() {
        teamASp = findViewById(R.id.team_a_sp);
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, teamA);
        teamASp.setAdapter(arrayAdapter);
        teamASp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(AddMembersActivity.this,
                        "Team A : " + teamA.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void setTeamB() {
        teamBSp = findViewById(R.id.team_b_sp);
        arrayAdapter = new ArrayAdapter<String>(this,
                       android.R.layout.simple_list_item_1, teamB);
        teamBSp.setAdapter(arrayAdapter);
        teamBSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(AddMembersActivity.this,
                        "Team B : " + teamB.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}