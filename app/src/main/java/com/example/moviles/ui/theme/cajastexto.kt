package com.example.moviles.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposeCompilerApi
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.moviles.R
import com.example.moviles.ui.theme.matematicas.NumberTextField

@Preview(showBackground = true)
@Composable

fun CajasTexto() {
    var number by remember {
        mutableStateOf("")
    }

    var number2 by remember {
        mutableStateOf("")
    }

    var result by remember {
        mutableStateOf("")
    }

    Column(modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center) {
        Row(modifier = Modifier.fillMaxWidth()) {
            NumberTextField(modificador = Modifier.fillMaxWidth().weight(2f)){number = it}
                Spacer(modifier = Modifier.fillMaxWidth().weight(1f))
            NumberTextField(modificador = Modifier.fillMaxWidth().weight(2f)){number2 = it}

        }


        Spacer(modifier = Modifier.height(16.dp))
        Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth()) {
            OutlinedButton(onClick = {
                if (number.toIntOrNull() != null && number2.toIntOrNull() != null) {
                result = (number.toInt() - number2.toInt()).toString()
            } else {
                result = "Por favor ingresa solo numeros"
            }}) {
                Text("Restar")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Text("Borrar todo", modifier = Modifier.clickable(
                onClick = {
                    number = ""
                    number2 = ""
                    result = ""
                }
            ))
            IconButton(onClick = {
                if (number.toIntOrNull() != null && number2.toIntOrNull() != null) {
                    result = (number.toInt() + number2.toInt()).toString()
                } else {
                    result = "Por favor ingresa solo numeros"
                } }
            ) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "sumar")
            }
        }
        Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth()) {
            Button(onClick = {
                if (number.toIntOrNull() != null && number2.toIntOrNull() != null) {
                    result = (number.toInt() * number2.toInt()).toString()
                } else {
                    result = "Por favor ingresa solo numeros"
                }
            }) {
                Text("Multiplicar")
            }
            TextButton(onClick = {
                if (number.toIntOrNull() != null && number2.toIntOrNull() != null) {
                    result = (number.toInt() / number2.toInt()).toString()
                } else {
                    result = "Por favor ingresa solo numeros"
                }
            }) {
                Text("Dividir")
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(result)
    }
}