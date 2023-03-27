package com.example.hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class home extends AppCompatActivity {
    private ImageButton apntmnt;
    private ImageButton finddr;
    private ImageButton operation;
    private ImageButton opd;
    private ImageButton emrgncy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        apntmnt = findViewById(R.id.btnApntmnt);
        finddr = findViewById(R.id.btnfinddr);
        operation = findViewById(R.id.btnoperation);
        opd= findViewById(R.id.imageButton18);
        emrgncy= findViewById(R.id.imageButton15);
        apntmnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(home.this, application.class));
            }
        });
        finddr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(home.this, drList.class));
            }
        });
        operation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(home.this, operation_registration.class));
            }
        });
        opd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(home.this, Opd.class));
            }
        });
        emrgncy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(home.this, Emergency.class));
            }
        });
    }
}