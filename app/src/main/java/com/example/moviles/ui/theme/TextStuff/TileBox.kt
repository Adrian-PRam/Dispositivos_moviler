package com.example.moviles.ui.theme.TextStuff

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.moviles.ui.theme.Color1024
import com.example.moviles.ui.theme.Color128
import com.example.moviles.ui.theme.Color16
import com.example.moviles.ui.theme.Color2
import com.example.moviles.ui.theme.Color2048
import com.example.moviles.ui.theme.Color256
import com.example.moviles.ui.theme.Color32
import com.example.moviles.ui.theme.Color4
import com.example.moviles.ui.theme.Color512
import com.example.moviles.ui.theme.Color64
import com.example.moviles.ui.theme.Color8
import com.example.moviles.ui.theme.EmptyColor
import com.example.moviles.ui.theme.NumberSize

@Composable
fun TileBox(number: Int, fill: (Long)-> Unit) {

    var number by remember {
        mutableStateOf(0L)
    }

    var boxColor by remember {
        mutableStateOf(EmptyColor)
    }

    var tamanoCaja by remember {
        mutableStateOf(35)
    }

    var numberColor by remember {
        mutableStateOf(Color.Black)
    }


    fun ChangeBox() {
        fill(number)
        if (number == 0L) {
            number = 2
        } else if (number < 4096){
            number = number * 2
        }



        when (number) {
            2L -> {
                boxColor = Color2
                tamanoCaja = 35
                numberColor = Color.Black
            }

            4L -> {
                boxColor = Color4
                tamanoCaja = 35
                numberColor = Color.Black
            }

            8L -> {
                boxColor = Color8
                tamanoCaja = 35
                numberColor = Color.White
            }

            16L -> {
                boxColor = Color16
                tamanoCaja = 30
                numberColor = Color.White
            }

            32L -> {
                boxColor = Color32
                tamanoCaja = 30
                numberColor = Color.White
            }

            64L -> {
                boxColor = Color64
                tamanoCaja = 30
                numberColor = Color.White
            }

            128L -> {
                boxColor = Color128
                tamanoCaja = 28
                numberColor = Color.White
            }

            256L -> {
                boxColor = Color256
                tamanoCaja = 28
                numberColor = Color.White
            }

            512L -> {
                boxColor = Color512
                tamanoCaja = 28
                numberColor = Color.White
            }

            1024L -> {
                boxColor = Color1024
                tamanoCaja = 20
                numberColor = Color.White
            }

            2048L -> {
                boxColor = Color2048
                tamanoCaja = 20
                numberColor = Color.White
            }

            4096L -> {
                boxColor = Color.Black
                tamanoCaja = 20
                numberColor = Color.White
            }

            else -> {
                boxColor = Color2048
                tamanoCaja = 18
                numberColor = Color.White
            }
        }


    }

    Box(
        modifier = Modifier
            .padding(5.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(boxColor)
            .size(NumberSize)
            .clickable() {
                ChangeBox()
            }

    ) {

        if (number == 0L) {
            DisplayText(
                texto = "",
                modificador = Modifier.align(Alignment.Center),
                tamano = 35,
                colorFuente = Color.Black)
        } else {
            DisplayText(
                texto = number.toString(),
                modificador = Modifier.align(Alignment.Center),
                tamano = tamanoCaja,
                colorFuente = numberColor)
        }
    }

}