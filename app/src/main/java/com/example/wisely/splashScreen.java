package com.example.wisely;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class splashScreen extends AppCompatActivity {

    private static int SPLASH_TIMER= 5000;
    ImageView backgroundImage;

    //Animation
    Animation sideAnim;
    SharedPreferences onBoardingScreen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //hooks
        backgroundImage = findViewById(R.id.backgroundImage);


        //Animation
        sideAnim = AnimationUtils.loadAnimation(this,R.anim.side_anim);

        //Set animation on elemnent
        backgroundImage.setAnimation(sideAnim);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

               onBoardingScreen = getSharedPreferences("onboarding screen",MODE_PRIVATE);

               boolean isFirstTime = onBoardingScreen.getBoolean("firstTIme",true);

               if(isFirstTime){

                   SharedPreferences.Editor editor = onBoardingScreen.edit();
                   editor.putBoolean("firstTIme",false);
                   editor.commit();

                   Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                   startActivity(intent);
                   finish();


               }
               else{
                   Intent intent = new Intent(getApplicationContext(),HomeActivity.class);
                   startActivity(intent);
                   finish();
               }

            }
    },SPLASH_TIMER);
    }
}