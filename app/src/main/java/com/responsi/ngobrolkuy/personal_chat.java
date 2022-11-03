package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class personal_chat extends AppCompatActivity {
    private CardView send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_chat);
        send = findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(personal_chat.this, "Chat anda telah terkirim", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void back(View view) {
        Intent back = new Intent(personal_chat.this, home_chat.class);
        startActivity(back);
    }
}