package com.example.startandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;

public class AliginActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnLeft;
    Button btnCenter;
    Button btnRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aligin);

        btnLeft = (Button)findViewById(R.id.btnLeft);
        btnCenter = (Button)findViewById(R.id.btnCenter);
        btnRight = (Button)findViewById(R.id.btnRight);

        btnLeft.setOnClickListener(this);
        btnRight.setOnClickListener(this);
        btnCenter.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()){
            case R.id.btnLeft:
                intent.putExtra("Aligment", Gravity.LEFT);
                break;
            case R.id.btnCenter:
                intent.putExtra("Aligment", Gravity.CENTER);
                break;
            case R.id.btnRight:
                intent.putExtra("Aligment", Gravity.RIGHT);
                break;
        }
        setResult(RESULT_OK,intent);
        finish();
    }
}