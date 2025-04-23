package com.example.quizzapp_mouatassim;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Welcomepage extends AppCompatActivity {
    Button bStart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_welcomepage);
        bStart=(Button) findViewById(R.id.bStart);
        bStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(Welcomepage.this, Quiz1.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.exit, R.anim.entry);
                    finish();
            }
        });
    }
}