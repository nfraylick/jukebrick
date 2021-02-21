
	 
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

public class google_pixel_4__4xl___18_activity extends Activity {

	
	private View _bg__google_pixel_4__4xl___18_ek2;
	private View rectangle_5_ek1;
	private ImageView _path_3_ek1;
	private TextView juke_ek1;
	private TextView brick_ek1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.google_pixel_4__4xl___18);

		
		_bg__google_pixel_4__4xl___18_ek2 = (View) findViewById(R.id._bg__google_pixel_4__4xl___18_ek2);
		rectangle_5_ek1 = (View) findViewById(R.id.rectangle_5_ek1);
		_path_3_ek1 = (ImageView) findViewById(R.id._path_3_ek1);
		juke_ek1 = (TextView) findViewById(R.id.juke_ek1);
		brick_ek1 = (TextView) findViewById(R.id.brick_ek1);
	
		
		_path_3_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), google_pixel_4__4xl___17_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	