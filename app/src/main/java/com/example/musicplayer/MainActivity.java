package com.example.musicplayer;

import static com.example.musicplayer.R.layout.home;
import static com.example.musicplayer.R.layout.login;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }
}