package ru.samsung.itschool.spacearrays;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;


public class MyDraw extends View {

	public MyDraw(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.setOnTouchListener(listener);
        sky = new Sky(paint);
        sun = new Star(BitmapFactory.decodeResource(getResources(), R.drawable.sun),300,300,paint);
        earth = new Earth(BitmapFactory.decodeResource(getResources(), R.drawable.earth),400,400,200,paint);
        rocket = new SpaceShip(BitmapFactory.decodeResource(getResources(), R.drawable.rocket),300,300,paint);
	}


	Paint paint = new Paint();
    Sky sky;
    Star sun;
    SpaceShip rocket;
    Earth earth;
	Matrix matrix = new Matrix();

    OnTouchListener listener = new OnTouchListener() {
		@Override
		public boolean onTouch(View v, MotionEvent event) {

			// save the X,Y coordinates
			if (event.getActionMasked() == MotionEvent.ACTION_DOWN) {
				sun.Touh(event.getX(), event.getY());
				rocket.moveTo(event.getX(), event.getY());
			}

			// let the touch event pass on to whoever needs it
			return false;
		}

    };
	
	@Override
	protected void onDraw(Canvas canvas) {
		
		sky.draw(canvas);
		sun.draw(canvas);
		earth.draw(canvas);
		rocket.draw(canvas);

		// Запрос на перерисовку экрана
		invalidate();
	}


	
}
