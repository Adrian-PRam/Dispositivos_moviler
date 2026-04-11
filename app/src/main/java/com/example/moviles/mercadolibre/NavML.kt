package com.example.moviles.mercadolibre

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import kotlinx.serialization.Serializable

@Serializable
object Home4

@Serializable
data class Productos(val categoria: String)

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
            MercadoLibre(navController)
        }

        composable<Productos> { backStack ->

            val data = backStack.toRoute<Productos>()

            PantallaProductos(
                categoria = data.categoria,
                onBack = { navController.popBackStack() }
            )
        }
    }
}