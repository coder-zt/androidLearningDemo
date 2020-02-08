package com.zhangtao.androidlearndemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class activity_sec_Sqlite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec__sqlite);

        //创建数据库
        db_DatabaseHelper helper = new db_DatabaseHelper(this);
        helper.getWritableDatabase();
    }
}
