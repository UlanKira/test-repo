package com.example.startandroid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.startandroid.R.*;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    TextView tvOut;
    Button btnName;

    private int requestCode;
    private int resultCode;
    private Intent data;

        Button urok21;
        Button MainActivity51;
        Button MainActivity61;
        Button GetIntentAction_activity21;
        Button startActivityForResult;
        Button ActivityResult;
        Button GoogleApi;
        Button SharedPreferences;
        Button SQLite;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        tvOut = (TextView) findViewById(R.id.tvOut);

        Intent intent = getIntent();

        String fName = intent.getStringExtra("fname");
        String lName = intent.getStringExtra("lname");

        tvOut.setText("Your name is: " + fName + " " + lName);

        urok21 = (Button) findViewById(R.id.urok20);
        urok21.setOnClickListener(this);

        MainActivity51 = (Button)findViewById(R.id.MainActivity5);
        MainActivity51.setOnClickListener(this);

        MainActivity61 = (Button)findViewById(R.id.MainActivity6);
        MainActivity61.setOnClickListener(this);

        GetIntentAction_activity21 = (Button)findViewById(R.id.GetIntentAction);
        GetIntentAction_activity21.setOnClickListener(this);

        tvOut = (TextView) findViewById(R.id.tvOut);
        startActivityForResult = (Button) findViewById(R.id.startActivityForResult);
        startActivityForResult.setOnClickListener(this);

        ActivityResult = (Button)findViewById(R.id.ActivityResult);
        ActivityResult.setOnClickListener(this);

        GoogleApi = (Button)findViewById(R.id.GoogleApi);
        GoogleApi.setOnClickListener(this);

        SharedPreferences = (Button)findViewById(R.id.SharedPreferences);
        SharedPreferences.setOnClickListener(this);

        SQLite= (Button)findViewById(R.id.SQLite);
        SQLite.setOnClickListener(this);
    }

    @Override
    public View onCreateView(@NonNull String name, @NonNull Context context, @NonNull AttributeSet attrs) {
        return super.onCreateView(name, context, attrs);

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("menu 1");
        menu.add("menu 2");
        menu.add("menu 3");
        menu.add("menu 4");
        return super.onCreateOptionsMenu(menu);

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub
        Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }

    public void jksndc(View view) {
        Intent intent =new Intent(MainActivity.this, ThreeButton.class);
        startActivity(intent);
    }
    public void sdfvjknfv(View view) {
        Intent intent = new Intent(MainActivity.this, Buttons.class);
        startActivity(intent);
    }

        public void MainActivity4(View view) {
        Intent intent = new Intent(MainActivity.this,MainActivity4.class);
        startActivity(intent);
    }

    public void calculator(View view) {
        Intent intent = new Intent(this,CalculatorActivity.class);
        startActivity(intent);
    }
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.startActivityForResult:
                Intent intenst = new Intent(this, StartActivityForResult.class);
                startActivityForResult(intenst, 1);
                break;
            case R.id.btnOK:
                Intent intentd = new Intent(this, MainActivity.class);
                startActivityForResult(intentd, 1);
                break;
            case R.id.urok20:
                Intent intent = new Intent(this, urok20.class);
                startActivity(intent);
                break;
            case R.id.MainActivity5:
                Intent sad = new Intent(this,MainActivity5.class);
                startActivity(sad);
                break;
            case R.id.MainActivity6:
                Intent sda = new Intent(this,MainActivity6.class);
                startActivity(sda);
                break;
            case R.id.GetIntentAction:
                Intent sde = new Intent(this,GetIntentAction_activity.class);
                startActivity(sde);
                break;
            case R.id.SharedPreferences:
                Intent erfge = new Intent(this,SharedPreferences.class);
                startActivity(erfge);
                break;
            case R.id.ActivityResult:
                Intent intent1 = new Intent(this, ActivityResult.class);
                startActivity(intent1);
                break;
            case R.id.GoogleApi:
                Intent intent2 = new Intent(this, GoogleActivity.class);
                startActivity(intent2);
                break;
            case R.id.SQLite:
                Intent intent3 = new Intent(this, SQLite.class);
                startActivity(intent3);
                break;

        }
    }
    @SuppressLint("MissingSuperCall")
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        this.requestCode = requestCode;
        this.resultCode = resultCode;
        this.data = data;
        if (data == null) {
            return;
        }
        String name = data.getStringExtra("name");
        tvOut.setText("Your name is " + name);
    }
}