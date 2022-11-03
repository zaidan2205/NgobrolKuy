package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    public void masuk(View view) {
        Intent masuk = new Intent(RegisterActivity.this, LoginActivity.class);
        startActivity(masuk);
    }
    public void lanjut(View view) {
        Intent lanjut = new Intent(RegisterActivity.this, LoginActivity.class);
        startActivity(lanjut);
    }
}