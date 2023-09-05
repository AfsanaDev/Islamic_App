package com.techsis.islamicapp;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.techsis.islamicapp.R.id;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    ImageView calenderImage;
    TextView textView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.tasbeeh);
        calenderImage = findViewById(id.calender);
        ImageView youtube = findViewById(id.youtube);
        ImageView speaker = findViewById(id.speaker);
        ImageView quraan = findViewById(R.id.quraan);
        ImageView mosque = findViewById(id.masque);

        //GO TO TASHBEEH ACTIVITY
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ShowTasbeehActivity.class);
                startActivity(intent);
            }
        });
        //GO TO CALANDER ACTIVITY

        calenderImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, calender_activity.class);
                startActivity(intent);
            }
        });

        //CODE FOR YOUTUBE VIDEOS
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, viewYoutube.class);
                startActivity(intent);
            }
        });
        speaker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , wazShow.class);
                startActivity(intent);
            }
        });

        //SHOW GOOGLE MAP

        mosque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, showGoogleMap.class);
                startActivity(intent);
            }
        });

        //SHOW QURAAN

        quraan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, viewQuaran.class);
                startActivity(intent);
            }
        });



    }

    }