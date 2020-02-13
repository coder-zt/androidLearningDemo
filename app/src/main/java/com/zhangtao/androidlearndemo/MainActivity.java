package com.zhangtao.androidlearndemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnP3,btn2_1,btnp4, btnp5, btnBroadcasst;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        btnP3 = findViewById(R.id.btn_p3);
        btnP3.setOnClickListener(this);
        btn2_1 = findViewById(R.id.btn_p2_1);
        btn2_1.setOnClickListener(this);
        btnp4 =findViewById(R.id.btn_sqlite);
        btnp4.setOnClickListener(this);
        btnp5 = findViewById(R.id.btn_activity);
        btnp5.setOnClickListener(this);
        btnBroadcasst = findViewById(R.id.btn_broadcast);
        btnBroadcasst.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch(v.getId()){
            case R.id.btn_p3:
                intent = new Intent(MainActivity.this, activity_sec_setdata.class);
                startActivity(intent);
                break;
            case R.id.btn_p2_1:
                intent = new Intent(MainActivity.this, activity_sec_ui.class);
                startActivity(intent);
                break;
            case R.id.btn_sqlite:
                intent = new Intent(MainActivity.this, activity_sec_Sqlite.class);
                startActivity(intent);
                break;
            case R.id.btn_activity:
                intent = new Intent(MainActivity.this, activity_sec_Activity.class);
                startActivity(intent);
                break;
            case R.id.btn_broadcast:
                intent = new Intent(MainActivity.this, activity_sec_Broadcast.class);
                startActivity(intent);
                break;

        }
    }
}
