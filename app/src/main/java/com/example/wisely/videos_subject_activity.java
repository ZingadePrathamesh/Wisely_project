package com.example.wisely;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class videos_subject_activity extends AppCompatActivity {
public static  final String EXTRA_NUMBER= "com.example.wisely.example.EXTRA_NUMBER";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos_subject);


        Button button1 = findViewById(R.id.em1_video_button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),chaptersActivity.class);
                intent.putExtra(EXTRA_NUMBER,1);
                startActivity(intent);
            }
        });

        Button button2 = findViewById(R.id.ep1_video_button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),chaptersActivity.class);
                intent.putExtra(EXTRA_NUMBER,2);
                startActivity(intent);
            }
        });

        Button button3 = findViewById(R.id.ec1_video_button);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),chaptersActivity.class);
                intent.putExtra(EXTRA_NUMBER,3);
                startActivity(intent);
            }
        });

        Button button4 = findViewById(R.id.bee_video_button);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),chaptersActivity.class);
                intent.putExtra(EXTRA_NUMBER,4);
                startActivity(intent);
            }
        });

        Button button5 = findViewById(R.id.mech_video_button);
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