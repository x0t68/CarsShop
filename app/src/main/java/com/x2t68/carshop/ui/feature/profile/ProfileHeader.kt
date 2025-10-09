package com.x2t68.carshop.ui.feature.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.x2t68.carshop.R

@OptIn
@Composable
@Preview(showBackground = true)
fun ProfileHeader(onBack:()->Unit){
    Box(Modifier.fillMaxWidth()
        .height(400.dp)
        .background(colorResource(R.color.gray))
    ){
        Image(painter = painterResource(R.drawable.back2)
        ,contentDescription = null,
            modifier = Modifier.align(Alignment.TopStart)
                .padding(start = 16.dp, top = 48.dp)
                .clickable{onBack()})
        Text("Profile",
            color = colorResource(R.color.black),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align ( Alignment.TopCenter  )
                .padding(top = 48.dp))
        Image(painterResource(R.drawable.profile),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 96.dp)
                .size(150.dp)
                .clip(RoundedCornerShape(75.dp))
        )
        Text("Alex Johnson",
            color = colorResource(R.color.black),
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.TopCenter).padding(top = 96.dp+150.dp+8.dp))
    }
}