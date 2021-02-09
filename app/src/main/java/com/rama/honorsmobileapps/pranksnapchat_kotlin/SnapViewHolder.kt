package com.rama.honorsmobileapps.pranksnapchat_kotlin

import android.media.Image
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

class SnapViewHolder(rootView: View) : RecyclerView.ViewHolder(rootView), View.OnClickListener{
    private lateinit var currentSnap: Snap
    private val username : TextView = itemView.findViewById(R.id.username)
    private val profilePicture : ImageView = itemView.findViewById(R.id.profilePicture)
    private val status : ImageView = itemView.findViewById(R.id.status)
    private val timeStamp : TextView = itemView.findViewById(R.id.timeSince)
    private val statusText : TextView = itemView.findViewById(R.id.statusText)

    init {
        itemView.setOnClickListener(this)
    }

    fun bindSnap(snap: Snap){
        currentSnap = snap
        username.text = currentSnap.username
        profilePicture.setImageResource(currentSnap.profilePicResId)
        status.setImageResource(currentSnap.icon)
        timeStamp.text = currentSnap.timeSinceSent
        statusText.text = currentSnap.status
    }

    private fun setSnapStatus(){
        statusText.setTextColor(currentSnap.statusColor)
        statusText.text = currentSnap.status
        status.setImageResource(currentSnap.icon)
    }

    override fun onClick(v: View?) {
        itemView.findNavController().navigate(R.id.action_mainFragment_to_prankSnapFragment)
        currentSnap.opened = true
        setSnapStatus()
    }
}