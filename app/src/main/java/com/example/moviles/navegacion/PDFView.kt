package com.example.moviles.navegacion

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.texto.navegacion.ReportModel

@Preview(showBackground = true)
@Composable

fun PDFView(generarReporte: ReportModel = ReportModel(1, "juan", "pollo")
) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "Nombre de la seccion: ${generarReporte.nombreSeccion}")
        Text(text = "Numero de la seccion: ${generarReporte.numSeccion}")
        Text(text = "Nombre del encargado: ${generarReporte.nombreEncargado}")
    }
}

//@Preview(showBackground = true)
@Composable

fun PDFPreview() {
    val reporte = ReportModel(1, "juan", "pollo")
    PDFView(reporte)
}