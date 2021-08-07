package com.kriti.ggiandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SubjectsList extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects_list);

        listView = findViewById(R.id.subjectsListView);
        String[] subjects = {"JAVA", "C", "C++", "Python", "Web Development", "DBMS"};

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, subjects);
        listView.setAdapter(adapter);
    }
}