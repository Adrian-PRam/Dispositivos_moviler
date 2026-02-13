package com.example.moviles.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
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

@Preview(showBackground = true)
@Composable

fun Botones() {
    var word by remember {
        mutableStateOf(R.drawable.menu_icon)
    }

    var activo by remember {
        mutableStateOf(true)
    }

    /*
    fun CambiarText() {
        if(activo) {
            word = "adios"
        } else {
            word = "otra cosa"

        }
        activo = !activo
    }
    */


    fun CambiarImagen() {
        if(activo) {
            word = R.drawable.menu_icon
        } else {
            word = R.drawable.retry
        }
        activo = !activo
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {


        Image(
            painter = painterResource(id = word),
            contentDescription = "My image",
            modifier = Modifier.size(40.dp)
        )

        Button(onClick = {CambiarImagen()}
            , colors = ButtonDefaults.buttonColors(
            contentColor = Color.Cyan,
            containerColor = Color.Red)) {
            Text(text = "Click me")
        }
    }
}