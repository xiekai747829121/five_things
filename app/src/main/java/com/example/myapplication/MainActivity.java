package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Switch sw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Weather(View view) {
        Intent intent = new Intent(this, DailyWeather.class);
        startActivity(intent);
    }

    public void Trip(View view) {
        Intent intent = new Intent(this, activity_trip.class);
        startActivity(intent);
    }

    public void Job(View view) {
        Intent intent = new Intent(this, activity_job.class);
        startActivity(intent);
    }


    public void toggle(View v) {
        sw = (Switch) findViewById(R.id.switch1);
        if (sw.isEnabled())
        {
        }
        sw.setText("dark mode");
        ImageView orderSummaryImageView=(ImageView)findViewById(R.id.top_blue);
        orderSummaryImageView.setBackgroundColor(Color.parseColor("#0D47A1"));
        ImageView orderSummaryImageView1=(ImageView)findViewById(R.id.bottom_blue);
        orderSummaryImageView1.setBackgroundColor(Color.parseColor("#0D47A1"));
        Button orderSummaryImageView2=(Button)findViewById(R.id.button);
        orderSummaryImageView2.setBackgroundColor(Color.parseColor("#0D47A1"));
    }



    }


