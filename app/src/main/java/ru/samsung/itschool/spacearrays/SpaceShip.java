package ru.samsung.itschool.spacearrays;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

public class SpaceShip extends DrawableComponent implements Drawable{
    protected float x,y,vx,vy;
    private Paint paint;
    private Bitmap bitmap;
    private Matrix matrix;


    SpaceShip(Bitmap bit,float x,float y,Paint paint){
        this.x = x;
        this.y = y;
        this.vx = 0;
        this.vx = 0;
        bitmap = bit;
        matrix = new Matrix();
        this.paint = paint;

    }

    @Override
    public void draw(Canvas canvas) {
        this.x+=vx;
        this.y+=vy;
        matrix.setScale(0.1f, 0.1f);
        //Study mathematics, dear young programmer :)
        matrix.postRotate((float)Math.toDegrees(Math.atan2(vy, vx)) + 45);
        paint.setAlpha(255);
        matrix.postTranslate(x, y);
        canvas.drawBitmap(bitmap, matrix, paint);

    }

    @Override
    public void rotate() {

    }

    public void moveTo(float x, float y){
        vx = (x-this.x)/150;
        vy = (y-this.y)/150;
    }

}
