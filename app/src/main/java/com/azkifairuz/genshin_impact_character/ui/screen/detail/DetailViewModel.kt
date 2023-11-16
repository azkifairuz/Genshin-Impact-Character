package com.azkifairuz.genshin_impact_character.ui.screen.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.azkifairuz.genshin_impact_character.data.CharacterRepository
import com.azkifairuz.genshin_impact_character.model.Character
import com.azkifairuz.genshin_impact_character.ui.common.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class DetailViewModel(
    private val repository: CharacterRepository
):ViewModel()  {
    private val _uiState: MutableStateFlow<UiState<Character>> =
        MutableStateFlow(UiState.Loading)
    val uiState: StateFlow<UiState<Character>>
        get() = _uiState
    fun getCharacterById(characterId: Int) {
        viewModelScope.launch {
            _uiState.value = UiState.Loading
            _uiState.value = UiState.Success(repository.getCharacterById(characterId))
        }
    }
}