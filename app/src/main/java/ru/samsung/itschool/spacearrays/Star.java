package ru.samsung.itschool.spacearrays;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

public class Star  extends Planet{
    private float x,y,sy,sx;
    private Paint paint;
    private Bitmap bitmap;
    protected Matrix matrix;
    private float radius;

    Star(Bitmap dr, float x, float y, Paint paint) {
        super(dr,x,y,paint);
        this.sx = 0.2f;
        this.sy = 0.2f;
        this.x = x;
        this.y = y;
        matrix = new Matrix();
        this.paint = paint;
        bitmap = dr;
        radius = bitmap.getWidth()/2;
        //super(dr, x, y, paint);
        matrix.setScale(0.2f, 0.2f);
        //Study mathematics, dear young programmer :)
        //matrix.postRotate((float)Math.toDegrees(Math.atan2(vy, vx)) + 45);
        paint.setAlpha(255);
    }

    @Override
    public void draw(Canvas canvas) {
        matrix.setScale(sx, sy);
        //Study mathematics, dear young programmer :)
        //matrix.postRotate((float)Math.toDegrees(Math.atan2(vy, vx)) + 45);
        //Study mathematics, dear young programmer :)
        paint.setAlpha(255);
        matrix.postTranslate(x, y);
        canvas.drawBitmap(bitmap, matrix, paint);
    }

    @Override
    public void Touh(float x, float y) {
        //super.Touh(x,y);
        if ((x-this.x-140)*(x-this.x-140) + (y-this.y-140)*(y-this.y-140)<radius*radius){
            for (int i = 0;i<100;i++){
                //matrix.setScale(0.4f, 0.4f);
                matrix.setRotate(10);
                sx +=0.001f;
                sy +=0.001f;
                x-=radius*2*sx;
                y-=radius*2*sy;
            }
        }
        paint.setAlpha(100);
    }
}
