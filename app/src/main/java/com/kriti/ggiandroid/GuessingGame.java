package com.kriti.ggiandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GuessingGame extends AppCompatActivity {

    EditText playerNameText;
    Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guessing_game);

        playerNameText = findViewById(R.id.playerNameText);
        startButton = findViewById(R.id.startButton);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String playerName = playerNameText.getText().toString();
                Intent intent = new Intent(GuessingGame.this, HomeScreen.class);
                intent.putExtra("name", playerName);
                startActivity(intent);
            }
        });
    }
}