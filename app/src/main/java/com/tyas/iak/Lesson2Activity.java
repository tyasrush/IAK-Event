package com.tyas.iak;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Lesson2Activity extends AppCompatActivity {

    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson2);
    }

    public void increment(View view) {
        quantity = quantity + 1;
        display(quantity);
    }

    public void decrement(View view) {
        quantity = quantity - 1;
        display(quantity);
    }

    public void submitOrder(View view) {
        displayPrice(quantity * 5);
    }

    public void display(int number) {
        TextView textView = (TextView) findViewById(R.id.quantity_text_view);
        textView.setText("" + number);
    }

    public void displayPrice(int number) {
        TextView textView = (TextView) findViewById(R.id.price_text_view);
        textView.setText("Price : " + DecimalFormat.getCurrencyInstance().format(number) + "\nThank you!");
    }


}
