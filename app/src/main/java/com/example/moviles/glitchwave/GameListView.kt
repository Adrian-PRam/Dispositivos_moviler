package com.example.moviles.glitchwave

import com.example.moviles.ui.theme.ProductView
import com.example.moviles.ui.theme.ProductViewModel
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.actividad1am.R
import com.example.moviles.sie.CoordEscuela
import com.example.moviles.sie.StatsView
import com.example.moviles.ui.theme.LightRed

//@Preview(showBackground = true)
@Composable
fun ListView3(reporteGenerar: UserInfo, navegante: NavHostController) {
    val gameVM = GameViewModel()
    var expanded by remember { mutableStateOf(false) }

    var moneyRestrictionChecker by remember { mutableStateOf(false) }
    var columnFillColor by remember { mutableStateOf(Color.Black) }
    var columnTextColor by remember { mutableStateOf(Color.White) }
    var rowFillColor by remember { mutableStateOf(Color.LightGray) }
    var rowTextColor by remember { mutableStateOf(Color.Black) }

    val games = remember { mutableStateListOf<GameModel>() }

    fun puedeComprar(edad: Int, clasificacion: String): Boolean {
        return when (clasificacion) {
            "R" -> edad >= 17
            "T" -> edad >= 13
            "E" -> true
            else -> true
        }
    }

    val juegosSeleccionados = games.filter { it.isAdded }

    val puedeProceder = juegosSeleccionados.all { game ->
        puedeComprar(reporteGenerar.userEdad.toInt(), game.clasificacion)
    }

    LaunchedEffect(Unit) {
        games.addAll(gameVM.getGames())
    }

    val totalDinero = games
        .filter { it.isAdded }
        .sumOf { it.precio }


    val options = listOf("Column", "Row")
    var selectedOption by remember { mutableStateOf("Column") }

    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = R.drawable.glitchwave),
            contentDescription = "My image",
            modifier = Modifier.fillMaxWidth().height(50.dp)
        )

        Column(modifier = Modifier.clip(RoundedCornerShape(7.dp)).fillMaxWidth(0.8f).height(100.dp).padding(10.dp).background(Color.LightGray),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly) {
            Text("Username: " + reporteGenerar.userName,
                fontSize = 16.sp,
                fontFamily = FontFamily.Monospace
            )

            Text("Edad: " + reporteGenerar.userEdad,
                fontSize = 16.sp,
                fontFamily = FontFamily.Monospace
            )

            Text("Dinero: $" + reporteGenerar.userDinero,
                fontSize = 16.sp,
                fontFamily = FontFamily.Monospace
            )
        }

        Column(modifier = Modifier.clip(RoundedCornerShape(7.dp)).fillMaxWidth(0.8f).height(80.dp).padding(8.dp).background(Color.LightGray),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly) {
            Text("Total de orden: $" + totalDinero,
                fontSize = 15.sp,
                fontFamily = FontFamily.Monospace
            )
            Button(
                onClick = {
                    if (reporteGenerar.userDinero.toInt() >= totalDinero) {
                        moneyRestrictionChecker = true
                    } else {
                        moneyRestrictionChecker = false
                    }

                    navegante.navigate(
                        PaymentResult( ageRestriction = !puedeProceder, moneyRestriction = !moneyRestrictionChecker, initMoney = reporteGenerar.userDinero.toInt(), totalMoney = totalDinero))
                     }, colors = ButtonDefaults.buttonColors(LightRed, contentColor = Color.Black) ) {Text(text = "Proceder al pago")}

        }
        Row(modifier = Modifier.fillMaxWidth().height(60.dp), horizontalArrangement = Arrangement.SpaceEvenly) {
            Text(
                text = "Column",
                color = columnTextColor,
                modifier = Modifier
                    .padding(10.dp)
                    .background(columnFillColor)
                    .padding(8.dp)
                    .clickable (){
                        selectedOption = "Column"
                        columnFillColor = Color.Black
                        columnTextColor = Color.White
                        rowTextColor = Color.Black
                        rowFillColor = Color.LightGray
                    }
            )

            Text(
                text = "Row",
                color = rowTextColor,
                modifier = Modifier
                    .padding(10.dp)
                    .background(rowFillColor)
                    .padding(8.dp)
                    .clickable (){
                        selectedOption = "Row"
                        columnFillColor = Color.LightGray
                        columnTextColor = Color.Black
                        rowTextColor = Color.White
                        rowFillColor = Color.Black
                    }
            )
        }



        if (selectedOption == "Column") {

            LazyColumn {
                items(games) { game ->
                    GameView(
                        game = game,
                        selected = {
                            val index = games.indexOf(game)
                            games[index] = game.copy(isAdded = !game.isAdded)
                        }
                    )
                }
            }

        } else {

            LazyRow {
                items(games) { game ->
                    GameView(
                        game = game,
                        selected = {
                            val index = games.indexOf(game)
                            games[index] = game.copy(isAdded = !game.isAdded)
                        }
                    )
                }
            }

        }

        Row(modifier = Modifier.fillMaxWidth().height(70.dp)) {
            Text(text = "Proceder al pago")
        }


    }
}

//@Preview(showBackground = true)
//@Composable
//
//fun GameListPreview() {
//    val reporte3 = UserInfo(userName = "Adrian", userEdad = "10", userDinero = "100")
//    ListView3(reporte3, navegante = )
//}