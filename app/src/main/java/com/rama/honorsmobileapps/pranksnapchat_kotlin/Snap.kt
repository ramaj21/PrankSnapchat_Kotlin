package com.rama.honorsmobileapps.pranksnapchat_kotlin

import android.graphics.Color

data class Snap(val username : String, val timeSinceSent : String, val profilePicResId : Int, var opened : Boolean) {
     val status: String
         get() =
             if(opened) {
                 "Received"
             } else {
                 "New Snap"
             }
     val icon: Int
         get() =
             if(opened) {
                 R.drawable.received_icon
             } else {
                 R.drawable.new_snap_icon
             }
     val statusColor: Int
         get() =
             if(opened) {
                 Color.parseColor("#F60047")
             } else {
                 Color.GRAY
             }
 }