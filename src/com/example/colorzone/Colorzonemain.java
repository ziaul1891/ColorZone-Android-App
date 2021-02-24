package com.example.colorzone;





import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;



public class Colorzonemain extends Activity implements OnClickListener{

	Button open,open2;
	
	
	
	@Override
	protected void onCreate(Bundle ob1) {
		// TODO Auto-generated method stub
		super.onCreate(ob1);
		setContentView(R.layout.colorzonemain);
		methods();
		
		open.setOnClickListener(this); 
		
		
		
		open2.setOnClickListener(this); 
    	
    	
	
	    
	}
	
	

private void methods(){
	
		 open = (Button)findViewById(R.id.openpaint);
		 
		 
		 
		 open2 = (Button)findViewById(R.id.patterndwaring);
		 
		 
	
} 

public void onClick(View v) {
	// TODO Auto-generated method stub
	switch(v.getId()){
	
	
	case R.id.openpaint:
		Intent p=new Intent("com.example.colorzone.Paint");
		startActivity(p);	
		
		
		break;
		
		
		
	case R.id.patterndwaring:
		
		
		Intent q=new Intent("com.example.colorzone.Paint2");
		startActivity(q);		
		break;
	
		
		
		
	
		
	
		
		
		
		
	}
}


    
}