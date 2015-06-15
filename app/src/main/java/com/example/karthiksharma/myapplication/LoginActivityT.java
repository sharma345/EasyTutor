package com.example.karthiksharma.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Karthik Sharma on 09-06-2015.
 */
public class LoginActivityT extends Activity {
   Button tutreg;
    EditText tutemail,tutpass;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_tutor);
        tutreg=(Button)findViewById(R.id.tutreg);
        tutemail=(EditText) findViewById(R.id.tutemail);
        tutpass=(EditText) findViewById(R.id.tutpass);


        tutreg.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I=new Intent(LoginActivityT.this,RegistrationT.class);

                startActivity(I);
            }
        });
    }

}