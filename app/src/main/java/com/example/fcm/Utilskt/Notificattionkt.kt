package com.example.fcm.utlis

import android.app.Notification
import android.app.NotificationManager
import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.example.fcm.R
import java.io.IOException
import java.net.HttpURLConnection
import java.net.URL

//class Notificattionkt(private val context: Context) {
//    fun triggerNotificatio(title: String?, body: String?) {
//        val builder = NotificationCompat.Builder(context, Constants.id)
//                .setContentTitle(title)
//                .setContentText(body)
//                .setSmallIcon(R.drawable.ic_launcher_background)
//                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
//        val managerCompat = NotificationManagerCompat.from(context)
//        managerCompat.notify(id, builder.build())
//    }
//
//    fun triggerNotificatio(title: String?, body: String?, image: String?) {
//        val builder = NotificationCompat.Builder(context, Constants.id)
//                .setContentTitle(title)
//                .setContentText(body)
//                .setSmallIcon(R.drawable.ic_launcher_background)
//                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
//                .setStyle(NotificationCompat.BigPictureStyle().bigPicture(getBitmapFromURL(image)))
//        val managerCompat = NotificationManagerCompat.from(context)
//        managerCompat.notify(id, builder.build())
//    }
//
//    companion object {
//        private const val id = 100
//        fun getBitmapFromURL(src: String?): Bitmap? {
//            return try {
//                val url = URL(src)
//                val connection = url.openConnection() as HttpURLConnection
//                connection.doInput = true
//                connection.connect()
//                val input = connection.inputStream
//                BitmapFactory.decodeStream(input)
//            } catch (e: IOException) {
//                e.printStackTrace()
//                null
//            }
//        }
//    }
//}

class Notificattionkt(private val context:Context)
{
    fun triggerNotifiaction(title:String?,body:String?)
    {
        val builder=NotificationCompat.Builder(context,Constants.id)
                .setSmallIcon(R.drawable.ic_launcher_background)
                        .setContentTitle(title)
                .setContentText(body)
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)


          val manager = NotificationManagerCompat.from(context)
        manager.notify(100,builder.build())

    }
}