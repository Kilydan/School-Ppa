package com.internet.internet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

//    private Painter painter;
//    private ImageButton currPaint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
//        painter = (Painter)findViewById(R.id.painter);
//        LinearLayout paintLayout = (LinearLayout)findViewById(R.id.paint_colors);
//
//        currPaint = (ImageButton)paintLayout.getChildAt(0);
//        currPaint.setImageDrawable(getResources().getDrawable(R.drawable.paint_pressed));
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

//    public void paintClicked(View view){
//        if(view!=currPaint){
//            ImageButton imgView = (ImageButton)view;
//            String color = view.getTag().toString();
//            painter.setColor(color);
//            imgView.setImageDrawable(getResources().getDrawable(R.drawable.paint_pressed));
//            currPaint.setImageDrawable(getResources().getDrawable(R.drawable.paint));
//            currPaint=(ImageButton)view;
//        }
//    }

    public void onClickMaps(View view) {
        Intent maps = new Intent(MainActivity.this, Maps.class);
        startActivity(maps);
    }

    public void onClickFacebook(View view) {
        Intent facebook = new Intent(MainActivity.this, com.internet.internet.Facebook.class);
        startActivity(facebook);
    }

    public void onClickGmail(View view) {
        Intent gmail = new Intent(MainActivity.this, Gmail.class);
        startActivity(gmail);
    }

    public void onClickYoutube(View view) {
        Intent youtube = new Intent(MainActivity.this, Youtube.class);
        startActivity(youtube);
    }

    public void onClickPaint(View view) {
        Intent paint = new Intent(MainActivity.this, PainterClass.class);
        startActivity(paint);
    }

    public void onClickNu(View view) {
        Intent Nu = new Intent(MainActivity.this, Nu.class);
        startActivity(Nu);
    }


        public void onClickStock(View view){
        Intent Stock = new Intent(MainActivity.this, Stock.class);
        startActivity(Stock);
    }


    public void onClickLol(View view){
        Intent Lol = new Intent(MainActivity.this, Lol.class);
        startActivity(Lol);
    }

    }
