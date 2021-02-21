
	 
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
import android.widget.ImageView;
import android.content.Intent;
import android.widget.TextView;

public class google_pixel_4__4xl___13_activity extends Activity {

	
	private View _bg__google_pixel_4__4xl___13_ek2;
	private View rectangle_5;
	private ImageView _path_3;
	private TextView juke;
	private TextView brick;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.google_pixel_4__4xl___13);

		
		_bg__google_pixel_4__4xl___13_ek2 = (View) findViewById(R.id._bg__google_pixel_4__4xl___13_ek2);
		rectangle_5 = (View) findViewById(R.id.rectangle_5);
		_path_3 = (ImageView) findViewById(R.id._path_3);
		juke = (TextView) findViewById(R.id.juke);
		brick = (TextView) findViewById(R.id.brick);
	
		
		_path_3.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), google_pixel_4__4xl___18_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	