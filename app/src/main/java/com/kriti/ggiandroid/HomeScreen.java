package com.kriti.ggiandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class HomeScreen extends AppCompatActivity {

    TextView userTextView, resultTextView;
    EditText guessEditText;
    Button guessButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        userTextView = findViewById(R.id.userTextView);
        resultTextView = findViewById(R.id.resultTextView);
        guessEditText = findViewById(R.id.guessEditText);
        guessButton = findViewById(R.id.guessButton);

        Intent in = getIntent();
        String playerName = in.getStringExtra("name");
        userTextView.setText("Welcome " + playerName + "!");

        Random random = new Random();
        int number = random.nextInt(11);

        guessButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int guess = Integer.parseInt(guessEditText.getText().toString());

                if (guess == number)
                {
                    resultTextView.setText("Congratulations! Your guess was correct!");
                }
                else if (guess > number)
                {
                    resultTextView.setText("Your guess was too high!");
                }
                else if (guess < number)
                {
                    resultTextView.setText("Your guess was too low!");
                }

            }
        });

    }
}