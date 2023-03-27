package com.example.hospital;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.text.method.Touch;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class patient_registration extends AppCompatActivity {
    EditText pname,address,dob,gender,drName,mobileNo,dept,date;
    Button add,show;
    DBreglog db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_registration);
        init();
        db=new DBreglog(this);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showData();
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addData();
                clearText();
            }
        });

    }

    public void showMessage(String title, String Message){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();

    }

    public void  showData(){
        Cursor res = db.showData();
        if(res.getCount()==0){

            showMessage("Error", "Nothing Found");

        }
        else{
            StringBuffer buffer=new StringBuffer();
            while(res.moveToNext()){
                buffer.append("Paitent Name: "+res.getString(0)+"\n");
                buffer.append("Address: "+res.getString(1)+"\n");
                buffer.append("DOB: "+res.getString(2)+"\n");
                buffer.append("Gender: "+res.getString(3)+"\n");
                buffer.append("Dr.Name: "+res.getString(4)+"\n");
                buffer.append("Mobile No: "+res.getString(5)+"\n");
                buffer.append("Department: "+res.getString(6)+"\n");
                buffer.append("Date: "+res.getString(7)+"\n\n");

            }
            showMessage("Data",buffer.toString());
        }
    }

    public void addData(){
        Boolean isInsert=db.insertData(pname.getText().toString(), address.getText().toString(), dob.getText().toString(), gender.getText().toString(), drName.getText().toString(), mobileNo.getText().toString(), dept.getText().toString(), date.getText().toString());
        if(isInsert){
            Toast.makeText(patient_registration.this, "Data Inserted", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(patient_registration.this, "Error", Toast.LENGTH_SHORT).show();
        }
    }

    public void clearText(){
        pname.setText(null);
        address.setText(null);
        dob.setText(null);
        gender.setText(null);
        drName.setText(null);
        mobileNo.setText(null);
        dept.setText(null);
        date.setText(null);
    }
    public void init(){
        pname=(EditText) findViewById(R.id.editTextTextPersonName3);
        address=(EditText) findViewById(R.id.editTextTextPersonName4);
        dob=(EditText) findViewById(R.id.editTextDate);
        gender=(EditText) findViewById(R.id.editTextTextPersonName14);
        drName=(EditText) findViewById(R.id.editTextTextPersonName);
        mobileNo=(EditText) findViewById(R.id.editTextPhone);
        dept=(EditText) findViewById(R.id.editTextTextPersonName2);
        date=(EditText) findViewById(R.id.editTextDate2);
        add=(Button) findViewById(R.id.button2);
        show=(Button) findViewById(R.id.button);


    }

}