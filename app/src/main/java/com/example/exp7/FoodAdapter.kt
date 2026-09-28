package com.example.exp7

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class FoodAdapter(
    private val context: Context,
    private val names: Array<String>,
    private val descriptions: Array<String>,
    private val images: IntArray
) : BaseAdapter() {

    override fun getCount(): Int {
        return names.size
    }

    override fun getItem(position: Int): Any {
        return names[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(
        position: Int,
        convertView: View?,
        parent: ViewGroup?
    ): View {

        val view = convertView ?: LayoutInflater.from(context)
            .inflate(R.layout.list_item, parent, false)

        val image = view.findViewById<ImageView>(R.id.foodImage)
        val name = view.findViewById<TextView>(R.id.foodName)
        val description =
            view.findViewById<TextView>(R.id.foodDescription)

        image.setImageResource(images[position])
        name.text = names[position]
        description.text = descriptions[position]

        return view
    }
}
