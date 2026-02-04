package com.example.moviles.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.moviles.R

@Preview(showBackground = true)
@Composable

fun Multiservicios() {
    Box(modifier = Modifier.fillMaxWidth().background(Color.DarkGray).height(615.dp)) {
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
                .height(350.dp)) {
                Text(text = "Multiservicios Castan: " +
                        "Soluciones para tu hogar en Tampico",
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(3.dp),
                    fontSize = 30.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center)
            }

            Box(Modifier
                .fillMaxWidth()
                .height(27.dp)
                .offset(y = 350.dp)
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
                .offset(y = 377.dp)
                .background(Color.DarkGray)) {

                Image(
                    painter = painterResource(id = R.drawable.facebook_icons),
                    contentDescription = "My image",
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(6.dp)
                        .align(Alignment.Center),
                    contentScale = ContentScale.Fit
                )
            }

            Box(Modifier
                .fillMaxWidth()
                .height(300.dp)
                .offset(y = 417.dp)
                .background(Color.DarkGray),
                contentAlignment = Alignment.TopCenter) {

                Text(text = "En Multiservicios Castan ofrecemos todo tipo de servicios para\n" +
                        "el mantenimiento y reparación del hogar en Tampico,\n" +
                        "Tamaulipas. Desde aire acondicionado, pintura, plomería y\n" +
                        "electricidad, hasta albañilería, herrería e impermeabilizado.",
                    modifier = Modifier
                        .align(Alignment.TopCenter)
                        .padding(3.dp),
                    fontSize = 14.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center)
            }

        }

        Image(
            painter = painterResource(id = R.drawable.multiservicios),
            contentDescription = "My image",
            modifier = Modifier
                .size(200.dp)
                .align(Alignment.TopCenter)
                .clip(CircleShape)
                .border(
                    width = 4.dp,
                    color = Color.Black,
                    CircleShape
                )
        )


    }
}