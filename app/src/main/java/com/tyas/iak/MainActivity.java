package com.tyas.iak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button lesson1Button;
    private Button lesson2Button;
    private Button lesson3Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lesson1Button = (Button) findViewById(R.id.btn_lesson_1);
        lesson2Button = (Button) findViewById(R.id.btn_lesson_2);
        lesson3Button = (Button) findViewById(R.id.btn_lesson_3);
        lesson1Button.setOnClickListener(this);
        lesson2Button.setOnClickListener(this);
        lesson3Button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        if (v.getId() == lesson1Button.getId()) {
            intent = new Intent(this, Lesson1Activity.class);
        }

        if (v.getId() == lesson2Button.getId()) {
            intent = new Intent(this, Lesson2Activity.class);
        }

        if (v.getId() == lesson3Button.getId()) {
            intent = new Intent(this, Lesson3Activity.class);
        }

        startActivity(intent);
    }
}
