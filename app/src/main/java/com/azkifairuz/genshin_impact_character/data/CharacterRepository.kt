package com.azkifairuz.genshin_impact_character.data

import com.azkifairuz.genshin_impact_character.model.Character
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class CharacterRepository {
    private val character = mutableListOf<Character>()

    fun getAllRewards(): Flow<List<Character>> {
        return flowOf(character)
    }

    fun getOrderRewardById(rewardId: Int): Character {
        return character.first {
            it.id == rewardId
        }
    }

    companion object {
        @Volatile
        private var instance: CharacterRepository? = null

        fun getInstance(): CharacterRepository =
            instance ?: synchronized(this) {
                CharacterRepository().apply {
                    instance = this
                }
            }
    }
}