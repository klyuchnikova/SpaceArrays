package ru.samsung.itschool.spacearrays;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first_activity);
	}

	public void onClick(View view){
		Intent intent = new Intent(MainActivity.this, PlayActivity.class);
		startActivity(intent);

	}
}
