package com.internet.internet;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class Maps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final WebView webview = new WebView(this);
        setContentView(webview);
        webview.getSettings().setJavaScriptEnabled(true);
        final Activity activity = this;
        webview.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView view, int errorCode, String description, String failingURL) {
                Toast.makeText(activity, "Error!" + description, Toast.LENGTH_SHORT).show();
            }
        });
        webview.loadUrl("https://www.google.nl/maps/place/Nederland/@52.191735,3.0369282,7z/data=!3m1!4b1!4m2!3m1!1s0x47c609c3db87e4bb:0xb3a175ceffbd0a9f");

    }

}
