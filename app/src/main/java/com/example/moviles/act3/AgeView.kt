package com.example.moviles.act3

import com.example.moviles.sie.AlumnoViewModel
import com.example.moviles.sie.CoordEscuela
import com.example.moviles.sie.ListView2
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.texto.navegacion.ReportModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import com.example.actividad1am.R
import com.example.moviles.sie.NavManager


//@Preview(showBackground = true)
@Composable

fun EdadResultadoView(edadUsuario: EdadIngresada, navegante: NavHostController)
 {
    var mensaje by remember { mutableStateOf("") }
     var imagen by remember {
         mutableStateOf(com.example.actividad1am.R.drawable.joven)
     }

    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Edad del usuario: ${edadUsuario.edad}",
            fontSize = 40.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold
        )


        val (mensaje, imagen) = when (edadUsuario.edad) {
            in 0..14 -> "Menor de edad" to R.drawable.nino
            15 -> "Mayor de edad en Indonesia pero no en México" to R.drawable.joven
            16 -> "Mayor de edad en Cuba pero no en México" to R.drawable.joven
            17 -> "Mayor de edad en Corea del Norte pero no en México" to R.drawable.joven
            18 -> "Mayor de edad en México y gran parte de Latinoamérica" to R.drawable.joven
            19 -> "Mayor de edad en Corea del Sur" to R.drawable.joven
            20 -> "Mayor de edad en Japón" to R.drawable.joven
            in 1..59 -> "Mayor de edad en USA y posiblemente en todo el mundo" to R.drawable.joven
            in 60..64 -> "Eres de la tercera edad" to R.drawable.anciano
            in 65..100 -> "Ya te puedes jubilar" to R.drawable.anciano
            else -> "Edad no contemplada" to R.drawable.joven
        }


        Text(text = mensaje)

        Image(
            painter = painterResource(id = imagen),
            contentDescription = null,
            modifier = Modifier.size(150.dp)
        )

        Button(onClick = {
            navegante.popBackStack()
        }) {
            Text(text = "Regresar", modifier = Modifier.padding(4.dp))
        }
    }

    }


//@Preview(showBackground = true)
//@Composable
//
//fun EdadD() {
//    val reporteEdad = EdadIngresada(10)
//    EdadResultadoView(reporteEdad, )
//}