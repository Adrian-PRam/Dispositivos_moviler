package com.example.texto.navegacion

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
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



@Composable
fun ReportView(navegante: NavHostController) {
    var nombreSeccion by remember { mutableStateOf("") }
    var numSeccion by remember { mutableStateOf("") }
    var nombreEnargado by remember { mutableStateOf("") }
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Reporte de ventas")
        Button(onClick = {
            navegante.popBackStack()
        }) {
            Text("Regresar")
        }

        TextField(value = nombreSeccion, onValueChange = {nombreSeccion = it}, label = {Text(text = "Nombre de la seccion")})
        TextField(value = numSeccion, onValueChange = {numSeccion = it}, label = {Text(text = "Numero de la seccion")})
        TextField(value = nombreEnargado, onValueChange = {nombreEnargado = it}, label = {Text(text = "Nombre del encargado")})
        Button(onClick = {
            navegante.navigate(
                ReportModel( numSeccion = numSeccion.trim().toInt(),
                    nombreEncargado = nombreEnargado,
                    nombreSeccion = nombreSeccion))
        }) {
            Text(text = "Enviar Datos")
        }


    }
}