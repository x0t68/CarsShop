package com.x2t68.carshop.viewModel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.x2t68.carshop.Domain.CategoryModel
import androidx.compose.runtime.State
import androidx.lifecycle.viewModelScope
import com.x2t68.carshop.Domain.ApiResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.engine.cio.CIO
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.serialization.kotlinx.json.json
import kotlinx.coroutines.launch
import kotlinx.serialization.json.Json

class CategoryViewModel: ViewModel() {
    private val _categories = mutableStateOf<List<CategoryModel>>(emptyList())
    val categories: State<List<CategoryModel>> = _categories

    private val _isLoading=mutableStateOf(true)
    val isLoading:State<Boolean> = _isLoading

    private val client = HttpClient(CIO) {
        install(ContentNegotiation) {
            json(Json {
                ignoreUnknownKeys = true
                isLenient = true
                prettyPrint = true
                allowSpecialFloatingPointValues = true
                useAlternativeNames = false
            })
        }
    }

    init {
        loadCategories()
    }
    private fun loadCategories() {
        viewModelScope.launch {
            try {
                val response: ApiResponse = client.get("https://dsdecifkcpbknjmfecdn.supabase.co/storage/v1/object/public/products/car-store-6d3f6-default-rtdb-export%20(2).json").body()
                _categories.value = response.categories
                _isLoading.value = false
            } catch (e: Exception) {
                _isLoading.value = false
            }
        }
    }
}