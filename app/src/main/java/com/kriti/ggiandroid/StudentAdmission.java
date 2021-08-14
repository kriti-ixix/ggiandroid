package com.kriti.ggiandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class StudentAdmission extends AppCompatActivity {

    EditText rollNoText, nameText;
    Button admissionButton;
    DBHelper dbHelper;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_admission);

        rollNoText = findViewById(R.id.rollNoText);
        nameText = findViewById(R.id.nameText);
        textView = findViewById(R.id.textView);
        admissionButton = findViewById(R.id.admissionButton);
        dbHelper = new DBHelper(this);

        admissionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int rollno = Integer.parseInt(rollNoText.getText().toString());
                String name = nameText.getText().toString();
                long res = dbHelper.addData(rollno, name);

                Log.d("Checking", String.valueOf(res));

                if (res == -1)
                {
                    //No rows were affected
                    textView.setText("Values not added");
                    Toast.makeText(StudentAdmission.this, "Values not added", Toast.LENGTH_LONG).show();
                }
                else
                {
                    //Some rows were affected
                    textView.setText("Values added");
                    Toast.makeText(StudentAdmission.this, "Values added", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}