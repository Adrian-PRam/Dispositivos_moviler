package com.example.moviles.glitchwave

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
object Home3

@Serializable
data class UserInfo(
    val userName: String,
    val userEdad: String,
    val userDinero: String
)

@Serializable
data class PaymentResult(
    val ageRestriction: Boolean,
    val moneyRestriction: Boolean,
    val initMoney: Int,
    val totalMoney: Int
)

@Preview(showBackground = true)
@Composable

fun NavManager() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = Home3){

        composable<Home3>{
            LoginView(navController)
        }

        composable <UserInfo> {
            val datosUsuario: UserInfo = it.toRoute()
            ListView3(datosUsuario, navController)
        }

        composable <PaymentResult> {
            val datosResultado: PaymentResult = it.toRoute()
            PaymentSummary(datosResultado)
        }



    }
}