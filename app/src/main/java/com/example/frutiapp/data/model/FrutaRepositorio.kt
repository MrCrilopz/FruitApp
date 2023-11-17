package com.example.frutiapp.data.model

import com.example.frutiapp.data.model.network.FrutaServicio

class FrutaRepositorio {
    private val api = FrutaServicio()

    //esto se hace acá así para que solo se haga una vez y
    // no se haga cada vez que se llame a la función y se guarden los datos en una variable a modo de bd local
    suspend fun getTodasLasFrutas():List<FrutasModel>{
        val response: List<FrutasModel> = api.getFrutas()
        FrutasProvider.frutas = response
        return response
    }
}