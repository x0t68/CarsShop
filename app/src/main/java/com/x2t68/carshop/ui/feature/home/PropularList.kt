package com.x2t68.carshop.ui.feature.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.x2t68.carshop.Domain.CarModel

@Composable
fun PopularList(
    cars: List<CarModel>,
    onCarClick: (CarModel) -> Unit
) {
    Column(
        modifier = Modifier
            .padding(start = 8.dp, end = 8.dp, bottom = 130.dp)
            .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        // Chunk the list into pairs to create a grid-like structure
        cars.chunked(2).forEach { rowCars ->
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                rowCars.forEach { car ->
                    Card(
                        modifier = Modifier
                            .weight(1f)
                            .clickable { onCarClick(car) },
                        shape = RoundedCornerShape(10.dp),
                        elevation = CardDefaults.cardElevation(4.dp),
                        colors = CardDefaults.cardColors(containerColor = Color.White)
                    ) {
                        Column {
                            Image(
                                painter = rememberAsyncImagePainter(car.picUrl),
                                contentDescription = car.title,
                                modifier = Modifier
                                    .height(130.dp)
                                    .fillMaxWidth(),
                                contentScale = ContentScale.Crop
                            )
                            Text(
                                text = car.title,
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp,
                                color = Color.Black,
                                modifier = Modifier.padding(start = 8.dp, top = 8.dp, end = 8.dp)
                            )
                            Text(
                                text = "$${car.price}",
                                fontSize = 14.sp,
                                color = Color.Gray,
                                modifier = Modifier.padding(start = 8.dp, top = 4.dp, bottom = 8.dp)
                            )
                        }
                    }
                }
                // If there's only one car in the row, add a spacer to fill the gap
                if (rowCars.size < 2) {
                    Column(modifier = Modifier.weight(1f)) {}
                }
            }
        }
    }
}
