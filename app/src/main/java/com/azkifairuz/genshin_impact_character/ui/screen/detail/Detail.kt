package com.azkifairuz.genshin_impact_character.ui.screen.detail

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.azkifairuz.genshin_impact_character.R
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
    Column {
        Image(
            painter = painterResource(id = image),
            contentDescription = null,
            modifier = modifier
                .fillMaxSize()
                .height(250.dp),
        )
        Column {
            SectionText(title = name)
            Row {

            }
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