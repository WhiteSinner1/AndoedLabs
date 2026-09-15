package com.example.labs123java;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Lab6Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab6);

        Button button = findViewById(R.id.buttonAnimate);
        TextView status = findViewById(R.id.textAnimationStatus);
        button.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this, R.anim.tween_anim);
            button.startAnimation(animation);
            status.setText("Анимация запущена");
        });
    }
}
