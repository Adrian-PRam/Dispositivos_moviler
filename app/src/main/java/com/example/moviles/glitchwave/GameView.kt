package com.example.moviles.glitchwave

import com.example.moviles.sie.AlumnoModel
import com.example.moviles.ui.theme.LightRed
import com.example.moviles.ui.theme.ProductModel
import android.widget.AdapterView
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.actividad1am.R

import java.nio.file.WatchEvent

@Preview(showBackground = true)
@Composable
fun GamePreview() {
    val computadora = GameModel(
        imagen = R.drawable.klonoa2,
        nombre = "R4: Ridge Racer Type 4",
        clasificacion = "E",
        precio = 50,
        consola = "PS1",
        isAdded = false
        )
    GameView(
        computadora
    ){}
}
@Composable
fun GameView(game: GameModel, selected: () -> Unit) {
    val isAdded = game.isAdded

    val word = if (isAdded) "Agregado" else "Agregar al carrito"
    val currentColor = if (isAdded) Color.Black else Color.LightGray
    val currentColorLetter = if (isAdded) Color.White else Color.Black

//    fun cambiarTexto() {
//        if (activo) {
//            word = "Agregado"
//            currentColor = Color.Black
//            currentColorLetter = Color.White
//        } else {
//            word = "Agregar al carrito"
//            currentColor = Color.LightGray
//            currentColorLetter = Color.Black
//        }
//        activo = !activo
//    }

    Card(modifier = Modifier.fillMaxWidth().padding(10.dp),
        colors = CardDefaults.cardColors(
            containerColor = LightRed
        )) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Row(modifier = Modifier.padding(4.dp), verticalAlignment = Alignment.CenterVertically) {
                Column() {
                    Image(
                        painter = painterResource(id = game.imagen),
                        contentDescription = "imagen cool",
                        modifier = Modifier.size(size = 100.dp)
                            .clip(RectangleShape)
                    )
                }


                Column(modifier = Modifier.padding(4.dp)) {
                    Text(text = game.nombre, fontSize = 20.sp)
                    Text(text = "Precio: " + game.precio.toString() + "$", fontSize = 13.sp)
                    Text(text = "Consola: " + game.consola, fontSize = 13.sp)
                    Text(text = "Clasificacion:  " + game.clasificacion, fontSize = 13.sp)

                    Spacer(modifier = Modifier.size(10.dp))

                    Button(
                        onClick = {
                            selected() }, colors = ButtonDefaults.buttonColors(currentColor, contentColor = currentColorLetter) ) {Text(text = word)}

                }
            }
        }
    }
}





