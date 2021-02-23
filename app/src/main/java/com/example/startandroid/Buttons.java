package com.example.startandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Buttons extends AppCompatActivity implements View.OnClickListener {
    LinearLayout llMain;
    RadioGroup rgGravity;
    EditText etName;
    Button btnCreate;
    Button btnClear;
    int wrapContent = LinearLayout.LayoutParams.WRAP_CONTENT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        llMain = (LinearLayout) findViewById(R.id.llMain);
        rgGravity = (RadioGroup) findViewById(R.id.rgGravity);
        etName = (EditText) findViewById(R.id.etName);

        btnCreate = (Button) findViewById(R.id.btnCreate);
        btnCreate.setOnClickListener(this);

        btnClear = (Button) findViewById(R.id.btnClear);
        btnClear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
switch (v.getId()){
    case R.id.btnCreate:
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(wrapContent,wrapContent);
        int btnGravity = Gravity.LEFT;
        switch (rgGravity.getCheckedRadioButtonId()){
            case R.id.rbLeft:
                btnGravity = Gravity.LEFT;
                break;
            case R.id.rbCenter:
                btnGravity = Gravity.CENTER_HORIZONTAL;
                break;
            case R.id.rbRight:
                btnGravity = Gravity.RIGHT;
                break;
        }
        layoutParams.gravity = btnGravity;

        // создаем Button, пишем текст и добавляем в LinearLayout
        Button btnNew = new Button(this);
        btnNew.setText(etName.getText().toString());
        llMain.addView(btnNew, layoutParams);

        break;
        case R.id.btnClear:
        llMain.removeAllViews();
        Toast.makeText(this, "Удалено", Toast.LENGTH_SHORT).show();
        break;
}
    }
}