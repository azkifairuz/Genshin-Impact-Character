package com.azkifairuz.genshin_impact_character.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.azkifairuz.genshin_impact_character.ui.theme.Pink40
import com.azkifairuz.genshin_impact_character.ui.theme.Pink80

@Composable
fun ErrorAllert(
    modifier: Modifier = Modifier,
    msg: String
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .background(
                color = Pink80,
                shape = RoundedCornerShape(6.dp)
            )
            .padding(8.dp)
            .height(52.dp)
    ) {
        Text(
            text = msg,
            color = Pink40,
            style = MaterialTheme.typography.titleMedium
        )
    }
}