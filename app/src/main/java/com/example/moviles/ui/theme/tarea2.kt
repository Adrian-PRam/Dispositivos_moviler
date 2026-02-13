package com.example.moviles.ui.theme

import androidx.compose.foundation.Image

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Folder
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.moviles.R
import com.example.moviles.ui.theme.matematicas.NumberTextField

@Preview(showBackground = true)
@Composable

fun Reyes() {
    var imagen by remember {
        mutableStateOf(R.drawable.multiservicios)
    }

    var number by remember {
        mutableStateOf("Multiservicios Castan: " +
            "Soluciones para tu hogar en Tampico")
    }

    var icono by remember{
        mutableStateOf(Icons.Filled.Add)
    }

    var textoSeguir by remember{
        mutableStateOf("Seguir")
    }

    var activo by remember {
        mutableStateOf(false)
    }

    var activo2 by remember {
        mutableStateOf(false)
    }

    var activo3 by remember {
        mutableStateOf(false)
    }

    var parrafo by remember {
        mutableStateOf("En Multiservicios Castan ofrecemos todo tipo de servicios para\n" +
                "el mantenimiento y reparación del hogar en Tampico,\n" +
                "Tamaulipas. Desde aire acondicionado, pintura, plomería y\n" +
                "electricidad, hasta albañilería, herrería e impermeabilizado.")
    }

    fun CambiarImagenes() {
        if(activo) {
           imagen = R.drawable.multiservicios
        } else {
            imagen = R.drawable.reyes
        }
        activo = !activo
    }

    fun CambiarSeguir() {
        if(activo3) {
            icono = Icons.Filled.Add
            textoSeguir = "Seguir"
        } else {
            icono = Icons.Filled.Notifications
            textoSeguir = "Siguiendo"
        }
        activo3 = !activo3
    }

    fun CambiarParrafo() {
        if(activo2) {
            parrafo = "En Multiservicios Castan ofrecemos todo tipo de servicios para\n" +
                    "el mantenimiento y reparación del hogar en Tampico,\n" +
                    "Tamaulipas. Desde aire acondicionado, pintura, plomería y\n" +
                    "electricidad, hasta albañilería, herrería e impermeabilizado."
        } else {
            parrafo = "Estamos trabajando en nuestra nueva plataforma digital para \n" +
                    "brindarte una experiencia mejorada."
        }
        activo2 = !activo2
    }
    Box(modifier = Modifier.fillMaxWidth().background(Color.DarkGray).height(550.dp)) {
        Box(Modifier
            .background(BackgroundBlue)
            .fillMaxWidth()
            .height(90.dp)) {

            Text(text = "Atencion las 24 horas del dia Tel (833) 312- 3062",
                modifier = Modifier
                    .align(Alignment.Center),
                fontSize = 18.sp,
                color = Color.White)

            Text(text = "Soluciones integrales para el manejoo de no se qu sale en Tampico, Madero y Altamira",
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(3.dp),
                fontSize = 10.sp,
                color = Color.White)
        }

        Box(Modifier
            .fillMaxWidth()
            .height(15.dp)
            .background(BackgroundOrange)) {
        }

        Box(Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .offset(y = 90.dp)) {
            Box(Modifier
                .background(Color.DarkGray)
                .fillMaxWidth()
                .height(250.dp)) {
                Text(text = number,
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(3.dp),
                    fontSize = 30.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold)
            }

            Box(Modifier
                .fillMaxWidth()
                .height(27.dp)
                .offset(y = 250.dp)
                .background(Color.DarkGray)) {

                Text(text = "128 seguidores · 1 seguidos",
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(3.dp),
                    fontSize = 15.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center)
            }
            Box(Modifier
                .fillMaxWidth()
                .height(40.dp)
                .offset(y = 277.dp)
                .background(Color.DarkGray)) {

                Row(horizontalArrangement = Arrangement.Center, modifier = Modifier
                    .fillMaxWidth()) {
                    Box(
                        modifier = Modifier
                            .padding(1.dp)
                            .clip(RoundedCornerShape(7.dp))
                            .background(MessengerColor)
                            .height(22.dp)
                            .width(ButtonWidth),
                            contentAlignment = Alignment.Center


                        ) {

                        Row(verticalAlignment = Alignment.CenterVertically) {

                            Image(
                                painter = painterResource(id = R.drawable.messenger),
                                contentDescription = "My image",
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .padding(6.dp),
                                contentScale = ContentScale.Fit
                            )
                            Text(
                                text = "Mensaje",
                                color = Color.White,
                                fontSize = 10.sp,
                                modifier = Modifier.clickable() {
                                    CambiarParrafo()
                                }
                            )


                        }

                    }

                    Box(
                        modifier = Modifier
                            .padding(1.dp)
                            .clip(RoundedCornerShape(7.dp))
                            .background(Color.Black)
                            .height(22.dp)
                            .width(ButtonWidth),
                        contentAlignment = Alignment.Center


                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {

                            Image(
                                imageVector = icono,
                                contentDescription = "My image",
                                colorFilter = ColorFilter.tint(Color.White),
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .padding(2.dp)
                                    .size(20.dp),
                                contentScale = ContentScale.Fit
                            )

                            Text(
                                text = textoSeguir,
                                color = Color.White,
                                fontSize = 10.sp,
                                modifier = Modifier.clickable() {
                                    CambiarSeguir()
                                }

                            )

                    }
                    }


                    Box(
                        modifier = Modifier
                            .padding(1.dp)
                            .clip(RoundedCornerShape(7.dp))
                            .background(Color.Black)
                            .height(22.dp)
                            .width(ButtonWidth),
                        contentAlignment = Alignment.Center


                    ) {

                        Row(verticalAlignment = Alignment.CenterVertically) {

                            Image(
                                imageVector = Icons.Filled.Search,
                                contentDescription = "My image",
                                colorFilter = ColorFilter.tint(Color.White),
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .padding(2.dp)
                                    .size(20.dp),
                                contentScale = ContentScale.Fit
                            )

                            Text(
                                text = "Buscar",
                                color = Color.White,
                                fontSize = 10.sp

                            )
                        }

                    }
                }


            }

            Box(Modifier
                .fillMaxWidth()
                .height(300.dp)
                .offset(y = 317.dp)
                .background(Color.DarkGray),
                contentAlignment = Alignment.TopCenter) {

                Text(text = parrafo,
                    modifier = Modifier
                        .align(Alignment.TopCenter)
                        .padding(3.dp),
                    fontSize = 14.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center)


            }



            Box(Modifier
                .fillMaxWidth()
                .height(80.dp)
                .offset(y = 390.dp),
                contentAlignment = Alignment.TopCenter) {

                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                ) {

                    Image(
                        imageVector = Icons.Filled.Folder,
                        contentDescription = "My image",
                        colorFilter = ColorFilter.tint(Color.White),
                        modifier = Modifier
                            .fillMaxHeight()
                            .padding(2.dp)
                            .size(20.dp),
                        contentScale = ContentScale.Fit
                    )

                    Text(
                        text = "Cambiar nombre pagina: ",
                        modifier = Modifier
                            .padding(3.dp),
                        fontSize = 14.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )

                    NumberTextField(modificador = Modifier.weight(2f)) {
                        number = it
                    }
                }
            }



        }

        Image(
            painter = painterResource(imagen),
            contentDescription = "My image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(200.dp)
                .align(Alignment.TopCenter)
                .clip(CircleShape)
                .border(
                    width = 4.dp,
                    color = Color.Black,
                    CircleShape
                )
                .clickable() {
                    CambiarImagenes()
                }
        )


    }
}