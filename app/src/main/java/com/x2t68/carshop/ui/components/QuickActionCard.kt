package com.x2t68.carshop.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.x2t68.carshop.R

@Composable
fun QuickActionCard(
    icon: Int,
    title: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
){
    Column(
        modifier.clip(RoundedCornerShape(10.dp))
            .background(color = colorResource(R.color.gray))
            .clickable{onClick()}.padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(icon),contentDescription = null, modifier = Modifier
            .fillMaxWidth().heightIn(min=64.dp))
        Text(title, color = colorResource(R.color.black),
            fontSize = 16.sp, textAlign = TextAlign.Center)
    }
}

@Preview
@Composable
fun QuickActionCardPreview(){
    QuickActionCard(
        icon = R.drawable.ic_launcher_background,
        title = "sample Action"
    )
}