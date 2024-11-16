package com.example.greasemonkey

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class BookingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking)

        val nameField: EditText = findViewById(R.id.et_name)
        val phoneField: EditText = findViewById(R.id.et_phone)
        val numGuestsField: EditText = findViewById(R.id.et_num_guests)
        val bookButton: Button = findViewById(R.id.btn_book)

        bookButton.setOnClickListener {
            val name = nameField.text.toString()
            val phone = phoneField.text.toString()
            val numGuests = numGuestsField.text.toString()

            if (name.isNotEmpty() && phone.isNotEmpty() && numGuests.isNotEmpty()) {
                Toast.makeText(this, "$numGuests Seats Confirmed for $name!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please fill all fields.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}