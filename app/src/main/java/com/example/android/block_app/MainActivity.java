package com.example.android.block_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText mEditTextUserName,mEditTextPassword;
    Button mButtonLogin;
    private String mUserName = "coursera_sumi";
    private String mPassword = "covid-19";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditTextUserName = findViewById(R.id.et_username);
        mEditTextPassword = findViewById(R.id.et_password);
        mButtonLogin = findViewById(R.id.btn_login);


        mButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getValuesFromEditText();

            }
        });
    }

    private void getValuesFromEditText(){
        String userName = mEditTextUserName.getText().toString();
        String password = mEditTextPassword.getText().toString();

        if ((userName.contains(mUserName)) && (password.contains(mPassword))){
            Intent intent = new Intent(MainActivity.this,SecondBlock.class);
            startActivity(intent);
        }else {
            Toast.makeText(this, "Please enter valid username or password", Toast.LENGTH_LONG).show();
        }

    }

}