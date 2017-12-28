package com.codingblocks.alarmmanager;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AlarmManager am= (AlarmManager) getSystemService(ALARM_SERVICE);
        Intent i=new Intent(this,MainActivity.class);
        i.putExtra("A","aaa");
        PendingIntent pendingIntent=PendingIntent.getActivity(this,112,i,PendingIntent.FLAG_ONE_SHOT);


        am.set(AlarmManager.ELAPSED_REALTIME, SystemClock.elapsedRealtime()+6000,pendingIntent);

        am.setRepeating(AlarmManager.RTC,System.currentTimeMillis()+6000,6000,pendingIntent);
    }
}
