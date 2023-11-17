package com.example.frutiapp.data.model.network

import com.example.frutiapp.data.model.FrutasModel
import retrofit2.Response
import retrofit2.http.GET

interface FrutaApiCliente {
    @GET("https://www.fruityvice.com/api/fruit/all")
    suspend fun getFrutas():Response<List<FrutasModel>>
}