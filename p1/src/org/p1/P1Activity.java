package org.p1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class P1Activity extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
	Button buttonUpdate;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        buttonUpdate = (Button) findViewById(R.id.button1);
        
        buttonUpdate.setOnClickListener(this);
    }
    
   //this is Git demo....  and now push it github which is socialnetworking site to provide public repositories....
    
    
    public void onClick(View v) {
		switch (v.getId()){
		case R.id.button1:
			Intent i=new Intent(this,Guidelist.class);
			startActivity(i);
			break;
		}
		}
    
}