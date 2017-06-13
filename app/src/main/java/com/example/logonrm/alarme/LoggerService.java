package com.example.logonrm.alarme;

import android.app.Service;
import android.bluetooth.BluetoothClass;
import android.content.Intent;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;


public class LoggerService extends Service {

    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        Log.i("ServiçoMemsagem", "*****--- Serviço iniciado...");
    }

    public void onDestroy() {
        Log.i("ServiçoMensagem", "*****--- Serviço encerrado...");
    }
}
