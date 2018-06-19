package com.mtw.alejandro.alertsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.View
import android.widget.Toast
import android.content.DialogInterface
import android.R.string.ok
import android.R.string.cancel





class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickShowAlert(view: View){
        val myAlertBuilder = AlertDialog.Builder(this@MainActivity)
        myAlertBuilder.setTitle(R.string.alert_title)
        myAlertBuilder.setMessage(R.string.alert_message)

        myAlertBuilder.setPositiveButton(R.string.ok, DialogInterface.OnClickListener { dialog, which ->
            // User clicked OK button.
            Toast.makeText(applicationContext, R.string.pressed_ok,
                    Toast.LENGTH_SHORT).show()
        })

        myAlertBuilder.setNegativeButton(R.string.cancel, DialogInterface.OnClickListener { dialog, which ->
            // User clicked the CANCEL button.
            Toast.makeText(applicationContext, R.string.pressed_cancel,
                    Toast.LENGTH_SHORT).show()
        })

        myAlertBuilder.show()
    }
}
