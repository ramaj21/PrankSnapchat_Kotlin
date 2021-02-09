package com.rama.honorsmobileapps.pranksnapchat_kotlin

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SnapAdapter(val snapList: List<Snap>) : RecyclerView.Adapter<SnapViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SnapViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val rootView = layoutInflater.inflate(R.layout.list_item_layout, parent, false)
        val newViewHolder = SnapViewHolder(rootView)
        return newViewHolder
    }

    override fun getItemCount(): Int {
        return snapList.size
    }


    override fun onBindViewHolder(holder: SnapViewHolder, position: Int) {
        val currentCourse = snapList[position]
        holder.bindSnap(currentCourse)
    }

}