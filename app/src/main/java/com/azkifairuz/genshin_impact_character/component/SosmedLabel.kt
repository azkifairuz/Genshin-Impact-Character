package com.azkifairuz.genshin_impact_character.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.azkifairuz.genshin_impact_character.R

@Composable
fun SosmedLabel(
    title: String,
    subtitle: String,
    icon: Int,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.titleSmall.copy(
                fontWeight = FontWeight.ExtraBold
            ),
            modifier = modifier
        )
        Row(
            horizontalArrangement = Arrangement.spacedBy(5.dp),
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier
                .background(color = MaterialTheme.colorScheme.primaryContainer, shape = RoundedCornerShape(6.dp))
                .padding(8.dp)
                .fillMaxWidth()
        ) {
            Icon(painter = painterResource(id = icon), contentDescription = "icon")
            Text(
                text = subtitle,
                color = MaterialTheme.colorScheme.onPrimaryContainer,
                style = MaterialTheme.typography.titleSmall,
            )
        }
    }

}

@Preview(showSystemUi = true)
@Composable
fun TextPrev() {
    SosmedLabel(title = "Email", subtitle = "azkiajmal@gmail.com", icon = R.drawable.ic_email)
}