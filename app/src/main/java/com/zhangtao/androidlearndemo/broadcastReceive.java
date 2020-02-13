package com.zhangtao.androidlearndemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;
import android.util.Log;
import android.widget.Toast;

public class broadcastReceive extends BroadcastReceiver {

    final private String TAG = "broadcastReceive";

    @Override
    public void onReceive(Context context, Intent intent) {

            Log.d(TAG, intent.getStringExtra("data"));

    }
}
