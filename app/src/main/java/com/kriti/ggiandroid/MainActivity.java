package com.kriti.ggiandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/*
1. Register the components by their id
2. Action to be performed by the button
 */

public class MainActivity extends AppCompatActivity {

    EditText editText; TextView textView; Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //Register the components
        editText = findViewById(R.id.userName);
        textView = findViewById(R.id.textViewName);
        button = findViewById(R.id.buttonName);

        //What will happen when the button is clicked
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editText.getText().toString();
                textView.setText(name);
            }
        });
    }
}