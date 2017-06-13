package com.example.logonrm.alarme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

public class AlarmReceiver extends BroadcastReceiver {

    private MediaPlayer mp = null;

    @Override
    public void onReceive(Context context, Intent intent) {

        mp = MediaPlayer.create(context, R.raw.piao_do_bau);
        mp.start();

        Toast.makeText(context, "Alarme...", Toast.LENGTH_LONG).show();
    }
}
