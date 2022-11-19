package com.example.appdescarte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonAgreste = findViewById(R.id.buttonAgreste);
        Button buttonRMR = findViewById(R.id.buttonRMR);
        Button buttonZonaDaMata = findViewById(R.id.buttonZonaDaMata);

        buttonAgreste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Agreste.class);
                startActivity(intent);
            }
        });
    }
}