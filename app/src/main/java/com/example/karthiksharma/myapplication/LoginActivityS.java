package com.example.karthiksharma.myapplication;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.content.DialogInterface.*;
import static com.example.karthiksharma.myapplication.R.layout.login_student;

/**
 * Created by Karthik Sharma on 10-06-2015.
 */
public class LoginActivityS extends Activity {
    Button C;
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(login_student);
        C=(Button)findViewById(R.id.button3);
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I=new Intent(LoginActivityS.this,registration_s.class);
                startActivity(I);
            }
        });

    }
}
