package com.x2t68.carshop.Domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable

@Parcelize
@Serializable
data class CategoryModel(
    val title: String = "",
    val picUrl: String = ""
) : Parcelable