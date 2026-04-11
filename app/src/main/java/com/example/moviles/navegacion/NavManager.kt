package com.example.texto.navegacion

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.moviles.navegacion.PDFView
import kotlinx.serialization.Serializable

@Serializable
object Home

@Serializable
object Report

@Serializable
data class ReportModel(
    val numSeccion: Int,
    val nombreEncargado: String,
    val nombreSeccion: String
)

@Preview(showBackground = true)
@Composable

fun NavManager() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = Home){

        composable<Home>{
            HomeView(navController)
        }

        composable<Report> {
            ReportView(navController)
        }

        composable <ReportModel>{
            val datos: ReportModel = it.toRoute()
            PDFView(datos)
        }
    }
}