package com.azkifairuz.genshin_impact_character.component

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.azkifairuz.genshin_impact_character.R

@Composable
fun Banner(
    modifier: Modifier = Modifier
) {

    Column() {
        SectionText(
            title = stringResource(R.string.the_pretties_character_of_the_year),
            modifier.padding(16.dp)
        )
        Card(
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                contentColor = MaterialTheme.colorScheme.onPrimaryContainer
            ),
            modifier = modifier.padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.eula_banner),
                contentScale = ContentScale.Crop,
                contentDescription = stringResource(R.string.content_prettiest_character_banner),
                modifier = modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .clip(RoundedCornerShape(topStart = 18.dp, topEnd = 18.dp))
            )
            Column(
                verticalArrangement = Arrangement.spacedBy(5.dp),
                modifier = modifier.padding(8.dp)
            ) {
                Text(
                    text = stringResource(R.string.eula_lawrance),
                    style = MaterialTheme.typography.titleMedium
                )
                Text(text = stringResource(R.string.mondstadt))
            }
        }

    }
}

@Preview(showSystemUi = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun BannerPreview() {
    Banner()
}