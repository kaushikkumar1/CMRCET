package com.example.androide.cmrcet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class WorkshopActivity extends AppCompatActivity {
    List<Workshop> productList;

    //the recyclerview
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workshop);
        recyclerView = (RecyclerView)findViewById(R.id.recyclerview3);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //initializing the productlist
        productList = new ArrayList<>();
        productList.add(
                new Workshop(
                        1,
                        "* UGC AUTONOMOUS * Approved by AICTE * Accredited by NAAC with 'A' Grade * All B.Tech programs Accredited by NBA *",

                        R.drawable.cmrcetimage1,"Audience : Students And Teachers"));

        productList.add(
                new Workshop(
                        1,
                        "* UGC AUTONOMOUS * Approved by AICTE * Accredited by NAAC with 'A' Grade * All B.Tech programs Accredited by NBA *",

                        R.drawable.cmrcetimage1,"Audience : Students And Teachers"));
        productList.add(
                new Workshop(
                        1,
                        "* UGC AUTONOMOUS * Approved by AICTE * Accredited by NAAC with 'A' Grade * All B.Tech programs Accredited by NBA *",

                        R.drawable.cmrcetimage3,"Audience : Students And Teachers"));
        productList.add(
                new Workshop(
                        1,
                        "* UGC AUTONOMOUS * Approved by AICTE * Accredited by NAAC with 'A' Grade * All B.Tech programs Accredited by NBA *",

                        R.drawable.cmrcetimage3,"Audience : Students And Teachers"));
        productList.add(
                new Workshop(
                        1,
                        "* UGC AUTONOMOUS * Approved by AICTE * Accredited by NAAC with 'A' Grade * All B.Tech programs Accredited by NBA *)",

                        R.drawable.cmrcetimage3,"Audience : Students And Teachers"));
        WorkshopAdapter adapter = new WorkshopAdapter(this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);

}}
