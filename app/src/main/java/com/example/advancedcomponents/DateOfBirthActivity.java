package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class DateOfBirthActivity extends AppCompatActivity {
   public ArrayList<Integer> datesList;
   public ArrayList<String> monthsList;
   public ArrayList<Integer> yearsList;
   public Spinner dateSp;
   public Spinner monthSp;
   public Spinner yearSp;
   ArrayAdapter<Integer> arrayAdapter;
   ArrayAdapter<String> arrayAdapterString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_of_birth);
        getSupportActionBar().setTitle("Date Of Birth");
        setAddDate();
        setAddMonth();
        setAddYear();
        setDate();
        setMonth();
        setYear();
    }

    public void setAddDate() {
        datesList = new ArrayList<>();
        datesList.add(1);
        datesList.add(2);
        datesList.add(3);
        datesList.add(4);
        datesList.add(5);
        datesList.add(6);
        datesList.add(7);
        datesList.add(8);
        datesList.add(9);
        datesList.add(10);
        datesList.add(11);
        datesList.add(12);
        datesList.add(13);
        datesList.add(14);
        datesList.add(15);
        datesList.add(16);
        datesList.add(17);
        datesList.add(18);
        datesList.add(19);
        datesList.add(20);
        datesList.add(21);
        datesList.add(22);
        datesList.add(23);
        datesList.add(24);
        datesList.add(25);
        datesList.add(26);
        datesList.add(27);
        datesList.add(28);
        datesList.add(29);
        datesList.add(30);
        datesList.add(31);
    }

    public void setAddMonth() {
        monthsList = new ArrayList<>();
        monthsList.add("January");
        monthsList.add("May");
        monthsList.add("June");
        monthsList.add("February");
        monthsList.add("March");
        monthsList.add("April");
        monthsList.add("July");
        monthsList.add("August");
        monthsList.add("September");
        monthsList.add("October");
        monthsList.add("November");
        monthsList.add("December");
    }

    public void setAddYear() {
        yearsList = new ArrayList<>();
        yearsList.add(1970);
        yearsList.add(1971);
        yearsList.add(1972);
        yearsList.add(1973);
        yearsList.add(1974);
        yearsList.add(1975);
        yearsList.add(1976);
        yearsList.add(1977);
        yearsList.add(1978);
        yearsList.add(1979);
        yearsList.add(1980);
        yearsList.add(1981);
        yearsList.add(1982);
        yearsList.add(1983);
        yearsList.add(1984);
        yearsList.add(1985);
        yearsList.add(1986);
        yearsList.add(1987);
        yearsList.add(1988);
        yearsList.add(1989);
        yearsList.add(1990);
        yearsList.add(1991);
        yearsList.add(1992);
        yearsList.add(1993);
        yearsList.add(1994);
        yearsList.add(1995);
        yearsList.add(1996);
        yearsList.add(1997);
        yearsList.add(1998);
        yearsList.add(1999);
        yearsList.add(2000);
        yearsList.add(2001);
        yearsList.add(2002);
        yearsList.add(2003);
        yearsList.add(2004);
        yearsList.add(2005);
        yearsList.add(2006);
        yearsList.add(2007);
        yearsList.add(2008);
        yearsList.add(2009);
        yearsList.add(2010);
        yearsList.add(2011);
        yearsList.add(2012);
        yearsList.add(2013);
        yearsList.add(2014);
        yearsList.add(2015);
        yearsList.add(2016);
        yearsList.add(2017);
        yearsList.add(2018);
        yearsList.add(2019);
        yearsList.add(2020);
        yearsList.add(2021);
        yearsList.add(2022);
    }

    public void setDate() {
       dateSp = findViewById(R.id.date_sp);
       arrayAdapter = new ArrayAdapter<Integer>(this,
                      android.R.layout.simple_list_item_1, datesList);
       dateSp.setAdapter(arrayAdapter);
       dateSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
               Toast.makeText(DateOfBirthActivity.this,
                       "Date : "+ datesList.get(position), Toast.LENGTH_SHORT).show();
           }

           @Override
           public void onNothingSelected(AdapterView<?> adapterView) {

           }
       });
    }

    public void setMonth() {
        monthSp = findViewById(R.id.month_sp);
        arrayAdapterString = new ArrayAdapter<String>(this, R.layout.uppercase_xml2, monthsList);
        monthSp.setAdapter(arrayAdapterString);
        monthSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(DateOfBirthActivity.this,
                        "Month : "+ monthsList.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    public void setYear() {
        yearSp = findViewById(R.id.year_sp);
        arrayAdapter = new ArrayAdapter<Integer>(this,
                       android.R.layout.simple_list_item_1, yearsList);
        yearSp.setAdapter(arrayAdapter);
        yearSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(DateOfBirthActivity.this,
                        "Year : "+ yearsList.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}