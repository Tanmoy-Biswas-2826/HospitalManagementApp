package com.example.hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class application extends AppCompatActivity {

    private ImageButton criticlcare,cardiology,dentist,dermotlogy,endrocrinlgy,gastrolgy,genrlmed,gyno,infrtlity,nefro,ortho,optic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application);
        criticlcare=findViewById(R.id.imageButton);
        cardiology=findViewById(R.id.imageButton2);
        dentist=findViewById(R.id.imageButton3);
        dermotlogy=findViewById(R.id.imageButton4);
        endrocrinlgy=findViewById(R.id.imageButton5);
        gastrolgy=findViewById(R.id.imageButton6);
       genrlmed=findViewById(R.id.imageButton7);
        gyno=findViewById(R.id.imageButton8);
        infrtlity=findViewById(R.id.imageButton9);
        nefro=findViewById(R.id.imageButton10);
        optic=findViewById(R.id.imageButton11);
        ortho=findViewById(R.id.imageButton12);


        criticlcare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(application.this,patient_registration.class));

            }
        });
        cardiology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(application.this,patient_registration.class));

            }
        });
        dentist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(application.this,patient_registration.class));

            }
        });
        dermotlogy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(application.this,patient_registration.class));

            }
        });
        endrocrinlgy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(application.this,patient_registration.class));

            }
        });
        gastrolgy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(application.this,patient_registration.class));

            }
        });
        genrlmed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(application.this,patient_registration.class));

            }
        });
        gyno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(application.this,patient_registration.class));

            }
        });
        infrtlity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(application.this,patient_registration.class));

            }
        });
        nefro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(application.this,patient_registration.class));

            }
        });
        optic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(application.this,patient_registration.class));

            }
        });
        ortho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(application.this,patient_registration.class));

            }
        });


    }
}