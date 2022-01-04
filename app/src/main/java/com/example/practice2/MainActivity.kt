package com.example.practice2
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private val NCREATE = "Activity CREATED"
    private val NSTART = "Activity STARTED"
    private val NRESUME = "Activity RESUME"
    private val NPAUSE = "Activity PAUSED"
    private val NSTOP = "Activity STOPPED"
    private val NRESTART = "Activity RESTARTED"
    private val NDESTROY = "Activity DESTROYED"

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        val t = Toast.makeText(this, NCREATE,Toast.LENGTH_SHORT)
        t.show()
    }

    override fun onStart() {
        super.onStart()
        val t = Toast.makeText(this, NSTART,Toast.LENGTH_SHORT)
        t.setGravity(Gravity.LEFT,0,0)
        t.show()
    }

    override fun onResume() {
        super.onResume()
        val t = Toast.makeText(this, NRESUME,Toast.LENGTH_SHORT)
        t.setGravity(Gravity.TOP,0,0)
        t.show()
    }

    override fun onPause() {
        super.onPause()
        val t = Toast.makeText(this, NPAUSE,Toast.LENGTH_SHORT)
        t.setGravity(Gravity.RIGHT,0,0)
        t.show()
    }

    override fun onStop() {
        super.onStop()
        val t = Toast.makeText(this, NSTOP,Toast.LENGTH_SHORT)
        t.setGravity(Gravity.CENTER,0,0)
        t.show()
    }

    override fun onRestart() {
        super.onRestart()
        val t = Toast.makeText(this, NRESTART,Toast.LENGTH_SHORT)
        t.setGravity(Gravity.FILL_HORIZONTAL,0,0)
        t.show()
    }

    override fun onDestroy() {
        super.onDestroy()
        val t = Toast.makeText(this, NDESTROY,Toast.LENGTH_SHORT)
        t.setGravity(Gravity.FILL,0,0)
        t.show()
    }
}
