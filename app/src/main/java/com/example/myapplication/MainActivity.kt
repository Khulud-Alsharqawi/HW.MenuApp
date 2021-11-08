package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ActionMode
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager

const val TAG = "MainActivity"
var Islogin = true



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    //============================================
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart Called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume Called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy Called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart Called")
    }

    //==================================================
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.layout_manu, menu)
        return true
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        var logIn = menu?.findItem(R.id.LogIn)
        var logout = menu?.findItem(R.id.LogOut)
        if ( Islogin) {

            Islogin == true
            logIn?.setVisible(false)
            logout?.setVisible(true)
        } else {
            logIn?.setVisible(true)
            logout?.setVisible(false)
        }
        return super.onPrepareOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            //action ->
            R.id.contact_Us -> {
                Toast.makeText(this, "Contact Us option:", Toast.LENGTH_SHORT).show()
                intent = Intent(this, contactUs::class.java)
                startActivity(intent)
            }
            //
            R.id.setting -> {
                Toast.makeText(this, "setting option", Toast.LENGTH_SHORT).show()
                intent = Intent(this, setting::class.java)
                startActivity(intent)
            }
            //
            R.id.LogIn -> {

                if (item.title == "login") {
                    Toast.makeText(this, "logout action", Toast.LENGTH_SHORT).show()

                }
            }
        }
            return super.onOptionsItemSelected(item)



    }
}