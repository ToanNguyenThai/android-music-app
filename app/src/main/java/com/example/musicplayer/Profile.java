package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        TextView songlb = findViewById(R.id.songlb);
        TextView artistlb = findViewById(R.id.artistlb);
        TextView albumlb = findViewById(R.id.albumlb);
        songlb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Profile.this, MySong.class));
            }
        });
        artistlb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Profile.this, MyArtist.class));
            }
        });
        albumlb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Profile.this, MyAlbum.class));
            }
        });
        ImageView backToHome  = findViewById(R.id.backToHome);
        backToHome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Profile.this, HomeScreen.class));
            }
        });
        Button logout  = findViewById(R.id.btn_logout);
        logout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Profile.this, SignIn.class));
            }
        });
    }
}