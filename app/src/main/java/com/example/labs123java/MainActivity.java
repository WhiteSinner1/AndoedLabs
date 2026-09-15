package com.example.labs123java;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button lab1 = findViewById(R.id.buttonLab1);
        Button lab2 = findViewById(R.id.buttonLab2);
        Button lab3 = findViewById(R.id.buttonLab3);
        Button lab4 = findViewById(R.id.buttonLab4);
        Button lab5 = findViewById(R.id.buttonLab5);
        Button lab6 = findViewById(R.id.buttonLab6);
        lab1.setOnClickListener(v -> startActivity(new Intent(this, Lab1Activity.class)));
        lab2.setOnClickListener(v -> startActivity(new Intent(this, Lab2Activity.class)));
        lab3.setOnClickListener(v -> startActivity(new Intent(this, Lab3Activity.class)));
        lab4.setOnClickListener(v -> startActivity(new Intent(this, Lab4Activity.class)));
        lab5.setOnClickListener(v -> startActivity(new Intent(this, Lab5Activity.class)));
        lab6.setOnClickListener(v -> startActivity(new Intent(this, Lab6Activity.class)));
    }
}
