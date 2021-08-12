package com.anmol.newproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*

class AvengersLoginActivity : AppCompatActivity(){



    lateinit var txtphone:EditText
    lateinit var txtpin:EditText
    lateinit var loginbutton:Button
    lateinit var forgottenpassword:TextView
    lateinit var register:TextView
    var validmobilenumber = "8959474540"
    var validpin ="1234"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_avengers_login)



        title = "Log In"

        txtphone = findViewById(R.id.txtphone)
        txtpin = findViewById(R.id.txtpin)
        loginbutton = findViewById(R.id.loginbutton)
        forgottenpassword = findViewById(R.id.forgottenpassword)
        register = findViewById(R.id.register)



        loginbutton.setOnClickListener {

                val intent = Intent(this@AvengersLoginActivity, MainActivity::class.java)
                startActivity(intent)
            }

                Toast.makeText(this@AvengersLoginActivity, "Invalid Credentials", Toast.LENGTH_SHORT).show()
            }
        }






var mobilenumber = txtphone.text.toString()
var pin= txtpin.text.toString()
if( (mobilenumber == validmobilenumber) && (pin == validpin)) {
    var mobilenumber = txtphone.text.toString()
    var pin= txtpin.text.toString()
    if( (mobilenumber == validmobilenumber) && (pin == validpin))
