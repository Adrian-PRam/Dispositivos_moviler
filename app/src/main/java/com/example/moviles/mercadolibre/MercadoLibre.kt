package com.example.moviles.mercadolibre

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.actividad1am.R


@Composable
fun MercadoLibre(navController: NavHostController){

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.mercadolibre),
            contentDescription = "Logo",
            modifier = Modifier
                .height(150.dp)
                .width(300.dp)
        )

        LazyRow(modifier = Modifier.padding(15.dp)) {

            items(listaCategorias) { categoria ->

                Box(
                    modifier = Modifier
                        .size(250.dp)
                        .padding(5.dp)
                        .clickable {
                            // 👇 NAVEGACIÓN A PRODUCTOS
                            navController.navigate(
                                Productos(categoria.nombre)
                            )
                        }
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
                                .background(Color.LightGray),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = categoria.nombre,
                                fontSize = 20.sp,
                                color = Color.Black
                            )
                        }

                        Image(
                            painter = painterResource(id = categoria.imagen),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(4.dp)
                        )
                    }
                }
            }
        }
    }
}