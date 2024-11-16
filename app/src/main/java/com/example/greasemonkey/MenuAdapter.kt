package com.example.greasemonkey

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class MenuAdapter(private val context: Context, private val menuItems: List<MenuItem>) : BaseAdapter() {

    override fun getCount(): Int {
        return menuItems.size
    }

    override fun getItem(position: Int): Any {
        return menuItems[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.menu_item_layout, parent, false)

        val item = menuItems[position]

        // Set up the view with menu item details
        val itemImage: ImageView = view.findViewById(R.id.item_image)
        val itemName: TextView = view.findViewById(R.id.item_name)
        val itemType: TextView = view.findViewById(R.id.item_type)
        val itemPrice: TextView = view.findViewById(R.id.item_price)

        itemImage.setImageResource(item.imageResId)
        itemName.text = item.name
        itemType.text = item.type
        itemPrice.text = item.price

        return view
    }
}
