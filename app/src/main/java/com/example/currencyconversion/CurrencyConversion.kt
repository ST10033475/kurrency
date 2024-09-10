package com.example.currencyconversion


import com.google.gson.annotations.SerializedName


data class CurrencyConversion (

    @SerializedName("status"             ) var status           : String? = null,
    @SerializedName("updated_date"       ) var updatedDate      : String? = null,
    @SerializedName("base_currency_code" ) var baseCurrencyCode : String? = null,
    @SerializedName("amount"             ) var amount           : Int?    = null,
    @SerializedName("base_currency_name" ) var baseCurrencyName : String? = null,
    @SerializedName("rates"              ) var rates            : Rates?  = Rates()

)