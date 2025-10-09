package com.x2t68.carshop.Domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

import com.google.firebase.database.IgnoreExtraProperties



@IgnoreExtraProperties
@Parcelize
data class CarModel(
    val title: String = "",
    val description: String = "",
    val totalCapacity: String = "",
    val highestSpeed: String = "",
    val picUrl: String = "",
    val price: Double = 0.0,
    val rating: Double = 0.0,
    val engineOutput: String = ""
): Parcelable
