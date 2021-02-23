package com.example.startandroid;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import android.app.Activity;

public class Names  extends Activity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urok20);
        tv = (TextView) findViewById(R.id.tv);

        Intent intent = getIntent();

        String fName = intent.getStringExtra("fname");
        String lName = intent.getStringExtra("lname");

        tv.setText("Your name is: " + fName + " " + lName);
    }
}
