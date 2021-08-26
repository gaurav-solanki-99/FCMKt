package com.example.fcm.Service

import com.example.fcm.utlis.NotificationHelper
import com.example.fcm.utlis.Notificattionkt
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingServiceKt : FirebaseMessagingService() {
//    override fun onMessageReceived(remoteMessage: RemoteMessage) {
//        super.onMessageReceived(remoteMessage)
//        val body = remoteMessage.notification!!.body
//        val title = remoteMessage.notification!!.title
//        val helper = NotificationHelper(this)
//        if (remoteMessage.notification!!.imageUrl == null || remoteMessage.notification!!.imageUrl.toString().equals("null") || remoteMessage.notification!!.imageUrl.toString().equals("")) {
//            helper.triggerNotificatio(title, body)
//        } else {
//            val image = remoteMessage.notification!!.imageUrl.toString()
//            helper.triggerNotificatio(title, body, image)
//        }
//    }

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        super.onMessageReceived(remoteMessage)

         val body= remoteMessage.notification?.body
          val title=remoteMessage.notification?.title

        val helper=Notificattionkt(this)
            helper.triggerNotifiaction(title, body)





    }
}