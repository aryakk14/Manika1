package com.example.aryakk.splashscreen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

public class UserAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        final EditText etAadhar_id= (EditText) findViewById(R.id.etAadhar_id);
        final EditText etAge= (EditText) findViewById(R.id.etAge);
        final TextView welcomeMessage= (TextView) findViewById(R.id.tvWelcomeMsg);


    }
}
