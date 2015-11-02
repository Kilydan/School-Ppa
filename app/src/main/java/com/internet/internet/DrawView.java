package com.internet.internet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class DrawView extends View{
    List<Point> points = new ArrayList<Point>();
    Paint paint = new Paint();
    int c = 0;
    float x = 0;
    float y = 0;

    public DrawView(Context context){
        super(context);
        setFocusable(true);
        setFocusableInTouchMode(true);
        paint.setColor(Color.WHITE);
        paint.setAntiAlias(true);
    }

    @Override
    public void onDraw(Canvas canvas) {
        Point point = new Point();
        double j = 0;
        double step = 0.03;
        canvas.drawRect(0, 0, canvas.getWidth(), canvas.getHeight(), paint);

        paint.setColor(Color.BLUE);
        for(int i=0; i < canvas.getWidth(); i++) {
            point.x = (float) i;
            point.y = (float) Math.sin(j) * (canvas.getHeight() / 2) + (canvas.getHeight() / 2);

            points.add(point);
            j = j + step;
            canvas.drawCircle(point.x, point.y, 1, paint);
        }
        paint.setColor(Color.BLACK);

        canvas.drawLine(0, canvas.getHeight() / 2, canvas.getWidth(), canvas.getHeight() / 2, paint);
        canvas.drawLine(canvas.getWidth() / 2, 0, canvas.getWidth() / 2, canvas.getHeight(), paint);

        paint.setTextSize(22);
        canvas.drawText("x", canvas.getWidth() / 2 - 22, 22, paint);
        canvas.drawText("y", canvas.getWidth() - 22, canvas.getHeight() / 2 + 22, paint);
        }

    class Point {
        float x, y;
    }

//    @Override
//    public boolean onTouch(View v, MotionEvent event){
//        x = event.getX() - 5;
//        y = event.getY() - 5;
//        this.invalidate();
//        return false;
//    }

}
