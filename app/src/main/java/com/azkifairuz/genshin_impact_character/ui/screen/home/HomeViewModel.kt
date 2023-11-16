package com.azkifairuz.genshin_impact_character.ui.screen.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.azkifairuz.genshin_impact_character.data.CharacterRepository
import com.azkifairuz.genshin_impact_character.model.Character
import com.azkifairuz.genshin_impact_character.ui.common.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch

class HomeViewModel(
    private val repository: CharacterRepository
) : ViewModel() {
    private val _uiState: MutableStateFlow<UiState<List<Character>>> = MutableStateFlow(UiState.Loading)
    val uiState: StateFlow<UiState<List<Character>>>
        get() = _uiState

    fun getAllRewards() {
        viewModelScope.launch {
            repository.getAllCharacter()
                .catch {
                    _uiState.value = UiState.Error(it.message.toString())
                }
                .collect { character ->
                    _uiState.value = UiState.Success(character)
                }
        }
    }
}