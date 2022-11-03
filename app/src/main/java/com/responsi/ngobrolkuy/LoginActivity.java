package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void buat_akun(View view) {
        Intent buat_akun = new Intent( LoginActivity.this, RegisterActivity.class);
        startActivity(buat_akun);
    }
    public void lupa_pass(View view) {
        Intent lupa_pass = new Intent(LoginActivity.this, forgot_pass.class);
        startActivity(lupa_pass);
    }
    public void masuk(View view) {
        Intent masuk = new Intent(LoginActivity.this, home_chat.class);
        startActivity(masuk);
    }
}