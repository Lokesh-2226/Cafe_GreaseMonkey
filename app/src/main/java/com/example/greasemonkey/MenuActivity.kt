package com.example.greasemonkey

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val listView: ListView = findViewById(R.id.menu_list)

        // Define the list of menu items with images, types, and prices
        val menuItems = listOf(
            MenuItem("Pizza", "Main Course", "$300", R.drawable.pizza_image),
            MenuItem("Pasta", "Main Course", "$159", R.drawable.pasta_image),
            MenuItem("Burger", "Fast Food", "$258", R.drawable.burger_image),
            MenuItem("Salad", "Appetizer", "$99", R.drawable.salad_image),
            MenuItem("Soup", "Appetizer", "$219", R.drawable.soup_image),
            MenuItem("Cakes", "Dessert", "$189", R.drawable.cake_image),
            MenuItem("Beverages", "Drink", "$69", R.drawable.beverage_image)
        )

        // Set the custom adapter for the ListView
        val adapter = MenuAdapter(this, menuItems)
        listView.adapter = adapter
    }
}
