package com.example.frutiapp.domain

import com.example.frutiapp.data.model.FrutaRepositorio
import com.example.frutiapp.data.model.FrutasModel

class GetFrutas {
    private val repositorio = FrutaRepositorio()

    //se usa suspend para que se pueda usar en una corrutina y no se bloquee el hilo principal
    //se usa el operador invoke para que se pueda llamar a la clase como si fuera una función
    suspend operator fun invoke():List<FrutasModel>? = repositorio.getTodasLasFrutas()
}