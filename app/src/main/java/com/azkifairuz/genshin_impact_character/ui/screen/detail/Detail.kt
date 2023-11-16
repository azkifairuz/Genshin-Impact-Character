package com.azkifairuz.genshin_impact_character.ui.screen.detail

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.azkifairuz.genshin_impact_character.R
import com.azkifairuz.genshin_impact_character.component.LabelBadge
import com.azkifairuz.genshin_impact_character.component.SectionText

@Composable
fun Detail() {

}

@Composable
fun DetailContent(
    @DrawableRes image: Int,
    name: String,
    detail: String,
    region: String,
    element: String,
    modifier: Modifier = Modifier
) {
    Column() {
        Image(
            painter = painterResource(id = image),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = modifier
                .fillMaxWidth()
                .height(250.dp),
        )
        Column(
            verticalArrangement = Arrangement.spacedBy(12.dp),
            modifier = modifier.padding(16.dp)
        ) {
            SectionText(title = name)
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                LabelBadge(
                    label = region,
                    bgColor = MaterialTheme.colorScheme.secondaryContainer,
                    textColor = MaterialTheme.colorScheme.onSecondaryContainer
                )
                LabelBadge(
                    label = element,
                    bgColor = MaterialTheme.colorScheme.primaryContainer,
                    textColor = MaterialTheme.colorScheme.onPrimaryContainer
                )
            }
            Text(text = detail)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DetailPrev() {
    DetailContent(
        image = R.drawable.eula,
        name = "Eula",
        detail = "asdasdadsasdasd",
        region = "mondstadt",
        element = "cryo"
    )
}