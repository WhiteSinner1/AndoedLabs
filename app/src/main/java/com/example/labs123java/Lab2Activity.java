package com.example.labs123java;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Lab2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab2);
        EditText editText = findViewById(R.id.editTextName);
        TextView result = findViewById(R.id.textViewResult);
        Button send = findViewById(R.id.buttonSend);
        send.setOnClickListener(v -> {
            String name = editText.getText().toString().trim();
            result.setText(name.isEmpty() ? "" : "Привет, " + name + "!");
        });
    }
}
