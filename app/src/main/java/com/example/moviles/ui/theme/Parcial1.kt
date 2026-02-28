package com.example.moviles.ui.theme

import android.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowDownward
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.ArrowLeft
import androidx.compose.material.icons.filled.ArrowUpward
import androidx.compose.material.icons.filled.AutoFixHigh
import androidx.compose.material.icons.filled.PowerSettingsNew
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp


@Preview(showBackground = true)
@Composable

fun GameBoy() {
    var personaje by remember { mutableStateOf("") }
    var activo by remember { mutableStateOf(false) }
    var controller by remember { mutableStateOf(0)}


        Box(modifier = Modifier
        .padding(6.dp)
        .clip(RoundedCornerShape(9.dp))
        .fillMaxSize()
        .background(Indigo)) {
        Column(modifier = Modifier
            .fillMaxSize()) {
            Box(
                modifier = Modifier.fillMaxWidth().height(20.dp),
                contentAlignment = Alignment.TopEnd
            ) {
                Image(
                    imageVector = Icons.Filled.PowerSettingsNew,
                    contentDescription = "My image",
                    colorFilter = ColorFilter.tint(Color.White),
                    modifier = Modifier
                        .clickable() {
                            if (controller == 0){
                                controller = 1
                            } else {
                                controller = 0
                            }
                            
                        }
                        .padding(2.dp)
                        .size(30.dp),
                    contentScale = ContentScale.Fit
                )
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.5f)
                    .padding(8.dp)
                    .clip(RoundedCornerShape(7.dp))
                    .background(Color.Black)
            ) {
                when (controller) {
                    1 -> {
                        Personajes()
                    }

                    2 -> {
                        PersonajesUp()
                    }

                    4 -> {
                        PersonajesRight()
                    }

                    3 -> {
                        PersonajesLeft()
                    }

                    5 -> {
                        PersonajesDown()
                    }

                    6 -> {
                        PersonajesMii()
                    }

                    else -> {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight(0.5f)
                                .padding(8.dp)
                                .clip(RoundedCornerShape(7.dp))
                                .background(Color.Black)
                        ) {}
                    }
                }

            }

            Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth().padding(8.dp)) {
                Text(text = "Selecciona a un personaje",
                    color = Color.Yellow,
                    fontSize = 18.sp)

                TextField(value = personaje, onValueChange = { textoEscrito ->
                    if (textoEscrito != null) {
                        personaje = textoEscrito
                    }
                })
            }

            Row(modifier = Modifier.padding(8.dp).fillMaxHeight(0.8f).fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically) {
                Column(modifier = Modifier.width(100.dp).height(150.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center) {
                    Image(
                        imageVector = Icons.Filled.ArrowUpward,
                        contentDescription = "My image",
                        colorFilter = ColorFilter.tint(Color.Black),
                        modifier = Modifier
                            .clickable() {
                                controller = 2
                            }
                            .padding(2.dp)
                            .size(30.dp),
                        contentScale = ContentScale.Fit
                    )

                    Row(modifier = Modifier.fillMaxWidth().height(50.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween) {
                        Image(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "My image",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .clickable() {
                                    controller = 3
                                }
                                .padding(2.dp)
                                .size(30.dp),
                            contentScale = ContentScale.Fit
                        )

                        Image(
                            imageVector = Icons.Filled.ArrowForward,
                            contentDescription = "My image",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier
                                .clickable() {
                                    controller = 4
                                }
                                .padding(2.dp)
                                .size(30.dp),
                            contentScale = ContentScale.Fit
                        )
                    }
                    Image(
                        imageVector = Icons.Filled.ArrowDownward,
                        contentDescription = "My image",
                        colorFilter = ColorFilter.tint(Color.Black),
                        modifier = Modifier
                            .clickable() {
                                controller = 5
                            }
                            .padding(2.dp)
                            .size(30.dp),
                    )
                }

                Column(modifier = Modifier.width(100.dp).height(150.dp)) {
                    Box(contentAlignment = Alignment.TopEnd, modifier = Modifier.fillMaxWidth().fillMaxHeight(0.5f)){
                        Button(onClick = { controller = 6}
                            , colors = ButtonDefaults.buttonColors(
                                contentColor = Color.White,
                                containerColor = Color.Blue),
                            modifier = Modifier.size(49.dp)) {
                            Text(text = "A",
                                color = Color.White,
                                )
                        }
                    }
                    Box(contentAlignment = Alignment.TopStart, modifier = Modifier.fillMaxWidth().fillMaxHeight()){
                        Button(onClick = { controller = 1}
                            , colors = ButtonDefaults.buttonColors(
                                contentColor = Color.White,
                                containerColor = Color.Blue),
                            modifier = Modifier.size(49.dp)) {
                            Text(text = "B",
                                color = Color.White,
                            )
                        }
                    }

                }
            }

            Box(modifier = Modifier.fillMaxWidth().fillMaxHeight(),
                contentAlignment = Alignment.BottomCenter){
                Text(text = "Nintendo ISDN 5Ds",
                    color = Color.White,
                    fontSize = 18.sp,
                    modifier = Modifier.padding(8.dp))
            }
        }

    }
}