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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final WebView webview = new WebView(this);
        setContentView(webview);

        webview.getSettings().setJavaScriptEnabled(true);
        final Activity activity = this;
        webview.setWebChromeClient(new WebChromeClient() {;
        public void onProgressChanged(WebView View, int progress){
            Toast.makeText(activity, Integer.toString(progress) + "%",
                    Toast.LENGTH_SHORT).show();
        }
            });

        webview.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView view, int errorcode, String
                    description, String failingUrl) {
                Toast.makeText(activity, "Error!" + description, Toast.LENGTH_SHORT).show();
            }

            public void onPageFinished(WebView view, String url) {
                Toast.makeText(activity, url, Toast.LENGTH_SHORT).show();
            }

        });
                webview.loadUrl("http://hugelol.com/");

    }


}