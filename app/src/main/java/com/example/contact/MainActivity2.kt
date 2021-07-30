package com.example.contact

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        backBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        var contact = intent.getParcelableExtra<Player>("selected_contact")

        var getText = findViewById<TextView>(R.id.getNameTxt)
        var getImage = findViewById<ImageView>(R.id.getImage)
        var contactNo = findViewById<TextView>(R.id.contactNo)
        var email = findViewById<TextView>(R.id.email)

        getText.text = contact?.theText
        contactNo.text = contact?.phone
        email.text = contact?.email
        if (contact != null) {
            getImage.setImageResource(contact.image)
        }

//        var textt = findViewById<TextView>(R.id.textExtra)
//
//        textt.text = contact?.theText


    }
}