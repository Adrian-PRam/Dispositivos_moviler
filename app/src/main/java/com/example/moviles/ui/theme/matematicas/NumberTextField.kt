package com.example.moviles.ui.theme.matematicas


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


//@Preview(showBackground = true)
@Composable

fun NumberTextField(modificador: Modifier, fill: (String)-> Unit) {

    var number by remember {
        mutableStateOf("")
    }

    Column(modifier = modificador) {
        TextField(value = number, onValueChange = { textoEscrito ->
            if(textoEscrito != null) {
                number = textoEscrito
                fill(number)
            }
        })
    }
}

@Preview(showBackground = true)
@Composable

fun NumberTextFieldPreview() {
    var texto by remember{ mutableStateOf("")}
    Column() {
        Text(text = texto)
        NumberTextField(modificador = Modifier.fillMaxWidth()) {
            texto = it
        }
    }
}