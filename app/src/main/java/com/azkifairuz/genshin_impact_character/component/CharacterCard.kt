package com.azkifairuz.genshin_impact_character.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.azkifairuz.genshin_impact_character.R

@Composable
fun CharacterCard(
    name: String,
    image: Int,
    detail: String,
    region: String,
    onClick: (String) -> Unit = {},
    modifier: Modifier = Modifier
) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            contentColor = MaterialTheme.colorScheme.onPrimaryContainer
        ),
        modifier = modifier
            .padding(16.dp)
            .clickable { }
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = modifier
                .padding(8.dp)
        ) {
            Image(
                painter = painterResource(id = image),
                contentDescription = null,
                modifier = modifier
                    .width(120.dp)
                    .clip(RoundedCornerShape(18.dp))
            )
            Column(
                verticalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .weight(1f)
                    .height(120.dp)
            ) {
                Column {
                    Text(
                        text = name,
                        style = MaterialTheme.typography.headlineLarge
                    )
                    Text(
                        text = detail,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis,
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
                Box(
                    modifier = modifier
                        .background(
                            MaterialTheme.colorScheme.secondary,
                            shape = RoundedCornerShape(50.dp)
                        )
                        .padding(5.dp)
                ) {
                    Text(
                        text = region,
                        color = MaterialTheme.colorScheme.onSecondary,
                        style = MaterialTheme.typography.labelLarge,
                    )

                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CharacterCardPrev() {
    CharacterCard(
        name = "Eula Lawrance",
        image = R.drawable.eula,
        detail = "ajsdnjaksdadshadhsadasdasdasdadasdadsasdasdasdasdads",
        region = "Mondstatd"
    )
}