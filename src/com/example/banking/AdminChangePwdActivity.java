package com.example.banking;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;

public class AdminChangePwdActivity extends Activity {
	EditText et1,et2;
	Button bt1;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_admin_change_pwd);
		et1=(EditText)findViewById(R.id.editText3);
		et2=(EditText)findViewById(R.id.editText4);
		bt1=(Button)findViewById(R.id.button7);
		bt1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String pwdd=getIntent().getExtras().getString("previouspwd");
				if(et1.getText().toString().equals(pwdd)){
					Toast.makeText(getApplicationContext(),"Password Changed!",Toast.LENGTH_SHORT).show();
					Intent i =new Intent(AdminChangePwdActivity.this,AdminLoginActivity.class);
					i.putExtra("newpwd",et2.getText().toString());
					startActivity(i);
				}
				
			}
		});
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.admin_change_pwd, menu);
		return true;
	}

}
