package com.app.crony.repository

import androidx.lifecycle.MutableLiveData
import javax.inject.Inject

class RegisterRepository @Inject constructor() {

    val mutableLiveData = MutableLiveData<String>()

    fun getReLiveData() {
        mutableLiveData.value = "this is Register Live DATa"
    }

    fun getRepomutableLiveData(): MutableLiveData<String> {
        return mutableLiveData
    }

}