package com.responsi.ngobrolkuy;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfilePicActivity extends AppCompatActivity {
    private CircleImageView image;
    private ImageButton tambahfoto;

    private TextView Lewati;
    private CardView Lanjut;

    private static final String TAG = RegisterActivity.class.getCanonicalName();
    private static final int GALLERY_REQUEST_CODE = 1;

    private Uri imageUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_pic);
        image = findViewById(R.id.profilePic);
        Lanjut = findViewById(R.id.lanjut);
        Lewati = findViewById(R.id.lewati);

        tambahfoto = findViewById(R.id.changeImage);
        tambahfoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI), GALLERY_REQUEST_CODE);
            }
        });
    }

    public void lewat(View view) {
        Intent lewat = new Intent(ProfilePicActivity.this, setting.class);
        startActivity(lewat);
    }
    public void lanjut(View view) {
        Intent lanjut = new Intent(ProfilePicActivity.this, setting.class);
        startActivity(lanjut);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_CANCELED){
            Toast.makeText(this, "Batal Input Gambar", Toast.LENGTH_SHORT).show();
            return;
        }
        else if (requestCode == GALLERY_REQUEST_CODE){
            if (data != null){
                try {
                    imageUri = data.getData();
                    Bitmap bmp = MediaStore.Images.Media.getBitmap(this.getContentResolver(), imageUri);
                    image.setImageBitmap(bmp);
                    Lanjut.setVisibility(View.VISIBLE);
                    Lewati.setVisibility(View.INVISIBLE);
                }
                catch (IOException e){
                    Toast.makeText(this, "proses gagal", Toast.LENGTH_SHORT).show();
                    Log.e(TAG, e.getMessage());
                }
            }
        }
    }
}