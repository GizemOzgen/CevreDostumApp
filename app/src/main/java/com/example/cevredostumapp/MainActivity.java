package com.example.cevredostumapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{



    EditText username ,password;
    Button btnLogin ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.editUsername);
        password = findViewById(R.id.editPassword);
        btnLogin = findViewById(R.id.editLoginBtn);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (username.getText().toString().equalsIgnoreCase("gizem") && password.getText().toString().equals("12345")){
            Intent intent = new Intent(MainActivity.this, HomeActivity.class);
            startActivity(intent);
        }
    }




}