package com.example.hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.nio.charset.StandardCharsets;

public class MainActivity extends AppCompatActivity {
    private  Button sgUp,sgIn;
    private EditText username, password;
    DBreglog myDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       sgUp=findViewById((R.id.btnSignUp));
       sgIn=findViewById((R.id.btnSignin));
       username=findViewById(R.id.loginEmail);
       password=findViewById(R.id.loginPassword);
       myDB=new DBreglog(this);

       sgUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,register_activity.class));
            }
        });

        sgIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            String user=username.getText().toString();
            String pass=password.getText().toString();
            if(user.equals("") ||pass.equals("")){
                Toast.makeText(MainActivity.this, "Fill all the fields.", Toast.LENGTH_SHORT).show();
            }
            else{
                boolean result=myDB.checkuserPasswordEmail(user,pass);
                if(result){
                    Intent intent = new Intent(getApplicationContext(),home.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this, "Does not have any Account Please Register.", Toast.LENGTH_SHORT).show();
                }

            }

            }
        });


    }

}