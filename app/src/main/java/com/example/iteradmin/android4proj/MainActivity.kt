package com.example.iteradmin.android4proj

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View) {
        when(v.id){
            R.id.login ->{
                Toast.makeText(applicationContext,"login",Toast.LENGTH_LONG).show()
            }
            R.id.forgot ->{
                Toast.makeText(applicationContext,"forgot",Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val login=findViewById<Button>(R.id.login)
        val forgot=findViewById<Button>(R.id.forgot)

        login.setOnClickListener(this);
        forgot.setOnClickListener(this);
    }

}
