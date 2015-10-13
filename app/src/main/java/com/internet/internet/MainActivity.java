package com.internet.internet;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final WebView webview = new WebView(this);
        setContentView(webview);
        webview.getSettings().setJavaScriptEnabled(true);
        final Activity activity = this;
        webview.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress) {
                Toast.makeText(activity, Integer.toString(progress) + "%", Toast.LENGTH_SHORT).show();
            }
        });
        webview.setWebViewClient(new WebViewClient(){
            public void onReceivedError(WebView view, int errorCode, String description, String failingURL) {
                Toast.makeText(activity, "Error!" + description, Toast.LENGTH_SHORT).show();
            }
            public void onPageFinished(WebView view, String url){
                Toast.makeText(activity, url, Toast.LENGTH_SHORT).show();
            }
        });
        webview.loadUrl("https://www.google.nl/maps/@51.5412025,5.2672179,9z?hl=en");
    }
}