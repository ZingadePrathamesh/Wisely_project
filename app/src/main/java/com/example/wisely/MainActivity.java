package com.example.wisely;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.Manifest;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private ViewPager mSlideViewPager;
    private LinearLayout mDotLayout;
    int currentPos;
    private TextView[] mDots;

    Button letsGetStartedeButton;
    Animation animation;
    private SliderAdapter sliderAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onboard);

        mSlideViewPager = (ViewPager) findViewById(R.id.slideViewPager);
        mDotLayout = (LinearLayout) findViewById(R.id.dotLayout);
        letsGetStartedeButton = (Button) findViewById(R.id.getting_started_btn);

        sliderAdapter = new SliderAdapter(this);

        mSlideViewPager.setAdapter(sliderAdapter);
        addDotsIndicator(0);
        mSlideViewPager.addOnPageChangeListener(viewlistener);
    }

    public void skip(View view) {
        startActivity(new Intent(getApplicationContext(), HomeActivity.class));
        finish();
    }
    public void startHome(View view) {
        startActivity(new Intent(getApplicationContext(), HomeActivity.class));
        finish();
    }
    public void next(View view) {
        mSlideViewPager.setCurrentItem(currentPos + 1);
    }

    public void addDotsIndicator(int position) {

        mDots = new TextView[3];
        mDotLayout.removeAllViews();
        for (int i = 0; i < mDots.length; i++) {
            mDots[i] = new TextView(this);
            mDots[i].setText(Html.fromHtml("&#8226;"));
            mDots[i].setTextSize(35);
            mDots[i].setTextColor(getResources().getColor(R.color.colorTransparentWhite));

            mDotLayout.addView(mDots[i]);
        }
        if (mDots.length > 0) {

            mDots[position].setTextColor(getResources().getColor(R.color.colorWhite));

        }

    }

    ViewPager.OnPageChangeListener viewlistener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            addDotsIndicator(position);
            currentPos = position;

            if (position == 0) {
              letsGetStartedeButton.setVisibility(View.INVISIBLE);
            } else if (position == 1) {
                letsGetStartedeButton.setVisibility(View.INVISIBLE);
            }  else {
                animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.bottom_anim);
                letsGetStartedeButton.setAnimation(animation);
                letsGetStartedeButton.setVisibility(View.VISIBLE);
            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
}