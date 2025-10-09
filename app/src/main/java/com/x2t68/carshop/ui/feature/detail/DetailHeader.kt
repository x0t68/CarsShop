package com.x2t68.carshop.ui.feature.detail

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
// استيراد المكتبات الضرورية
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.x2t68.carshop.R
import com.x2t68.carshop.ui.components.TopBar

// Opt-in للسماح باستخدام API التجريبي
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailHeader(
    picUrl: String?,
    onBack: () -> Unit,
    onFav: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(500.dp)
            .background(colorResource(R.color.black))
    ) {
        TopBar(
                 title = "Car Detail",
            trailingIconRes = R.drawable.fav_icon,
            onTrailingIconClick = onFav,
            backIconRes = R.drawable.back1,
            onBack = onBack,

            modifier = Modifier
                .fillMaxSize()
                .statusBarsPadding()
        )

        AsyncImage(
            model = picUrl,
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.BottomCenter)
                .padding(bottom = 32.dp, top = 32.dp)
                .height(220.dp)
        )
    }
}
