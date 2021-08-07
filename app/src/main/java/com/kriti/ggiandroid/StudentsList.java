package com.kriti.ggiandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class StudentsList extends AppCompatActivity {

    ListView listView; ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students_list);

        listView = findViewById(R.id.studentList);
        String[] students = {"ABC", "XYZ", "PQR", "JKL", "GHI"};

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, students);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value = students[i];
                Toast.makeText(StudentsList.this, value, Toast.LENGTH_SHORT).show();
            }
        });
    }
}