package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
    }
    public void ganti(View view) {
        Intent ganti = new Intent(setting.this, ProfilePicActivity.class);
        startActivity(ganti);
    }
    public void back(View view) {
        Intent back = new Intent(setting.this, home_chat.class);
        startActivity(back);
    }
}