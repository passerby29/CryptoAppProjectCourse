package com.example.cryptoapp.data.models.dto

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CoinNameDto (
    @SerializedName("Name")
    @Expose
    val name: String? = null
)