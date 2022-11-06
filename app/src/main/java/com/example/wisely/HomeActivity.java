package com.example.wisely;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button notesButton = findViewById(R.id.notes_button);
        notesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, NotesWebView.class);
                startActivity(intent);
            }
        });
        Button videosButton = findViewById(R.id.video_button);
        videosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, videos_subject_activity.class);
                startActivity(intent);
            }
        });
        Button pomodoroTimerButton = findViewById(R.id.timer_button);
        pomodoroTimerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, pomodoroTimerActivity.class);
                startActivity(intent);
            }
        });
//        Button zenModeButton = findViewById(R.id.zen_mode_button);
//        zenModeButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(HomeActivity.this, zenModeActivity.class);
//                startActivity(intent);
//            }
//        });
    }
}