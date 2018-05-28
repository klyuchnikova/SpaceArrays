package ru.samsung.itschool.spacearrays;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

public class Earth extends Planet implements Touchable {
    private double x,y,time,center_x,center_y;
    private Paint paint;
    protected Bitmap bitmap;
    private Matrix matrix;
    private float radius;

    Earth(Bitmap dr, float x, float y,float radius, Paint paint) {
        super(dr,x,y,paint);
        time = 0;

        this.radius = radius;
        this.center_x = x;
        this.center_y = y;
        this.x = center_x-radius;
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
        move();
        matrix.setScale(0.05f, 0.05f);
        //Study mathematics, dear young programmer :)
        //matrix.postRotate((float)Math.toDegrees(Math.atan2(vy, vx)) + 45);
        //Study mathematics, dear young programmer :)
        paint.setAlpha(255);
        matrix.postTranslate((float)x, (float)y);
        canvas.drawBitmap(bitmap, matrix, paint);
    }

    private void move(){
        x = center_x+radius*Math.sin(time);
        y = center_y+radius*Math.cos(time);
        time+=0.05;
        /*if (y>=center_y && num==1){
            this.y = Math.pow(radius*radius - (this.x - center_x)*(this.x - center_x),0.5)+ center_y ;
            this.x+=3.5;
        } else if (num==1){
            num=2;
            this.x-=3.5*num;
            this.y =  -(Math.pow(radius*radius - (this.x - center_x)*(this.x - center_x),0.5))+ center_y ;
        }else{
            num = 1;
            this.x-=3.5;
            this.y =  -(Math.pow(radius*radius - (this.x - center_x)*(this.x - center_x),0.5))+ center_y ;
        }*/
        //this.y = Math.pow(radius*radius - (this.x - center_x)*(this.x - center_x),0.5)+ center_y ;
    }
}
