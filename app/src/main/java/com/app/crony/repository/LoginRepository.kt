package com.app.crony.repository

import androidx.lifecycle.MutableLiveData
import javax.inject.Inject

class LoginRepository @Inject constructor() {

    val mutableLiveData = MutableLiveData<String>()

    fun getRepoMutableData() {
        mutableLiveData.value = "This is Dagger Example"
    }

    fun getRepomutableLiveData(): MutableLiveData<String> {
        return mutableLiveData
    }
}