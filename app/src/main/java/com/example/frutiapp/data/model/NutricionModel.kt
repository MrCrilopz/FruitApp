package com.example.frutiapp.data.model

import com.google.gson.annotations.SerializedName

data class NutricionModel (
    @SerializedName("calories")
    var calorias: String,
    @SerializedName("fat")
    var grasa: String,
    @SerializedName("sugar")
    var azucar: String,
    @SerializedName("carbohydrates")
    var carbohidratos: String,
    @SerializedName("protein")
    var proteina: String,
)
