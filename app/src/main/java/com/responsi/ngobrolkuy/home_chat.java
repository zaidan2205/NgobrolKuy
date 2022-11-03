package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class home_chat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_chat);
    }
    public void buka(View view) {
        Intent buka = new Intent(home_chat.this, personal_chat.class);
        startActivity(buka);
    }
    public void keluar(View view) {
        Intent keluar = new Intent(home_chat.this, LoginActivity.class);
        startActivity(keluar);
    }
    public void pengaturan(View view) {
        Intent pengaturan = new Intent(home_chat.this, setting.class);
        startActivity(pengaturan);
    }
}