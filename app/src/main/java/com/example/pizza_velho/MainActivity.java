package com.example.pizzariadose;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnCardapio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCardapio = findViewById(R.id.btnCardapio);

        btnCardapio.setOnClickListener(v -> {

            Intent intent = new Intent(
                    MainActivity.this,
                    HomePageActivity.class
            );

            startActivity(intent);
        });
    }
}