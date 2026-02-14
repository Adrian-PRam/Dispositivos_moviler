package com.example.moviles.ui.theme.TextStuff

import android.R
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import org.w3c.dom.Text


@Composable

fun DisplayText(texto: String, modificador: Modifier, tamano: Int, colorFuente: Color) {
    Text(text = texto,
        fontSize = tamano.sp,
        fontWeight = FontWeight.Bold,
        modifier = modificador,
        color = colorFuente)
}