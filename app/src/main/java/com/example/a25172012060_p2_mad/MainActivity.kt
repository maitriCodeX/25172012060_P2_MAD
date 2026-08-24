package com.example.a25172012060_p2_mad

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private fun showMessage(msg: String) {
        Log.d("Lifecycle", msg)

        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

        Snackbar.make(
            findViewById(android.R.id.content),
            msg,
            Snackbar.LENGTH_SHORT
        ).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(
                systemBars.left,
                systemBars.top,
                systemBars.right,
                systemBars.bottom
            )
            insets
        }

        showMessage("onCreate")
    }

    override fun onStart() {
        super.onStart()
        showMessage("onStart")
    }

    override fun onResume() {
        super.onResume()
        showMessage("onResume")
    }

    override fun onPause() {
        super.onPause()
        showMessage("onPause")
    }

    override fun onStop() {
        super.onStop()
        showMessage("onStop")
    }

    override fun onRestart() {
        super.onRestart()
        showMessage("onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle", "onDestroy")
    }
}