package com.azkifairuz.genshin_impact_character.ui.screen.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.azkifairuz.genshin_impact_character.R
import com.azkifairuz.genshin_impact_character.component.Banner
import com.azkifairuz.genshin_impact_character.component.CharacterCard
import com.azkifairuz.genshin_impact_character.component.ErrorAllert
import com.azkifairuz.genshin_impact_character.component.LoadingComponent
import com.azkifairuz.genshin_impact_character.component.SectionText
import com.azkifairuz.genshin_impact_character.di.Injection
import com.azkifairuz.genshin_impact_character.model.Character
import com.azkifairuz.genshin_impact_character.ui.ViewModelFactory
import com.azkifairuz.genshin_impact_character.ui.common.UiState

@Composable
fun Home(
    homeViewModel: HomeViewModel = viewModel(
        factory = ViewModelFactory(Injection.provideRepository())
    ),
    navigateToDetail: (Int) -> Unit
) {
    homeViewModel.uiState.collectAsState(initial = UiState.Loading).value.let { uiState ->
        when (uiState) {

            is UiState.Loading -> {
                LoadingComponent()
                homeViewModel.getAllRewards()
            }

            is UiState.Success -> {
                Column {
                    Banner()
                    CharacterList(
                        uiState.data,
                        navigateToDetail
                    )
                }
            }

            is UiState.Error -> {
                ErrorAllert(msg = stringResource(R.string.failed_get_character))
            }
        }
    }

}

@Composable
fun CharacterList(
    character: List<Character>,
    navigateToDetail: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    SectionText(
        title = stringResource(R.string.genshin_impact_character),
        modifier.padding(16.dp)
    )
    LazyColumn {
        items(character, key = { it.id }) { character ->
            CharacterCard(
                name = character.name,
                image = character.image,
                detail = character.detail,
                region = character.region,
                modifier = modifier.clickable {
                    navigateToDetail(character.id)
                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePrev() {
//    Home()
}