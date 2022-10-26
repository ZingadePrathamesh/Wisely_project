package com.example.wisely;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class videoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        String url = getIntent().getStringExtra("keyname");
        WebView webView = findViewById(R.id.VideoView);
        webView.setWebViewClient(new WebViewClient());
        webView.setWebChromeClient(new FullScreenClient(videoActivity.this){
            @Override
            public void onHideCustomView() {
                hideFullScreen(webView);
            }

            @Override
            public Bitmap getDefaultVideoPoster() {
                return videoBitmap();
            }

            @Override
            public void onShowCustomView(View view, CustomViewCallback callback) {
                showFullScreen(view, callback);
            }
        });

        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);
    }
}