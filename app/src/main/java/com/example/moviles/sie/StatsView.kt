package com.example.moviles.sie

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import androidx.compose.ui.unit.sp
import com.example.texto.navegacion.ReportModel
import androidx.lifecycle.viewmodel.compose.viewModel

@Preview(showBackground = true)
@Composable

fun StatsView(generarReporte2: CoordEscuela = CoordEscuela(1, "juan")
) {

    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "Nombre del Coordinador: ${generarReporte2.userName}",
            fontSize = 20.sp)
        Text(text = "Numero de ID: ${generarReporte2.userId}",
            fontSize = 20.sp)

        val Brown = Color(0x61865200)
        val productVM = AlumnoViewModel()
        var estado by remember { mutableStateOf(0) }
        var contador by remember { mutableStateOf(0) }

        ListView2(1)


    }
}

@Preview(showBackground = true)
@Composable

fun PDFPreview() {
    val reporte2 = CoordEscuela(1, "juan")
    StatsView(reporte2)
}