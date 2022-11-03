package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cek_email extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cek_email);
    }

    public void done(View view) {
        Intent done = new Intent(cek_email.this, LoginActivity.class);
        startActivity(done);
    }
    public void back(View view) {
        Intent back = new Intent(cek_email.this, forgot_pass.class);
        startActivity(back);
    }
}