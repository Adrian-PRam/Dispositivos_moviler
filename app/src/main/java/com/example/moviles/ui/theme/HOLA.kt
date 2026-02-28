package com.example.moviles.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview(showBackground = true)

fun HOLA() {
    Box(modifier = Modifier.fillMaxSize()) {
            Column(modifier = Modifier.padding(50.dp).fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
                Box(Modifier.padding(50.dp).background(Color.Red)) {
                Text(text = "Hola")
            }

                Box(Modifier.padding(50.dp).background(Color.Red)) {
                    Text(text = "Hola2")
                }

                Box(Modifier.padding(50.dp).background(Color.Red)) {
                    Text(text = "Hola3")
                }
        }
    }
}