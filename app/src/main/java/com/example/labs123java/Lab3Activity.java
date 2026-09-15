package com.example.labs123java;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class Lab3Activity extends AppCompatActivity {
    public static final String EXTRA_TEXT = "text2remember";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3);
        EditText input = findViewById(R.id.editTextLab3);
        Button next = findViewById(R.id.buttonNext);
        next.setOnClickListener(v -> {
            Intent intent = new Intent(Lab3Activity.this, SecondActivity.class);
            intent.putExtra(EXTRA_TEXT, input.getText().toString());
            startActivity(intent);
        });
    }
}