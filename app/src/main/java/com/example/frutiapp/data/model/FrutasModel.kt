package com.example.frutiapp.data.model

import com.google.gson.annotations.SerializedName

data class FrutasModel(@SerializedName("name") val nombre: String,
                       @SerializedName("id") val id: String,
                       @SerializedName("family") val familia: String,
                       @SerializedName("order") val orden: String,
                       @SerializedName("genus") val genero: String,
                       @SerializedName("nutritions") val nutricion: NutricionModel)


