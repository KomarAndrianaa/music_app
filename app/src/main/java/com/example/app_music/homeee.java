package com.example.app_music;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class homeee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homee);
    }
    public void library(View view){
        Intent intent = new Intent(homeee.this,library.class);
        startActivity(intent);
    }
    public void home(View view){
        Intent intent = new Intent(homeee.this,library.class);
        finish();
    }
    public void playing(View view){
        Intent intent = new Intent(homeee.this,playing.class);
        startActivity(intent);
    }
}