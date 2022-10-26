package com.example.wisely;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class videos_subject_activity extends AppCompatActivity {
public static  final String EXTRA_NUMBER= "com.example.wisely.example.EXTRA_NUMBER";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos_subject);


        RelativeLayout button1 = findViewById(R.id.em1_video_button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),chaptersActivity.class);
                intent.putExtra(EXTRA_NUMBER,1);
                startActivity(intent);
            }
        });

        RelativeLayout button2 = findViewById(R.id.ep1_video_button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),chaptersActivity.class);
                intent.putExtra(EXTRA_NUMBER,2);
                startActivity(intent);
            }
        });

        RelativeLayout button3 = findViewById(R.id.ec1_video_button);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),chaptersActivity.class);
                intent.putExtra(EXTRA_NUMBER,3);
                startActivity(intent);
            }
        });

        RelativeLayout button4 = findViewById(R.id.bee_video_button);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),chaptersActivity.class);
                intent.putExtra(EXTRA_NUMBER,4);
                startActivity(intent);
            }
        });

        RelativeLayout button5 = findViewById(R.id.mech_video_button);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),chaptersActivity.class);
                intent.putExtra(EXTRA_NUMBER,5);
                startActivity(intent);
            }
        });

    }
}