package com.srishti.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.srishti.HomeActivity;
import com.srishti.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onCreateActivity(View v){
        startActivity(new Intent(this, RegisterActivity.class));
    }

    public void onLogin(View v){
        startActivity(new Intent(this, HomeActivity.class));
    }
}
