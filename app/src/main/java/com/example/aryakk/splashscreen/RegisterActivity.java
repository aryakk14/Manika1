package com.example.aryakk.splashscreen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText etAge= (EditText) findViewById(R.id.etAge);
        final EditText etName= (EditText) findViewById(R.id.etName);
        final EditText etAadhar_id= (EditText) findViewById(R.id.etAadhar_id);
        final EditText etPassword= (EditText) findViewById(R.id.etPassword);


        final Button bRegister = (Button) findViewById(R.id.bRegister);

    }
}
