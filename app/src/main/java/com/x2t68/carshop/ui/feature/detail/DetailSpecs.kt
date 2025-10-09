package com.x2t68.carshop.ui.feature.detail

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.x2t68.carshop.R
import com.x2t68.carshop.ui.components.SpecCard

@Composable
fun DetailSpecs(totalCapacity: String, highestSpeed: String, engineOutput: String){
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        SpecCard(iconRes = R.drawable.sit,"Total\nCapacity", totalCapacity, Modifier.weight(1f))
        SpecCard(iconRes = R.drawable.speed,"Highest\nSpeed", highestSpeed, Modifier.weight(1f))

        SpecCard(iconRes = R.drawable.engine,"Engine\nOutput", engineOutput, Modifier.weight(1f))

    }
}
@Preview(showBackground = true)
@Composable
fun DetailSpecsPreview() {
    DetailSpecs(
        totalCapacity = "4 Seats",
        highestSpeed = "250 km/h",
        engineOutput = "350 hp"
    )
}