package com.app.crony

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.lifecycle.ViewModelProvider
import com.app.crony.di.DaggerAppComponent
import java.util.*
import javax.inject.Inject
import javax.inject.Named

class SplashActivity : AppCompatActivity() {

    var isLoggedin: Boolean = true
    var context: Context? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        context = this
      //  DaggerAppComponent.create().inject(this)
        if (isLoggedin) {
            gotoDashboard()
        } else {
            gotoLogin()
        }
    }

    private fun gotoLogin() {
        Handler().postDelayed({
            val i = Intent(context, LoginActivity::class.java)
            startActivity(i)
            finishAffinity()
        }, 3000)
    }

    private fun gotoDashboard() {
        Handler().postDelayed({
            val i = Intent(context, LoginActivity::class.java)
            startActivity(i)
            finishAffinity()
        }, 3000)
    }
}
