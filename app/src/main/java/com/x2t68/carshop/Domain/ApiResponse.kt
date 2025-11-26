package com.x2t68.carshop.Domain

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ApiResponse(
    @SerialName("Cars")
    val cars: List<CarModel>,
    @SerialName("Category")
    val categories: List<CategoryModel>
)
