package ru.samsung.itschool.spacearrays;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

public class Planet extends DrawableComponent implements Touchable{
    private float radius;
    private float x,y,vx = 0,vy = 0;
    private Bitmap bitmap;
    private Matrix matrix;
    private Paint paint;

    Planet(Bitmap bit,float x,float y,Paint paint){
        /*
        this.x = x;
        this.y = y;
        this.radius = bit.getWidth()/2;
        matrix = new Matrix();
        this.paint = paint;
        */
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }


    @Override
    public void Touh(float x, float y) {
        /*if ((x-this.x)*(x-this.x) + (y-this.y)*(y-this.y)<radius){
            for (int i = 0;i<5;i++){
                matrix.postRotate((float)Math.toDegrees(Math.atan2(vy, vx)) + 45);
            }
        }*/
    }
}
