package com.internet.internet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClickMaps(View view) {
        Intent maps = new Intent(MainActivity.this, Maps.class);
        startActivity(maps);
    }
    public void onClickFacebook(View view){
        Intent facebook = new Intent(MainActivity.this, com.internet.internet.Facebook.class);
        startActivity(facebook);
    }
    public void onClickGmail(View view){
        Intent gmail = new Intent(MainActivity.this, Gmail.class);
        startActivity(gmail);
    }
    public void onClickYoutube(View view){
        Intent youtube = new Intent(MainActivity.this, Youtube.class);
        startActivity(youtube);
    }
    public void onClickPaint(View view){
        Intent paint = new Intent(MainActivity.this, Painter.class);
        startActivity(paint);
    }

    public void onClickNu(View view){
        Intent Nu = new Intent(MainActivity.this, Nu.class);
        startActivity(Nu);
    }

}