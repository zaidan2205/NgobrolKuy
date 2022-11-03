package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class forgot_pass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_pass);
    }
    public void lanjut(View view) {
        Intent cek = new Intent(forgot_pass.this, cek_email.class);
        startActivity(cek);
    }
    public void back(View view) {
        Intent login = new Intent(forgot_pass.this, LoginActivity.class);
        startActivity(login);
    }
}