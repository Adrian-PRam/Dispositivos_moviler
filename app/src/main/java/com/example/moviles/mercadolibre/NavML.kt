package com.example.moviles.mercadolibre

import com.example.moviles.glitchwave.ListView3
import com.example.moviles.glitchwave.LoginView
import com.example.moviles.glitchwave.PaymentSummary
import com.example.moviles.sie.ErrorView
import com.example.moviles.sie.EscuelaView
import com.example.moviles.sie.MateriaInfo
import com.example.moviles.sie.StatsStudentView
import com.example.moviles.sie.StatsView
import android.app.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.moviles.navegacion.PDFView
import com.example.moviles.sie.CoordEscuela
import kotlinx.serialization.Serializable

@Serializable
object Home4

data class Categoria(
    val nombre: String,
    val imagen: Int
)

data class Producto(
    val nombre: String,
    val precio: Double,
    val imagen: Int,
    val envioGratis: Boolean,
    val descuento: String? = null
)
@Preview(showBackground = true)
@Composable

fun NavManager() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = Home4){

        composable<Home4>{
            LoginView(navController)
        }



    }
}