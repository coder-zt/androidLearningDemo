package com.zhangtao.androidlearndemo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class Database_TEST{


    public void insert(){
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        db_Dao dao = new db_Dao(appContext);
        dao.insert();
    }
}
