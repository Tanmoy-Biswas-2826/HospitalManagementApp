package com.example.hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Emergency extends AppCompatActivity {
    EditText pname,padd,mno,gender,age,bloodgrp,gname,date,time;
    Button confirm;
    DBreglog db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);
        db=new DBreglog(this);
        init();
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addData();
                clearText();
            }
        });
    }


    public void addData(){
        Boolean isInsert=db.insertdata(pname.getText().toString(), padd.getText().toString(),mno.getText().toString(), gender.getText().toString(),age.getText().toString(), bloodgrp.getText().toString(),gname.getText().toString(),date.getText().toString(),time.toString());
        if(isInsert){
            Toast.makeText(Emergency.this, "Data Inserted", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(Emergency.this, "Error", Toast.LENGTH_SHORT).show();
        }
    }

    public void clearText(){
        pname.setText(null);
        padd.setText(null);
        mno.setText(null);
        gender.setText(null);
        age.setText(null);
        bloodgrp.setText(null);
        gname.setText(null);
        date.setText(null);
        time.setText(null);
    }

    public void init(){
        pname=(EditText) findViewById(R.id.editTextTextPersonName7);
        padd=(EditText) findViewById(R.id.editTextTextPersonName8);
        mno=(EditText) findViewById(R.id.editTextPhone3);
        gender=(EditText) findViewById(R.id.editTextTextPersonName21);
        age=(EditText) findViewById(R.id.editTextTextPersonName11);
        bloodgrp=(EditText) findViewById(R.id.editTextTextPersonName12);
        gname=(EditText) findViewById(R.id.editTextTextPersonName13);
        date=(EditText) findViewById(R.id.editTextDate4);
        time=(EditText) findViewById(R.id.editTextTime);
        confirm=(Button) findViewById(R.id.button4);
    }
}