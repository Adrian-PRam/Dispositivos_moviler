package com.example.moviles.mercadolibre

import android.content.ClipData
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.actividad1am.R
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue


@Preview(showBackground = true)
@Composable

fun MercadoLibre(){
    val categorias = listOf(
        "Accesorios para vehículos",
        "Deportes",
        "Electrónica",
        "Hogar",
        "Ropa"
    )
    var imagen by remember { mutableStateOf(R.drawable.accesorios) }
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = R.drawable.mercadolibre),
            contentDescription = "My image",
            modifier = Modifier.height(150.dp).width(300.dp).padding(end = 10.dp)
        )

        LazyRow(modifier = Modifier.padding(15.dp)) {
            items(categorias) { categoria ->
                Box(
                    modifier = Modifier
                        .size(250.dp)
                        .padding(5.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .size(200.dp)
                            .clip(RoundedCornerShape(10.dp))
                            .background(Color.Gray)
                            .padding(5.dp)
                    ) {

                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(60.dp)
                                .background(Color.LightGray)
                        ) {
                            Text(
                                text = categoria,
                                fontSize = 20.sp,
                                color = Color.Black,
                            )
                        }

                        Image(
                            painter = painterResource(id = R.drawable.accesorios),
                            contentDescription = null,
                            modifier = Modifier.fillMaxSize().padding(4.dp)
                        )
                    }
                }
            }
        }
    }
}