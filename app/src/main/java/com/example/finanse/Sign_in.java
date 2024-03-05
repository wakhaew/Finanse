package com.example.finanse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Sign_in extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }
    public  void SignIn2(View view)
    {
        Intent intent = new Intent(Sign_in.this,Sign_in2.class);
        startActivity(intent);
    }
}