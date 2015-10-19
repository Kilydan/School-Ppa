package com.internet.internet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
    }

    public void onClickMaps(View view) {
        Intent maps = new Intent(MainActivity.this, Maps.class);
        startActivity(maps);
    }
    public void onClickFacebook(View view){
        Intent facebook = new Intent(MainActivity.this, Facebook.class);
        startActivity(facebook);
    }
    public void onClickYoutube(View view){
        Intent youtube = new Intent(MainActivity.this, Youtube.class);
        startActivity(youtube);
    }
    public void onClickGmail (View view){
        Intent gmail = new Intent(MainActivity.this, Gmail.class);
        startActivity(gmail);
    }

}