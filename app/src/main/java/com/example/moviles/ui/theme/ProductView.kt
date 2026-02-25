package com.example.moviles.ui.theme

import android.widget.AdapterView
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.moviles.R

import java.nio.file.WatchEvent

@Preview(showBackground = true)
@Composable
fun ProductPreview() {
    val computadora = ProductModel(
        imagen = R.drawable.reyes,
        nombre = "Macbook Pro:",
        calificacion = 4.8f,
        precio = 12998,
        diaDeLlegada = "viernes")
    ProductView(
        computadora
    ) {

    }
}
@Composable
fun ProductView(producto: ProductModel, selected: () -> Unit){
    var word by remember {
        mutableStateOf("Agregar al carrito")
    }

    var activo by remember {
        mutableStateOf(true)
    }
    fun cambiarTexto() {
        if(activo) {
            word = "Agregagaste ${producto.nombre} al carrito"
        } else {
            word = "Agregar al carrito"
        }
        activo = !activo
    }
//    var imagen: Int = R.drawable.reyes
//    var nombre: String = "Macbook Pro:"
//    var calificacion: Float = 4.8f
//    var precio: Int = 12998
//    var diaDeLlegada: String = "viernes"
    Card(modifier = Modifier.fillMaxWidth().padding(10.dp)) {
        Column(modifier = Modifier.fillMaxWidth())  {
            Row(modifier = Modifier.padding(4.dp)) {
                Image(painter = painterResource(id = producto.imagen),
                    contentDescription = "imagen cool",
                    modifier = Modifier.size(size = 150.dp))

                Column(modifier = Modifier.padding(4.dp)) {
                    Text(text = producto.nombre, fontSize = 30.sp)
                    Text(text = "⭐" + producto.calificacion +  " Estrellas" , fontSize = 17.sp)
                    Text(text = "$${producto.precio}" , fontSize = 15.sp, fontWeight = FontWeight.Bold)
                    Text(text = "Llega el " + producto.diaDeLlegada, fontSize = 15.sp)
                    Spacer(modifier = Modifier.size(10.dp))
                    Button(
                        onClick = {cambiarTexto()
                                     selected()}, colors = ButtonDefaults.buttonColors(Color.Yellow, contentColor = Color.Black) ) {Text(text = word)}
                }
            }
        }
    }


}

