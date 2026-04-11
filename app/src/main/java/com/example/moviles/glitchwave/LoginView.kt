package com.example.moviles.glitchwave

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import com.example.moviles.sie.CoordEscuela
import com.example.moviles.sie.Error
import com.example.moviles.sie.EstudianteEscuela
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.actividad1am.R
import com.example.moviles.ui.theme.LightRed


@Composable
fun LoginView(navegante: NavHostController) {
    var userName by remember { mutableStateOf("") }
    var userEdad by remember { mutableStateOf("") }
    var userDinero by remember { mutableStateOf("") }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(modifier = Modifier
            .height(500.dp)
            .width(280.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(LightRed),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.glitchwave),
                contentDescription = "My image",
                modifier = Modifier.size(120.dp).padding(4.dp)
            )

            Text(
                "GLITCHWAVE",
                modifier = Modifier.padding(9.dp),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            TextField(
                value = userName,
                onValueChange = { userName = it },
                label = { Text(text = "Nombre del usuario") })
            TextField(
                value = userEdad,
                onValueChange = { userEdad = it },
                label = { Text(text = "Edad del usuario") })
            TextField(
                value = userDinero,
                onValueChange = { userDinero = it },
                label = { Text(text = "Dinero disponible") })

            Button(onClick = {
                navegante.navigate(
                    UserInfo( userName = userName,
                        userEdad = userEdad,
                        userDinero = userDinero))
            }) {
                Text(text = "Enviar Datos", modifier = Modifier.padding(4.dp))
            }


        }
    }
}