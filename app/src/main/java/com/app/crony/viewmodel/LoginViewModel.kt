package com.app.crony.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.app.crony.repository.LoginRepository
import javax.inject.Inject

class LoginViewModel @Inject constructor(private val repository: LoginRepository) : ViewModel() {

    var resultdata = MutableLiveData<String>()

    fun callLiveData() {
        return repository.getRepoMutableData()
    }

    fun callMutableLiveData(): MutableLiveData<String> {
        resultdata = repository.getRepomutableLiveData()
        return resultdata
    }
}