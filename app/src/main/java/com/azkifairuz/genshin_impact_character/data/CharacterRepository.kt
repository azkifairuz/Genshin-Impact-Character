package com.azkifairuz.genshin_impact_character.data

import com.azkifairuz.genshin_impact_character.model.Character
import com.azkifairuz.genshin_impact_character.model.listCharacter
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class CharacterRepository {
    private val character = mutableListOf<Character>()
    init {
        if (character.isEmpty()) {
            listCharacter.forEach {
                character.add(
                    Character(
                    it.id,
                    it.image,
                    it.name,
                    it.region,
                    it.detail,
                    it.element
                )
                )
            }
        }
    }
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