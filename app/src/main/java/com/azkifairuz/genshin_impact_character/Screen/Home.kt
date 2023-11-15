package com.azkifairuz.genshin_impact_character.Screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.azkifairuz.genshin_impact_character.R
import com.azkifairuz.genshin_impact_character.component.Banner
import com.azkifairuz.genshin_impact_character.component.CharacterCard
import com.azkifairuz.genshin_impact_character.component.SectionText
import com.azkifairuz.genshin_impact_character.model.listCharacter

@Composable
fun Home() {
    Column {
        Banner()
        CharacterList()
    }
}

@Composable
fun CharacterList() {
    SectionText(title = stringResource(R.string.genshin_impact_character))
    LazyColumn {
        items(listCharacter, key = { it.id }) { character ->
            CharacterCard(
                name = character.name,
                image = character.image,
                detail = character.detail,
                region = character.region
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePrev() {
    Home()
}