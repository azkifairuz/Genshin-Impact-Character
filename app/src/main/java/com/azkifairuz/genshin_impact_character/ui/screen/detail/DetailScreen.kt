package com.azkifairuz.genshin_impact_character.ui.screen.detail

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.azkifairuz.genshin_impact_character.R
import com.azkifairuz.genshin_impact_character.component.ErrorAllert
import com.azkifairuz.genshin_impact_character.component.LabelBadge
import com.azkifairuz.genshin_impact_character.component.LoadingComponent
import com.azkifairuz.genshin_impact_character.component.SectionText
import com.azkifairuz.genshin_impact_character.di.Injection
import com.azkifairuz.genshin_impact_character.ui.ViewModelFactory
import com.azkifairuz.genshin_impact_character.ui.common.UiState

@Composable
fun DetailScreen(
    characterId: Int,
    detailViewModel: DetailViewModel = viewModel(
        factory = ViewModelFactory(Injection.provideRepository())
    )
) {
    detailViewModel.uiState.collectAsState(initial = UiState.Loading).value.let { uiState ->
        when (uiState) {
            is UiState.Loading -> {
                LoadingComponent()
                detailViewModel.getCharacterById(characterId)

            }

            is UiState.Success -> {
                val data = uiState.data
                DetailContent(
                    image = data.image,
                    name = data.name,
                    detail = data.detail,
                    region = data.region,
                    element = data.element
                )
            }

            is UiState.Error -> {
                ErrorAllert(msg = stringResource(R.string.failed_get_character))
            }
        }
    }
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
        SectionText(title = name,modifier.padding(16.dp))
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