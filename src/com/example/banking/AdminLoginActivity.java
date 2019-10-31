package com.example.banking;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;

public class AdminLoginActivity extends Activity {
	Button bt;
	EditText et1,et2;
	TextView tv1,tv2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState); 
		setContentView(R.layout.activity_admin_login);
		tv1=(TextView)findViewById(R.id.textViewuser);
		tv2=(TextView)findViewById(R.id.textViewpwd);
		
		bt=(Button)findViewById(R.id.button4);
		et1=(EditText)findViewById(R.id.editText1);
		et2=(EditText)findViewById(R.id.editText2);
		
		bt.setOnClickListener(new OnClickListener() {
		
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String uname="abcd";
				String pwd="1234";
				Bundle b=getIntent().getExtras();
				if(b==null){
					if(et1.getText().toString().equals(uname)){
						if(et2.getText().toString().equals(pwd)){
							Intent i =new Intent(AdminLoginActivity.this,AdminActivity.class);
							String pwdd=et2.getText().toString();
							i.putExtra("previouspwd", pwdd);
							startActivity(i);
						}
						else{
							tv2.setText("Wrong Password!");
						}
					}
					else{
						tv1.setText("Wrong UserName!");
						et2.setText("");
					}
				}
				else{
					pwd=b.getString("newpwd");
				
				if(et1.getText().toString().equals(uname)){
					if(et2.getText().toString().equals(pwd)){
						Intent i =new Intent(AdminLoginActivity.this,AdminActivity.class);
						String pwdd=et2.getText().toString();
						i.putExtra("previouspwd", pwdd);
						startActivity(i);
					}
					else{
						et2.setHint("Wrong Password!");
					}
				}
				else{
					et1.setHint("Wrong UserName!");
					et2.setText("");
				}}
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.choose, menu);
		return true;
	}

}
