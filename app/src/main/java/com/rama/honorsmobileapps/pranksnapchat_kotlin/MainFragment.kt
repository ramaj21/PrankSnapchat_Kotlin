package com.rama.honorsmobileapps.pranksnapchat_kotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class MainFragment : Fragment() {

    private val snaps = listOf(Snap("Kylie Lyndon", "40 years", R.drawable.ic_launcher_background, false),
        Snap("Andy Romma", "3 min", R.drawable.ic_launcher_foreground, false),
        Snap("Cel Demp", "4 min", R.drawable.ic_launcher_background, false))

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_main, container, false)

        val mRecyclerView : RecyclerView = rootView.findViewById(R.id.recyclerView)

        val mAdapter = SnapAdapter(snaps)
        mRecyclerView.adapter = mAdapter

        return rootView
    }
}