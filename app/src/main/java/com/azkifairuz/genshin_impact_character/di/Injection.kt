package com.azkifairuz.genshin_impact_character.di

import com.azkifairuz.genshin_impact_character.data.CharacterRepository

object Injection {
    fun provideRepository(): CharacterRepository {
        return CharacterRepository.getInstance()
    }
}