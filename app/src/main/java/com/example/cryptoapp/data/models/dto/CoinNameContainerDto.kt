package com.example.cryptoapp.data.models.dto

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CoinNameContainerDto (
    @SerializedName("CoinInfo")
    @Expose
    val coinName: CoinNameDto? = null
)