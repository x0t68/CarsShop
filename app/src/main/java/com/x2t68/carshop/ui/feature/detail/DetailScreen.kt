package com.x2t68.carshop.ui.feature.detail

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.x2t68.carshop.Domain.CarModel
import com.x2t68.carshop.R

@Composable
fun DetailScreen(
    car: CarModel,
    onBack:()->Unit,
    onFav:()->Unit={},
    onBuyNow:()->Unit={}
){
    val scroll= rememberScrollState()
    Box(Modifier
            .fillMaxSize()
            .background(colorResource(R.color.white))) {
        DetailHeader(car.picUrl,onBack, onFav)
        Column(Modifier
            .fillMaxWidth()
            .padding(top = 450.dp)
            .verticalScroll(scroll),


            ){
            DetailInfo(car.title,car.rating,car.description)
            DetailSpecs(car.totalCapacity,car.highestSpeed,car.engineOutput)
            DetailPriceBar(car.price,onBuyNow)
        }
    }
}


@Preview
@Composable
fun DetailScreenPreview() {
    val car = CarModel(
        title = "Tesla Model S",
        description = "A an electric car produced by Tesl, Inc.",
        totalCapacity = "5 seats",
        highestSpeed = "200 mph",
        engineOutput =" 670 hp",
        picUrl = "",
        price = 79990.0,
        rating = 4.5
    )
    DetailScreen(
        car = car,
        onBack = {},
        onFav = {},
        onBuyNow = {})


}
