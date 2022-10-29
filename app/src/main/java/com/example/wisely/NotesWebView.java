package com.example.wisely;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class NotesWebView extends AppCompatActivity {
WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_web_view);
        wv = (WebView) findViewById(R.id.webview);
        wv.loadUrl("https://drive.google.com/drive/folders/1cXo-e6ax-ZQiBfguMm0NtLIKar6TYNZW?usp=sharing");
        wv.setWebViewClient(new client());
        WebSettings vs = wv.getSettings();
        vs.setJavaScriptEnabled(true);
        wv.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        wv.clearCache(true);
        wv.clearHistory();

        wv.setDownloadListener(new DownloadListener() {
            @Override
            public void onDownloadStart(String url, String s1, String s2, String s3, long l) {
                DownloadManager.Request req = new DownloadManager.Request(Uri.parse(url));
                req.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                DownloadManager dm = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                dm.enqueue(req);

                Toast.makeText(getApplicationContext(), "Downloading started....", Toast.LENGTH_SHORT).show();
            }
        });
    }
    private class client extends WebViewClient {

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
        }
    }


}