package com.example.moviles.glitchwave

import androidx.compose.ui.graphics.Color

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

data class GameModel(
    val imagen: Int,
    val nombre: String,
    val clasificacion: String,
    val precio: Int,
    val consola: String,
    val isAdded: Boolean = false
)