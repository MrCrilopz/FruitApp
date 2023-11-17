package com.example.frutiapp.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.frutiapp.data.model.FrutasModel
import com.example.frutiapp.domain.GetFrutas
import kotlinx.coroutines.launch


class FrutasViewModel : ViewModel(){
    val frutasModel = MutableLiveData<FrutasModel>()
    val getFrutas = GetFrutas()

    fun onCreate() {
        viewModelScope.launch {
            val result: List<FrutasModel>? = getFrutas()
            if(!result.isNullOrEmpty()){
                frutasModel.postValue(result.random())
            }
        }
    }
}