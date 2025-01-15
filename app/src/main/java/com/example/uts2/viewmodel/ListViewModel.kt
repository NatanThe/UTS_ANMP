package com.example.uts2.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.volley.RequestQueue
import com.android.volley.toolbox.Volley
import com.example.uts2.model.Games

class ListViewModel(application: Application):
    AndroidViewModel(application){
    val TAG = "volleyTag"
    private var queue: RequestQueue? = null
    val gamesLD = MutableLiveData<ArrayList<Games>>()
    val gameLoadErrorLD = MutableLiveData<Boolean>()
    val loadingLD = MutableLiveData<Boolean>()

    fun refresh() {
        gamesLD.value = arrayListOf(
            Games("Valorant","Valorant is a team-based first-person tactical hero shooter set in " +
                    "the near future.Players play as one of a set of Agents, characters based on several countries and cultures around the world." +
                    "In the main game mode, players are assigned to either the attacking or defending team with each team having five players on it. " +
                    "Agents have unique abilities, each requiring charges, as well as a unique ultimate ability that requires charging through kills, deaths, orbs, or objectives."),
            Games("Mobile Legends : BANG BANG","Mobile Legends: Bang Bang is a multiplayer online battle arena (MOBA) game designed for mobile phones. " +
                    "The game is free-to-play and is only monetized through in-game purchases like characters and skins. " +
                    "Each player can control a selectable character, called a Hero, with unique abilities and traits."),
            Games("Honor Of Kings","Honor of Kings is a multiplayer online battle arena (MOBA) game in which the player controls a character with unique abilities and competes " +
                    "to defeat non-player characters and opponents to gain experience points and gold. With experience points, " +
                    "players can unlock their characters' abilities or further augment the power of their existing abilities."),
            Games("DOTA 2","Dota 2 is a multiplayer online battle arena (MOBA) video game in which two teams of five players compete to destroy a large structure defended by the opposing team known as the \"Ancient\" " +
                    "whilst defending their own. As in Defense of the Ancients, the game is controlled using standard real-time strategy controls, and is presented on a single map in a three-dimensional isometric perspective." +
                    "Ten players each control one of the game's 125 playable characters, known as \"heroes\", with each having their own design, strengths, and weaknesses. Heroes are divided into two primary roles, known as the core and support."),
            Games("League Of Legends","League of Legends is a multiplayer online battle arena (MOBA) game in which the player controls a character (\"champion\") with a set of unique abilities from an isometric perspective. " +
                    "As of 2024, there are 168 champions available to play. Over the course of a match, champions gain levels by accruing experience points (XP) through killing enemies. Items can be acquired to increase champions' strength," +
                    "and are bought with gold, which players accrue passively over time and earn actively by defeating the opposing team's minions, champions, or defensive structures."),
            Games("Counter Strike 2","Counter-Strike 2 is a multiplayer tactical first-person shooter, in which two teams, the Counter-Terrorists and the Terrorists, compete to complete different objectives, depending on the game mode selected. " +
                    "Most game modes play out over several rounds; in-between rounds, players are able to purchase different weapons and equipment to use.")
        )

        gameLoadErrorLD.value = false
        loadingLD.value = true

        queue = Volley.newRequestQueue( getApplication() )
        val url = ""
    }

}


