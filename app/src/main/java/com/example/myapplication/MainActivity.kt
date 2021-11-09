package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast


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
        val logIn = menu?.findItem(R.id.LogIn)
        val logout = menu?.findItem(R.id.LogOut)
        if ( Islogin) {

            logIn?.isVisible = false
            logout?.isVisible = true
            Islogin=false
        } else {
            logIn?.isVisible = true
            logout?.isVisible = false
            Islogin=true

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

        }
            return super.onOptionsItemSelected(item)



    }
}