package com.tyas.iak;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FiveThingsActivity extends AppCompatActivity implements View.OnClickListener {

    private int cursor = 0;
    private ImageView ivHeader;
    private TextView tvKeterangan;
    private String[] strings;
    private Button btnPrev;
    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_things);

        setTitle("Judul App");

        strings = new String[]{

        };

        ivHeader = (ImageView) findViewById(R.id.iv_header);
        tvKeterangan = (TextView) findViewById(R.id.tv_penjelasan);
        btnPrev = (Button) findViewById(R.id.btn_prev);
        btnNext = (Button) findViewById(R.id.btn_next);
        ivHeader.setImageResource(R.drawable.akakom);
        btnPrev.setOnClickListener(this);
        btnNext.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == btnPrev.getId()) {

        }

        if (v.getId() == btnNext.getId()) {

        }
    }
}
