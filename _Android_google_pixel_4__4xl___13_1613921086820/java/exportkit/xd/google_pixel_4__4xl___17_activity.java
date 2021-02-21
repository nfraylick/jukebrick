
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		google_pixel_4__4xl___13
	 *	@date 		1613921086820
	 *	@title 		Google Pixel 4, 4XL  13
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.xd
	 *
	 */
	

package exportkit.xd;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;

public class google_pixel_4__4xl___17_activity extends Activity {

	
	private View __bg__google_pixel_4__4xl___17_ek2;
	private View rectangle_5_ek2;
	private ImageView path_3_ek2;
	private TextView juke_ek2;
	private TextView brick_ek2;
	private View rectangle_8;
	private View _rectangle_9;
	private TextView room_pin;
	private TextView enter;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.google_pixel_4__4xl___17);

		
		__bg__google_pixel_4__4xl___17_ek2 = (View) findViewById(R.id.__bg__google_pixel_4__4xl___17_ek2);
		rectangle_5_ek2 = (View) findViewById(R.id.rectangle_5_ek2);
		path_3_ek2 = (ImageView) findViewById(R.id.path_3_ek2);
		juke_ek2 = (TextView) findViewById(R.id.juke_ek2);
		brick_ek2 = (TextView) findViewById(R.id.brick_ek2);
		rectangle_8 = (View) findViewById(R.id.rectangle_8);
		_rectangle_9 = (View) findViewById(R.id._rectangle_9);
		room_pin = (TextView) findViewById(R.id.room_pin);
		enter = (TextView) findViewById(R.id.enter);
	
		
		__bg__google_pixel_4__4xl___17_ek2.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), google_pixel_4__4xl___57_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_rectangle_9.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), google_pixel_4__4xl___57_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	