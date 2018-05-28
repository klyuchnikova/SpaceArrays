package ru.samsung.itschool.spacearrays;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

abstract class DrawableComponent implements Drawable{
    private float x,y,vx,vy;
    private Paint paint;
    private Bitmap bitmap;
    private Matrix matrix;

    @Override
    public void draw(Canvas canvas) {

    }

    @Override
    public void rotate() {

    }

}
