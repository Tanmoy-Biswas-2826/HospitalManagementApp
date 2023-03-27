package com.example.hospital;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBreglog extends SQLiteOpenHelper {

    public static final String DATABASE_NAME="Hospital.db";

    public DBreglog(Context context) {
        super(context, DATABASE_NAME,null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase myDB) {
         myDB.execSQL(" create table users(username Text, email Text primary key, password Text, mobileNo Int, gender Text)");
         myDB.execSQL("create table booking_table(patientname Text,address Text,dob Text,gender Text,drname Text,mobilenumber Text primary key,department Text, date Text)");
         myDB.execSQL("create table operation(patientname Text,address Text,mobilenumber Text primary key,drname Text,gender Text,department Text, otnumber Text,date Text,time Text)");
         myDB.execSQL("create table emergency(pname Text,paddress Text,mobilenumber Text primary key,gender Text,age Text, bloodgrp Text,gurdianname Text,date Text,time Text)");
    }


    @Override
    public void onUpgrade(SQLiteDatabase myDB, int i, int i1) {
        myDB.execSQL("drop table if exists users");
        myDB.execSQL("drop table if exists booking_table");
        myDB.execSQL("drop table if exists operation");
        myDB.execSQL("drop table if exists emergency");
        onCreate(myDB);

    }


    public Boolean insertData(String username, String email, String password,String mobileNo, String gender){
        SQLiteDatabase myDB=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("username",username);
        contentValues.put("email",email);
        contentValues.put("password",password);
        contentValues.put("mobileNo",mobileNo);
        contentValues.put("gender",gender);
        long result = myDB.insert("users",null,contentValues);
        if(result==-1){
            return false;
        }
        else{
            return true;
        }
    }

    public Boolean insertData(String patientname , String address, String dob ,String gender, String drname, String mobilenumber, String department, String date ){
        SQLiteDatabase myDB=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("patientname",patientname);
        contentValues.put("address",address);
        contentValues.put("dob",dob);
        contentValues.put("gender",gender);
        contentValues.put("drname",drname);
        contentValues.put("mobilenumber",mobilenumber);
        contentValues.put("department",department);
        contentValues.put("date",date);
        long result = myDB.insert("booking_table",null,contentValues);
        if(result==-1){
            return false;
        }
        else{
            return true;
        }
    }


    public Boolean insertData(String patientname , String address, String mobilenumber ,String drname, String gender, String department,String otnumber, String date,String time ){
        SQLiteDatabase myDB=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("patientname",patientname);
        contentValues.put("address",address);
        contentValues.put("mobilenumber",mobilenumber);
        contentValues.put("drname",drname);
        contentValues.put("gender",gender);
        contentValues.put("department",department);
        contentValues.put("otnumber",otnumber);
        contentValues.put("date",date);
        contentValues.put("time",time);
        long result = myDB.insert("operation",null,contentValues);
        if(result==-1){
            return false;
        }
        else{
            return true;
        }
    }

    public Boolean insertdata(String pname,String paddress,String mobilenumber,String gender,String age , String bloodgrp,String gurdianname,String date,String time ){
        SQLiteDatabase myDB=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("pname",pname);
        contentValues.put("paddress",paddress);
        contentValues.put("mobilenumber",mobilenumber);
        contentValues.put("gender",gender);
        contentValues.put("age",age);
        contentValues.put("bloodgrp",bloodgrp);
        contentValues.put("gurdianname",gurdianname);
        contentValues.put("date",date);
        contentValues.put("time",time);
        long result = myDB.insert("emergency",null,contentValues);
        if(result==-1){
            return false;
        }
        else{
            return true;
        }
    }


    public Cursor showData(){
        SQLiteDatabase myDB=this.getWritableDatabase();
        Cursor res=myDB.rawQuery("Select * from booking_table",null);
        return  res;
    }




    public boolean checkuserEmail(String email){
        SQLiteDatabase myDB=this.getWritableDatabase();
        Cursor coursor = myDB.rawQuery("select * from users where email = ?", new String[]{email});
        if(coursor.getCount()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean checkuserPasswordEmail(String email, String password){
        SQLiteDatabase myDB=this.getWritableDatabase();
        Cursor coursor = myDB.rawQuery("select * from users where email= ? and password = ?", new String[]{email,password});
        if(coursor.getCount()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
