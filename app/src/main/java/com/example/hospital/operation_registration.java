package com.example.hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class operation_registration extends AppCompatActivity {
    EditText pname,padd,mno,drname,gender,dept,otnum,date,time;
    Button confirm;
    DBreglog db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operation_registration);
        init();
        db=new DBreglog(this);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addData();
                clearText();
            }
        });
    }

    public void addData(){
        Boolean isInsert=db.insertData(pname.getText().toString(), padd.getText().toString(),mno.getText().toString(),drname.getText().toString(), gender.getText().toString(),dept.getText().toString(),otnum.getText().toString(), date.getText().toString(),time.getText().toString());
        if(isInsert){
            Toast.makeText(operation_registration.this, "Data Inserted", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(operation_registration.this, "Error", Toast.LENGTH_SHORT).show();
        }
    }

    public void clearText(){
        pname.setText(null);
        padd.setText(null);
        mno.setText(null);
        drname.setText(null);
        gender.setText(null);
        dept.setText(null);
        otnum.setText(null);
        date.setText(null);
        time.setText(null);
    }
    public void init(){
        pname=(EditText) findViewById(R.id.editTextTextPersonName5);
        padd=(EditText) findViewById(R.id.editTextTextPersonName6);
        mno=(EditText) findViewById(R.id.editTextPhone2);
        drname=(EditText) findViewById(R.id.editTextTextPersonName9);
        gender=(EditText) findViewById(R.id.editTextTextPersonName20);
        dept=(EditText) findViewById(R.id.editTextTextPersonName10);
        otnum=(EditText) findViewById(R.id.editTextNumber);
        date=(EditText) findViewById(R.id.editTextDate3);
        time=(EditText) findViewById(R.id.editTextTime2);
        confirm=(Button) findViewById(R.id.button3);
    }
}