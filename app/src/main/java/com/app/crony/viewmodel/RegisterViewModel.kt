package com.app.crony.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.app.crony.repository.RegisterRepository
import javax.inject.Inject

class RegisterViewModel @Inject constructor(private val reposiotry: RegisterRepository) :
    ViewModel() {
    var resultdata = MutableLiveData<String>()

    fun callRegisterApi() {
        reposiotry.getReLiveData()
    }

    fun callMutableLiveData(): MutableLiveData<String> {
        resultdata = reposiotry.getRepomutableLiveData()
        return resultdata
    }


}