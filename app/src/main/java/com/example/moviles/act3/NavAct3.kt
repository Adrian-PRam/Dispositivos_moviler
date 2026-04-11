package com.example.moviles.act3

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.moviles.glitchwave.ListView3
import com.example.moviles.glitchwave.UserInfo
import kotlinx.serialization.Serializable

@Serializable
data class EdadIngresada(
    val edad: Int
)

@Serializable
object
EdadHome

@Preview(showBackground = true)
@Composable
fun AppNavigation() {
    val navController = rememberNavController()
2
    NavHost(navController = navController, startDestination = EdadHome) {

        composable<EdadHome> {
            LoginEdadView(navController)
        }

        composable<EdadIngresada> {
            val datosEdad: EdadIngresada = it.toRoute()
            EdadResultadoView(datosEdad, navController)
        }


    }
}