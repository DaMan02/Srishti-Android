package com.srishti.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.srishti.HomeActivity;
import com.srishti.R;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void onLoginActivity(View v){
        startActivity(new Intent(this, LoginActivity.class));
    }

    public void onCreateAccount(View v){
        startActivity(new Intent(this, HomeActivity.class));
    }
}
