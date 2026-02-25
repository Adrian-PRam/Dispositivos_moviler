package com.example.moviles.ui.theme

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.moviles.R

@Preview(showBackground = true)
@Composable

fun ListView() {
    val productVM = ProductViewModel()
    var estado by remember { mutableStateOf(0) }
    fun cambiarColor(): Color {
        return if (estado == 0) Color.Black else Color.Blue
    }
    Column(modifier = Modifier.fillMaxSize()) {
        LazyColumn(modifier = Modifier.background(cambiarColor()).padding(30.dp)) {
            item{
                Text(text = "hola")
            }
            items(items = productVM.getProducts()) { producto ->
                ProductView(producto, selected = {
                    Log.d("EVENTO", "provando el evento del producto")
                    estado = 1
                })
            }
            item {
                Text(text = "adios")
            }
        }
    }
}