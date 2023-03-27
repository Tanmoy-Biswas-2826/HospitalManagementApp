package com.example.hospital;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class drList extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<Drrecyclerviewdata>userList;
   Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dr_list);

        initData();
        initRecylerView();
    }

    private void initData() {
        userList = new ArrayList<>();

        userList.add(new Drrecyclerviewdata(R.drawable.dr1,"Dr.Aman Agarwal","Cardiology \nID:A24FGT46 \nSchedule: 10:00  12:00","____________________________________________"));
        userList.add(new Drrecyclerviewdata(R.drawable.dr2,"Dr.Supreme Ghosh","Medicine \nID:H43D8790\nSchedule: 9:00  11:00","____________________________________________"));
        userList.add(new Drrecyclerviewdata(R.drawable.dr10,"Dr.Samoli Chaoudhary","Dermatology \nID:D9045FG6 \nSchedule: 14:00  16:00","____________________________________________"));
        userList.add(new Drrecyclerviewdata(R.drawable.dr5,"Dr.Rajsekhar Bose","Criticalcare \nID:U345FGT6 \nSchedule: 18:00  21:00","____________________________________________"));
        userList.add(new Drrecyclerviewdata(R.drawable.dr8,"Dr.Priyanka Kar","Endocrinology \nID:M334DGH5 \nSchedule: 9:00  12:00","____________________________________________"));
        userList.add(new Drrecyclerviewdata(R.drawable.dr3,"Dr.Chandrachur Das","Dentistry \nID:R3DB467H \nSchedule: 11:00  15:00","____________________________________________"));
        userList.add(new Drrecyclerviewdata(R.drawable.dr9,"Dr.Rajkumari Chatterjee","Gynaecology \nID:SD24F685 \nSchedule: 16:00  18:00","____________________________________________"));
        userList.add(new Drrecyclerviewdata(R.drawable.dr7,"Dr.Saikat Nandi","Ophthalmologists \nID:SYI34578 \nSchedule: 12:00  15:00","____________________________________________"));
        userList.add(new Drrecyclerviewdata(R.drawable.dr4,"Dr.Pallub Das","Gastrology \nID:C45VN676 \nSchedule: 8:00  10:00","____________________________________________"));
        userList.add(new Drrecyclerviewdata(R.drawable.dr6,"Dr.Swapan Senapati","Infertility\nID:5346ADF6 \nSchedule: 10:00  12:00","____________________________________________"));
        userList.add(new Drrecyclerviewdata(R.drawable.dr11,"Dr.D.K.Bannerjee","Nephrology \nID:5346ADF6 \nSchedule: 10:00  12:00","____________________________________________"));
        userList.add(new Drrecyclerviewdata(R.drawable.dr12,"Dr.Rajeev Raman","Orthopedic\nID:5346ADF6 \nSchedule: 10:00  12:00","____________________________________________"));


    }

    private void initRecylerView() {
        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new Adapter(userList);
        recyclerView.setAdapter((RecyclerView.Adapter) adapter);
        adapter.notifyDataSetChange();
    }

}