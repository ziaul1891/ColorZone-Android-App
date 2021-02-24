package com.example.colorzone;





import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;

public class Page1 extends Activity{
	
	

	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		
		
		Thread timer = new Thread() {
			public void run(){
				try{
					
					sleep(5000);
					
					
				}catch(InterruptedException e)
				{
					
					e.printStackTrace();
					
				}finally{
					
					Intent openMainActivity = new Intent("com.example.colorzone.Homepage");
					startActivity(openMainActivity);
					
				}
			}
		};
		timer.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		
		finish();
	}
	
	

}






