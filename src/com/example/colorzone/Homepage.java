package com.example.colorzone;





import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;


public class Homepage extends Activity implements OnClickListener{

	Button cred,colorzone;
	
	ImageButton out;
	
	@Override
	protected void onCreate(Bundle ob1) {
		// TODO Auto-generated method stub
		super.onCreate(ob1);
		setContentView(R.layout.homepage);
		methods();
		
		colorzone.setOnClickListener(this); 
		
		cred.setOnClickListener(this);
		out.setOnClickListener(this);
		
		
    	
    	
	
	    
	}
	
	

private void methods(){
	
		colorzone = (Button)findViewById(R.id.colorzone);
		 
		 cred=(Button)findViewById(R.id.credit);
		 
		 out=(ImageButton)findViewById(R.id.exit);
		 
		
		 
		 
	
} 

public void onClick(View v) {
	// TODO Auto-generated method stub
	switch(v.getId()){
	
	
	
	
	case R.id.colorzone:
		Intent k=new Intent("com.example.colorzone.Colorzonemain");
		startActivity(k);		
		break;
	
		
		
		
	case R.id.credit:
		Intent c=new Intent("com.example.colorzone.Credit");
		startActivity(c);		
		break;
		
	
		
	case R.id.exit:
		
		
		finish();
		android.os.Process.killProcess(android.os.Process.myPid());
		super.onDestroy();
		break;
		
		
	
		
		
		
		
	}
}


    
}