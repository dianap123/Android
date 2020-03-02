package com.example.tema1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import static android.content.ContentValues.TAG;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_redirect = findViewById(R.id.btn_redirect);
        btn_redirect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent secondPage = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(secondPage);
            }
        });
    }

    private Button btn_redirect;
}
