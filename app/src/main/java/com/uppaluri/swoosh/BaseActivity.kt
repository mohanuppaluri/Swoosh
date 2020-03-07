package com.uppaluri.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class BaseActivity : AppCompatActivity() {

    val TAG = "Life Cycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG,"${javaClass.simpleName} On Create")
    }

    override fun onStart() {

        Log.d(TAG,"${javaClass.simpleName} On Start")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG,"${javaClass.simpleName} onResume")
        super.onResume()
    }

    override fun onRestart() {
        Log.d(TAG,"${javaClass.simpleName} onRestart")
        super.onRestart()
    }

    override fun onPause() {
        Log.d(TAG,"${javaClass.simpleName} onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG,"${javaClass.simpleName} onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG,"${javaClass.simpleName} onDestroy")
        super.onDestroy()
    }
}
