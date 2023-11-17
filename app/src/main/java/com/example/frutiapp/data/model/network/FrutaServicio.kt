package com.example.frutiapp.data.model.network

import com.example.frutiapp.core.RetrofitHelper
import com.example.frutiapp.data.model.FrutasModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.Dispatcher

class FrutaServicio {
    private val retrofit = RetrofitHelper.getRetrofit()

    //toda esa llamada se hace en un hilo secundario y cuando se termina se pasa al hilo principal para no saturar el hilo principal
    suspend fun getFrutas():List<FrutasModel>{
        return withContext(Dispatchers.IO){
            val response = retrofit.create(FrutaApiCliente::class.java).getFrutas()
            response.body() ?: emptyList()
        }

    }
}