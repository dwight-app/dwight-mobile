package com.example.dwight_mobile.entities

import com.google.gson.annotations.SerializedName

data class Task(
    @SerializedName("id")
    var data: Int,
    @SerializedName("name")
    var page: String,
    @SerializedName("time")
    var perPage: String,
    @SerializedName("severity")
    var support: Int,
    @SerializedName("priority")
    var total: Int,
    @SerializedName("completed")
    var totalPages: Int
)