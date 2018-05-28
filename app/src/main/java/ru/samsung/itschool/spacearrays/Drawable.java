package ru.samsung.itschool.spacearrays;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

public interface Drawable {
    float x= 0 ,y = 0;
    Paint paint = null;
    Bitmap bitmap = null;
    Matrix matrix= null;
    void draw(Canvas canvas);
    void rotate();
}
