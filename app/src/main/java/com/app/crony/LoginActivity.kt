package com.app.crony

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.app.crony.di.DaggerAppComponent
import com.app.crony.repository.LoginRepository_Factory.create
import com.app.crony.viewmodel.LoginViewModel
import kotlinx.android.synthetic.main.activity_login.*
import javax.inject.Inject
import javax.inject.Named

class LoginActivity : AppCompatActivity() {

    @Inject
    lateinit var factory: ViewModelProvider.Factory
    lateinit var loginViewModel: LoginViewModel
    lateinit var context: Context
    /*@Named("GotoRegister")
    @Inject
    lateinit var regiseterIntent: Intent*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        context = this

        DaggerAppComponent.create().inject(this)

        loginViewModel = ViewModelProviders.of(this, factory).get(LoginViewModel::class.java)
        loginViewModel.callLiveData()

        loginViewModel.callMutableLiveData().observe(this, Observer {
            etPhoneno.setText(it)
        })

        tvRegister.setOnClickListener {
            val i = Intent(context, RegisterActivity::class.java)
            startActivity(i)
        }
    }
}