package com.azkifairuz.genshin_impact_character.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.azkifairuz.genshin_impact_character.data.CharacterRepository
import com.azkifairuz.genshin_impact_character.ui.screen.detail.DetailViewModel
import com.azkifairuz.genshin_impact_character.ui.screen.home.HomeViewModel

class ViewModelFactory(private val repository: CharacterRepository) :
    ViewModelProvider.NewInstanceFactory() {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(HomeViewModel::class.java)) {
            return HomeViewModel(repository) as T
        } else if (modelClass.isAssignableFrom(DetailViewModel::class.java)) {
            return DetailViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class: " + modelClass.name)
    }
}
