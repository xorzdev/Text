package me.gavin.app

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class IndexActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, ShelfActivity::class.java))
        finish()
    }

}
