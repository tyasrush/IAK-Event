package com.tyas.iak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class ContohListActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contoh_list);

        final String[] listPeserta = new String[]{
                "Adhe Riskan",
                "Iqbal Allefari",
                "Andri Tri Widiyatmoko",
                "Yengki",
                "I Made Adhi Govala Jaya",
                "Topan Extranepa",
                "Alfridus Dumupa",
                "Agung Budi Antoro",
                "Shinta Saptarini",
                "Dito Priwanto",
                "Eko Santoso",
                "Wahyu Andri Setiyawan",
                "Fiqy Aprila Nurcleary"
        };

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listPeserta);

        listView = (ListView) findViewById(R.id.list_example);

        Button showListButton = (Button) findViewById(R.id.btn_show_list);
        showListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listView.setAdapter(adapter);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
