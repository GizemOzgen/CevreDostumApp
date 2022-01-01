package com.example.cevredostumapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CreateEventActivity extends AppCompatActivity {
    Button createdEvent;
    Button homePage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_event);

        createdEvent=findViewById(R.id.createdEvent);
        homePage=findViewById(R.id.homePage);

        createdEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Event Created",Toast.LENGTH_LONG).show();
            }
        });

        homePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2= new Intent(CreateEventActivity.this,HomeActivity.class);
                startActivity(i2);
            }
        });

    }
}