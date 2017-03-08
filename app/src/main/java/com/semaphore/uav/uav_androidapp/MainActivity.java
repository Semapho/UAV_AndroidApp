package com.semaphore.uav.uav_androidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.semaphore.uav.uav_androidapp.utillities.MyTestUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyTestUtil util = new MyTestUtil();

        TextView tv = (TextView) findViewById(R.id.myTextView);
        tv.setText(util.getValue());

    }
}
