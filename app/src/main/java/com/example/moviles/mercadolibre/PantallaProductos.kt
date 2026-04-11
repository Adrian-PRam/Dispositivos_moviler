package com.example.moviles.mercadolibre

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource


@Composable
fun PantallaProductos(
    categoria: String,
    onBack: () -> Unit
) {

    val productos = when (categoria) {
        "Tecnología" -> listaTecnologia
        "Ropa y moda" -> listaRopa
        "Videojuegos" -> listaGaming
        "Electrodomésticos" -> listaElectro
        else -> emptyList()
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = categoria,
            fontSize = 25.sp,
            modifier = Modifier.padding(10.dp)
        )

        LazyRow {

            items(productos) { producto ->

                Column(
                    modifier = Modifier
                        .size(200.dp)
                        .padding(10.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .background(Color.LightGray)
                        .padding(5.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Image(
                        painter = painterResource(id = producto.imagen),
                        contentDescription = null,
                        modifier = Modifier.size(100.dp)
                    )

                    Text(text = producto.nombre)
                    Text(text = "$${producto.precio}")

                    if (producto.envioGratis) {
                        Text("Envío gratis", color = Color.Green)
                    }

                    producto.descuento?.let {
                        Text(it, color = Color.Red)
                    }
                }
            }
        }

        Text(
            text = "Volver",
            color = Color.Blue,
            modifier = Modifier
                .padding(20.dp)
                .clickable() { onBack() }
        )
    }
}