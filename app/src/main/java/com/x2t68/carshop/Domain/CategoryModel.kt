package com.x2t68.carshop.Domain

import com.google.firebase.database.IgnoreExtraProperties
@IgnoreExtraProperties
data class CategoryModel(
    val title: String = "",
    val picUrl: String = ""
)