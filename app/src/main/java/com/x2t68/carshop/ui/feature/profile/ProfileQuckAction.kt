package com.x2t68.carshop.ui.feature.profile

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.x2t68.carshop.R
import com.x2t68.carshop.ui.components.QuickActionCard


@Composable
@Preview
fun ProfileQuickAction(){
    Row(
        Modifier.fillMaxWidth().padding(horizontal = 16.dp)
            , horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        QuickActionCard(R.drawable.maintain,"Maintain",Modifier.weight(1f))
        QuickActionCard(R.drawable.autopart,"Auto Parts",Modifier.weight(1f))
        QuickActionCard(R.drawable.drivingskill,"Driving skill",Modifier.weight(1f))
    }
}