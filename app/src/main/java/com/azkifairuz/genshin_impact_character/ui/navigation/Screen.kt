package com.azkifairuz.genshin_impact_character.ui.navigation

sealed class Screen(val route: String){
    object Home: Screen("home")
    object Profile: Screen("profile")
    object DetailCharacter : Screen("home/{characterId}") {
        fun createRoute(characterId: Int) = "home/$characterId"
    }
}
