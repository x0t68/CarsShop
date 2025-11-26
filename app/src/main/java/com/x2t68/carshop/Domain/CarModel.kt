package com.x2t68.carshop.Domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Parcelize
@Serializable
data class CarModel(
    val title: String = "",
    val description: String = "",
    @SerialName("TotalCapacity")
    val totalCapacity: String = "",
    @SerialName("HighestSpeed")
    val highestSpeed: String = "",
    val picUrl: String = "",
    val price: Double = 0.0,
    val rating: Double = 0.0,
    @SerialName("EngineOutput")
    val engineOutput: String = ""
): Parcelable