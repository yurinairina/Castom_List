package com.example.castom_list

import android.annotation.SuppressLint
import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.widget.TextViewCompat
import com.google.android.material.card.MaterialCardView

class CustomArrayAdapter
    (val activity: Activity, val list: List<User>) :
    ArrayAdapter<User>(activity, R.layout.list_item, list) {
    @SuppressLint("MissingInflatedId")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

       // val context = activity.layoutInflater
        val rowView = convertView ?: activity.layoutInflater.inflate(R.layout.list_item, parent, false)

          //context.inflate(R.layout.list_item, null, true)

        var avatar = rowView.findViewById<ImageView>(R.id.image)
        var name = rowView.findViewById<TextView>(R.id.nameTV)
        var age = rowView.findViewById<TextView>(R.id.ageTV)

        avatar.setImageResource(list[position].avatar)
        name.text = list[position].name.toString()
        age.text = list[position].age.toString()
        return rowView
    }
}