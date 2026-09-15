package com.example.labs123java;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView entered = findViewById(R.id.textViewEntered);
        String value = getIntent().getStringExtra(Lab3Activity.EXTRA_TEXT);
        entered.setText(value == null || value.trim().isEmpty() ? "(пусто)" : value);
        Button back = findViewById(R.id.buttonBack);
        back.setOnClickListener(v -> finish());
    }
}
