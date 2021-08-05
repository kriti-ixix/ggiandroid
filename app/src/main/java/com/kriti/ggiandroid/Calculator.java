package com.kriti.ggiandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity implements View.OnClickListener {

    //Press Alt + Enter to import a class
    EditText first, second;
    Button add, sub, mul, div;
    TextView outputTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        first = findViewById(R.id.firstEditText);
        second = findViewById(R.id.secondEditText);
        add = findViewById(R.id.addButton);
        sub = findViewById(R.id.subButton);
        mul = findViewById(R.id.mulButton);
        div = findViewById(R.id.divButton);
        outputTextView = findViewById(R.id.outputTextView);

        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Double firstNumber = Double.parseDouble(first.getText().toString());
        Double secondNumber = Double.parseDouble(second.getText().toString());

        int id = view.getId();

        if (id == R.id.addButton)
        {
            Double sum = firstNumber + secondNumber;
            outputTextView.setText(String.valueOf(sum));
        }
        else if (id == R.id.subButton)
        {
            Double difference = firstNumber - secondNumber;
            outputTextView.setText(String.valueOf(difference));
        }
        else if (id == R.id.mulButton)
        {
            Double product = firstNumber * secondNumber;
            outputTextView.setText(String.valueOf(product));
        }
        else if (id == R.id.divButton)
        {
            Double quotient = firstNumber / secondNumber;
            outputTextView.setText(String.valueOf(quotient));
        }
    }
}