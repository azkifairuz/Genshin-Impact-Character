package com.azkifairuz.genshin_impact_character.ui.screen.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.azkifairuz.genshin_impact_character.R
import com.azkifairuz.genshin_impact_character.component.SectionText
import com.azkifairuz.genshin_impact_character.component.SosmedLabel

@Composable
fun ProfileScreen(
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        Box(
            modifier
                .height(250.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.profile_banner),
                contentDescription = "profile_banner",
                contentScale = ContentScale.Crop,
                colorFilter = ColorFilter.tint(color = Color.Black, BlendMode.Lighten),
                modifier = modifier
                    .fillMaxWidth()
                    .height(180.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.my_oc),
                contentDescription = "my oc",
                modifier
                    .width(160.dp)
                    .border(2.dp, Color.Black, CircleShape)
                    .clip(CircleShape)
                    .align(Alignment.BottomCenter)
            )
        }
        Column(
            verticalArrangement = Arrangement.spacedBy(2.dp),
            modifier = modifier.padding(horizontal = 32.dp)
        ) {
            SectionText(title = stringResource(R.string.my_name))
            Text(text = stringResource(R.string.about_me))
            Column(
                verticalArrangement = Arrangement.spacedBy(12.dp),
                modifier = modifier.padding(10.dp)
            ) {
                SosmedLabel(
                    title = "Email",
                    subtitle = "azkiajmal@gmail.com",
                    icon = R.drawable.ic_email
                )
                SosmedLabel(
                    title = "Github",
                    subtitle = "azkifairuz",
                    icon = R.drawable.ic_github
                )
                SosmedLabel(
                    title = "LinkedIn",
                    subtitle = "azkia ajmal fairuz",
                    icon = R.drawable.ic_linkedin
                )
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = modifier
                        .padding(8.dp)
                        .background(
                            color = MaterialTheme.colorScheme.primary,
                            shape = RoundedCornerShape(6.dp)
                        )
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "Thanks For Come To My Bio",
                        color = MaterialTheme.colorScheme.onPrimary,
                        style = MaterialTheme.typography.titleSmall
                    )
                }
            }
        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ProfilePrev() {
    ProfileScreen()
}