package com.example.leboncoin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class AdListViewActivity extends AppCompatActivity {

    ArrayList<AdModel> ListModel = new ArrayList();

    AdModel M1 = new AdModel("Model1", "2, clos du pré 57530 Courcelles-Chaussy", 0);
    AdModel M2 = new AdModel("Model2", "2, clos du pré 57530 Courcelles-Chaussy", 1);
    AdModel M3 = new AdModel("Model3", "2, clos du pré 57530 Courcelles-Chaussy", 2);
    AdModel M4 = new AdModel("Model4", "2, clos du pré 57530 Courcelles-Chaussy", 3);
    AdModel M5 = new AdModel("Model5", "2, clos du pré 57530 Courcelles-Chaussy", 4);
    AdModel M6 = new AdModel("Model6", "2, clos du pré 57530 Courcelles-Chaussy", 5);
    AdModel M7 = new AdModel("Model7", "2, clos du pré 57530 Courcelles-Chaussy", 6);
    AdModel M8 = new AdModel("Model8", "2, clos du pré 57530 Courcelles-Chaussy", 7);
    AdModel M9 = new AdModel("Model9", "2, clos du pré 57530 Courcelles-Chaussy", 8);
    AdModel M10 = new AdModel("Model10", "2, clos du pré 57530 Courcelles-Chaussy", 9);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview_ad);

        ListModel.add(M1);
        ListModel.add(M2);
        ListModel.add(M3);
        ListModel.add(M4);
        ListModel.add(M5);
        ListModel.add(M6);
        ListModel.add(M7);
        ListModel.add(M8);
        ListModel.add(M9);
        ListModel.add(M10);

        AdAdapter adapter = new AdAdapter(this, ListModel);

        ListView listview = (ListView) findViewById(R.id.listview);
        listview.setAdapter(adapter);


    }



}
