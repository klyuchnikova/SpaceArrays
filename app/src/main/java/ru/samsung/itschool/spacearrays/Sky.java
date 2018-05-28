package ru.samsung.itschool.spacearrays;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;

public class Sky implements Drawable {

    final int numStars = 500;

    private int xStar[] = new int[numStars];
    private int yStar[] = new int[numStars];
    private int alphaStar[] = new int[numStars];

    private Paint paint;

    Sky(Paint paint){
        this.paint = paint;

        int maxX = 2000;
        int maxY = 2000;
        for (int i = 0; i < numStars; i++)
        {
            xStar[i] = (int)(Math.random() * maxX);
            yStar[i] = (int)(Math.random() * maxY);
            alphaStar[i] = (int)(Math.random() * 256);
        }
    }

    @Override
    public void draw(Canvas canvas) {

        canvas.drawColor(Color.BLACK);
        paint.setColor(Color.YELLOW);
        paint.setStrokeWidth(2);
        for (int i = 0; i < numStars; i++)
        {
            paint.setAlpha(alphaStar[i]);
            alphaStar[i] += (int)(Math.random() * 11) - 5;
            if (alphaStar[i] > 255) alphaStar[i] = 255;
            if (alphaStar[i] < 0) alphaStar[i] = 0;
            canvas.drawCircle(xStar[i], yStar[i], 3, paint);
        }


    }


    @Override
    public void rotate() {

    }
}
