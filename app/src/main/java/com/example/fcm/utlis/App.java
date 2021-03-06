package com.example.fcm.utlis;
import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;


public class App extends Application
{




    @Override
    public void onCreate() {
        super.onCreate();

        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O)
        {
            NotificationChannel notificationChannel=new NotificationChannel(Constants.id, Constants.name, NotificationManager.IMPORTANCE_DEFAULT);
            notificationChannel.setDescription(Constants.description);
            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(notificationChannel);
        }

    }
}
