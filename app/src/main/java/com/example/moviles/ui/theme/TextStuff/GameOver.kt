package com.example.moviles.ui.theme.TextStuff

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.moviles.ui.theme.ScoreBackground


@Composable
fun GameOver() {
    Box(modifier = Modifier
        .fillMaxWidth()
        .height(110.dp),
        contentAlignment = Alignment.Center) {

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "Game Over",
                fontSize = 35.sp
            )

            Button(onClick = {}, colors = ButtonDefaults.buttonColors(
                contentColor = Color.Black,
                containerColor = ScoreBackground,

                )) {
                Text(text = "Play Again")
            }
        }
    }
}