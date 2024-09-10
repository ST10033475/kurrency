package com.example.currencyconversion

import com.google.gson.annotations.SerializedName


data class GBP (

    @SerializedName("currency_name"   ) var currencyName  : String? = null,
    @SerializedName("rate"            ) var rate          : String? = null,
    @SerializedName("rate_for_amount" ) var rateForAmount : String? = null

)
