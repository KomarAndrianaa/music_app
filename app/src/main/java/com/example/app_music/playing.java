package com.example.app_music;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class playing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);
    }
    public void playing(View view){
        Intent intent = new Intent(playing.this,homeee.class);
        finish();
    }
    public void home(View view){
        Intent intent = new Intent(playing.this,homeee.class);
        startActivity(intent);
    }
}