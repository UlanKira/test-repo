package com.example.startandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity6 extends Activity implements OnClickListener {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        Button btnTime = (Button) findViewById(R.id.btnTime);
        Button btnDate = (Button) findViewById(R.id.btnDate);
        Button btnDateTime = (Button) findViewById (R.id.btnDateTime);

        btnTime.setOnClickListener(this);
        btnDate.setOnClickListener(this);
        btnDateTime.setOnClickListener(this);
    }
   /* public void DateAndTime(View view) {
        Intent intent = new Intent(this,DataAndTime.class);
        startActivity(intent);
    }*/
    @Override
    public void onClick(View v) {
        Intent intent;

        switch(v.getId()) {

            case R.id.btnTime:
                intent = new Intent(this,TimeActivity.class);
                startActivity(intent);
                break;

            case R.id.btnDate:
                intent = new Intent(this,DataActivity.class);
                startActivity(intent);
                break;

            case R.id.btnDateTime:
                intent = new Intent(this,DataAndTime.class);
                startActivity(intent);
                break;
        }
    }
}