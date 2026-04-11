package com.example.moviles.glitchwave

import com.example.moviles.sie.AlumnoModel

import androidx.compose.ui.graphics.Color
import com.example.actividad1am.R


class GameViewModel {
    fun getGames(): List<GameModel> {
        var gameList = mutableListOf<GameModel>()
        gameList.add(
            GameModel(
                imagen = R.drawable.ridge_racer,
                nombre = "R4: Ridge Racer Type 4",
                clasificacion = "E",
                precio = 50,
                consola = "PS1",
                isAdded = false
            ),
        )

        gameList.add(
            GameModel(
                imagen = R.drawable.castlevania,
                nombre = "Castlevania",
                clasificacion = "E",
                precio = 80,
                consola = "NES",
                isAdded = false
            ),
        )

        gameList.add(
            GameModel(
                imagen = R.drawable.discogoat,
                nombre = "Disco Elysium",
                clasificacion = "R",
                precio = 40,
                consola = "PC",
                isAdded = false
            ),
        )

        gameList.add(
            GameModel(
                imagen = R.drawable.fallout_nv,
                nombre = "Fallout: New Vegas",
                clasificacion = "T",
                precio = 60,
                consola = "XBOX360",
                isAdded = false
            ),
        )

        gameList.add(
            GameModel(
                imagen = R.drawable.hollow_knight,
                nombre = "Hollow Knight",
                clasificacion = "T",
                precio = 50,
                consola = "XBOX: ONE",
                isAdded = false
            ),
        )

        gameList.add(
            GameModel(
                imagen = R.drawable.klonoa2,
                nombre = "Klonoa 2: Lunatea's Veil",
                clasificacion = "E",
                precio = 20,
                consola = "PS2",
                isAdded = false
            ),
        )

        gameList.add(
            GameModel(
                imagen = R.drawable.kotor,
                nombre = "Star Wars: Knights of the Old Republic",
                clasificacion = "R",
                precio = 90,
                consola = "XBOX",
                isAdded = false
            ),
        )

        return gameList


    }
}