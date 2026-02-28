package com.example.moviles.ui.theme.practica

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowCircleDown
import androidx.compose.material.icons.filled.ArrowCircleUp
import androidx.compose.material.icons.filled.AutoFixHigh
import androidx.compose.material.icons.filled.Folder
import androidx.compose.material.icons.filled.Minimize
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.moviles.R
import com.example.moviles.ui.theme.NetColor
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.example.moviles.ui.theme.CourtColor1
import com.example.moviles.ui.theme.CourtColor2


@Preview(showBackground = true)
@Composable

fun Tennis() {
    var number by remember {mutableStateOf(" ")}
    var number2 by remember {mutableStateOf(" ")}

    var selectedColor by remember { mutableStateOf(CourtColor1) }
    var activo by remember { mutableStateOf(true) }
    fun ChangeCourtColor() {
        activo = !activo
        if (activo) {
            selectedColor = CourtColor1
        } else {
            selectedColor = CourtColor2
        }
    }

    var puntos1 by remember { mutableStateOf(0) }
    var puntos2 by remember { mutableStateOf(0) }

    Box(modifier = Modifier.fillMaxSize().padding(7.dp)) {
        Column(modifier = Modifier.fillMaxSize()) {
            Column(modifier = Modifier.fillMaxWidth().height(225.dp)) {
                Row(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
                    Box(
                        modifier = Modifier
                            .padding(
                                start = 3.dp,
                                top = 3.dp,
                                end = 3.dp,
                                bottom = 0.dp
                            )
                            .fillMaxHeight()
                            .fillMaxWidth(0.2f)
                            .background(selectedColor)
                    ) {}

                    Column(modifier = Modifier.fillMaxHeight().fillMaxWidth(.7f)) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight(0.5f)
                                .padding(start = 3.dp,
                                    top = 3.dp,
                                    end = 3.dp,
                                    bottom = 3.dp)
                                .background(selectedColor)
                        ) {}

                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight()
                                .padding(start = 3.dp,
                                    top = 3.dp,
                                    end = 3.dp,
                                    bottom = 0.dp)
                                .background(selectedColor)
                        ) {}
                    }

                    Box(
                        modifier = Modifier
                            .padding(start = 3.dp,
                                top = 3.dp,
                                end = 3.dp,
                                bottom = 0.dp)
                            .fillMaxHeight()
                            .fillMaxWidth()
                            .background(selectedColor)
                    ) {}


                }

            }

            Divider(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(6.dp)
                    .background(NetColor),
                thickness = 2.dp,
                color = Color.Black
            )

            Column(modifier = Modifier.fillMaxWidth().height(225.dp)) {
                Row(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
                    Box(
                        modifier = Modifier
                            .padding(
                                start = 3.dp,
                                top = 0.dp,
                                end = 3.dp,
                                bottom = 3.dp
                            )
                            .fillMaxHeight()
                            .fillMaxWidth(0.2f)
                            .background(selectedColor)
                    ) {}

                    Column(modifier = Modifier.fillMaxHeight().fillMaxWidth(.7f)) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight(0.5f)
                                .padding(start = 3.dp,
                                    top = 0.dp,
                                    end = 3.dp,
                                    bottom = 3.dp)
                                .background(selectedColor)
                        ) {}

                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight()
                                .padding(start = 3.dp,
                                    top = 3.dp,
                                    end = 3.dp,
                                    bottom = 3.dp)
                                .background(selectedColor)
                        ) {}
                    }

                    Box(
                        modifier = Modifier
                            .padding(start = 3.dp,
                                top = 0.dp,
                                end = 3.dp,
                                bottom = 0.dp)
                            .fillMaxHeight()
                            .fillMaxWidth()
                            .background(selectedColor)
                    ) {}


                }

            }

            Row(modifier = Modifier
                .fillMaxWidth()
                .height(   150.dp)
                .padding(5.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically) {
                Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                    Image(
                        painter = painterResource(id = R.drawable.reyes),
                        contentDescription = "My image",
                        modifier = Modifier
                            .padding(3.dp)
                            .size(70.dp)
                    )

                    Text(text = number)

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            imageVector = Icons.Filled.ArrowCircleDown,
                            contentDescription = "My image",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .fillMaxHeight()
                                .padding(2.dp)
                                .size(20.dp)
                                .clickable() {
                                    puntos1 -= 1
                                },
                            contentScale = ContentScale.Fit
                        )

                        Text(text = puntos1.toString())

                        Image(
                            imageVector = Icons.Filled.ArrowCircleUp,
                            contentDescription = "My image",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .fillMaxHeight()
                                .padding(2.dp)
                                .size(20.dp)
                                .clickable() {
                                    puntos1 += 1
                                },
                            contentScale = ContentScale.Fit
                        )
                    }
                }

                Text(text = "VS",
                    modifier = Modifier.padding(15.dp))

                Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                    Image(
                        painter = painterResource(id = R.drawable.reyes),
                        contentDescription = "My image",
                        modifier = Modifier
                            .padding(3.dp)
                            .size(70.dp)
                    )

                    Text(text = number2)

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            imageVector = Icons.Filled.ArrowCircleDown,
                            contentDescription = "My image",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .fillMaxHeight()
                                .padding(2.dp)
                                .size(20.dp)
                                .clickable() {
                                    puntos2 -= 1
                                },
                            contentScale = ContentScale.Fit
                        )

                        Text(text = puntos2.toString())

                        Image(
                            imageVector = Icons.Filled.ArrowCircleUp,
                            contentDescription = "My image",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .fillMaxHeight()
                                .padding(2.dp)
                                .size(20.dp)
                                .clickable() {
                                    puntos2 += 1
                                },
                            contentScale = ContentScale.Fit
                        )
                    }
                }
            }

            Row(modifier = Modifier
                .fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceEvenly){
                Column(modifier = Modifier.fillMaxHeight().width(90.dp)) {
                    Text(text = "Jugador 1")
                    TextField(value = number, onValueChange = { textoEscrito ->
                        if(textoEscrito != null) {
                            number = textoEscrito
                        }
                    })
                }
                Column(modifier = Modifier.fillMaxHeight().width(90.dp)) {
                    Text(text = "Jugador 2")
                    TextField(value = number2, onValueChange = { textoEscrito ->
                        if(textoEscrito != null) {
                            number2 = textoEscrito
                        }
                    })
                }
            }
        }
    }

    Image(
        imageVector = Icons.Filled.AutoFixHigh,
        contentDescription = "My image",
        colorFilter = ColorFilter.tint(Color.Black),
        modifier = Modifier
            .clickable() {
                ChangeCourtColor()
            }
            .padding(2.dp)
            .size(30.dp)
            ,
        contentScale = ContentScale.Fit
    )
}

//Divider(
//modifier = Modifier.fillMaxWidth(),
//thickness = 2.dp,
//color = Color.LightGray
//)