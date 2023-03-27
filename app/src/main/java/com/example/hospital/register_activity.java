package com.example.hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;

import java.nio.charset.StandardCharsets;

public class register_activity extends AppCompatActivity {

    EditText username,email,password,repassword,mobileno,gender;
    Button btnregister,btn;
    DBreglog myDB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        username = (EditText) findViewById(R.id.registerName);
        email = (EditText) findViewById(R.id.registerEmail);
        password = (EditText) findViewById(R.id.registerPass);
        repassword = (EditText) findViewById(R.id.repassword);
        mobileno = (EditText) findViewById(R.id.registerMobileNo);
        gender = (EditText) findViewById(R.id.registerGender);
        btnregister = (Button) findViewById(R.id.btnRegister);
        btn=(Button)findViewById(R.id.btngotoLogin);

        myDB = new DBreglog(this);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(register_activity.this,MainActivity.class));
            }
        });

        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user =username.getText().toString();
                String eml = email.getText().toString();
                String pass =password.getText().toString();
                String repass = repassword.getText().toString();
                String mno =mobileno.getText().toString();
                String gn = gender.getText().toString();

                if(user.equals("") || eml.equals("") || pass.equals("") || repass.equals("") || mno.equals("") || gn.equals("")){
                    Toast.makeText(register_activity.this, "Fill all the fields.", Toast.LENGTH_SHORT).show();
                }
                else{
                    if(pass.equals(repass)){
                        Boolean usercheckResult = myDB.checkuserEmail(eml);
                        if(usercheckResult ==  false)
                        {
                            Boolean regResult = myDB.insertData(user,eml,pass,mno,gn);
                            if(regResult==true){
                                Toast.makeText(register_activity.this, "Registration Successfull", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                                startActivity(intent);
                            }
                            else{
                                Toast.makeText(register_activity.this, "Registration Failed", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else
                        {
                            Toast.makeText(register_activity.this, "User already Exists.\n Please Sign In", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else{
                        Toast.makeText(register_activity.this, "Password Not Matching", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });


    }
}