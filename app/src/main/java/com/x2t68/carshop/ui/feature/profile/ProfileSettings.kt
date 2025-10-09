package com.x2t68.carshop.ui.feature.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.x2t68.carshop.R
import com.x2t68.carshop.ui.components.SettingsRow

@Composable
@Preview
fun ProfileSettings(){
    Column {
        SettingsRow(R.drawable.review,
            "Rating and Review",
            Modifier.padding(horizontal = 16.dp, vertical = 16.dp))
        SettingsRow(R.drawable.contact,
            "Contact Support",
            Modifier.padding(horizontal = 16.dp))
        SettingsRow(R.drawable.social,
            "Social Media Link",
            Modifier.padding(horizontal = 16.dp, vertical = 16.dp))

    }
}