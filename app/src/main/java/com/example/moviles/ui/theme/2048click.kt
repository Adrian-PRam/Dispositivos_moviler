package com.example.moviles.ui.theme

import com.example.moviles.R
import android.ranging.raw.RawRangingDevice
import android.view.Display
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.getValue
import com.example.moviles.ui.theme.TextStuff.DisplayText
import com.example.moviles.ui.theme.TextStuff.GameOver
import com.example.moviles.ui.theme.TextStuff.TileBox

@Preview(showBackground = true)
@Composable

fun Juego2() {

    var showButton by remember {
        mutableStateOf(false)
    }

    var isGameOver by remember {
        mutableStateOf(false)
    }

    var tiles by remember {
        mutableStateOf(
            List(16) { 0 }
        )
    }

    var score by remember {
        mutableStateOf(0L)
    }

    var gameOver by remember {
        mutableStateOf("")
    }


    var max by remember {
        mutableStateOf(0L)
    }

    fun CalculateMax(valor: Long) {
        if (valor > max) {
            max = valor
        }
    }

    fun PlayAgain() {
        max = 0
        score = 0
        tiles = List(16) {0}
        showButton = false
        gameOver = ""
        isGameOver = false
    }

    Box(modifier = Modifier.fillMaxSize().background(FullGameBackground)) {

        Column() {
            Box(modifier = Modifier.height(70.dp).fillMaxWidth()) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.menu_icon),
                        contentDescription = "My image",
                        modifier = Modifier.size(40.dp)
                    )

                    Text(
                        text = "2048",
                        fontSize = 28.sp)

                    Image(
                        painter = painterResource(id = R.drawable.retry),
                        contentDescription = "My image",
                        modifier = Modifier.size(40.dp)
                    )

                }
            }
            Column() {

                Box(modifier = Modifier.height(70.dp).fillMaxWidth()) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceAround,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(17.dp))
                                .background(ScoreBackground)
                                .fillMaxHeight()
                                .width(180.dp),

                            ) {
                            Text(
                                text = "SCORE",
                                modifier = Modifier.align(Alignment.CenterStart).padding(8.dp),
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold
                            )

                            Text(
                                text = score.toString(),
                                modifier = Modifier.align(Alignment.CenterEnd).padding(8.dp),
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(17.dp))
                                .border(
                                    width = 4.dp,
                                    color = BestBorder,
                                    shape = RoundedCornerShape(17.dp)
                                )
                                .fillMaxHeight()
                                .width(180.dp),

                            ) {
                            Text(
                                text = "BEST",
                                modifier = Modifier.align(Alignment.CenterStart).padding(8.dp),
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold
                            )

                            Text(
                                text = max.toString(),
                                modifier = Modifier.align(Alignment.CenterEnd).padding(8.dp),
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }

                Box(modifier = Modifier
                    .fillMaxWidth()
                    .height(110.dp),
                    contentAlignment = Alignment.Center) {
                    //alpha

                    if (max == 4096L) {
                        isGameOver = true
                    }

                    if (isGameOver == true) {
                        showButton = true
                        gameOver = "Game Over"
                    }



                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Box(modifier = Modifier
                            .fillMaxWidth()
                            .height(110.dp),
                            contentAlignment = Alignment.Center) {

                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text(
                                    text = gameOver,
                                    fontSize = 35.sp
                                )

                                if (showButton) {
                                    Button(onClick = { PlayAgain() }, colors = ButtonDefaults.buttonColors(
                                        contentColor = Color.Black,
                                        containerColor = ScoreBackground)
                                    ) {
                                        Text(text = "Play Again")
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Box(
            modifier = Modifier.fillMaxSize().padding(35.dp),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(20.dp))
                    .background(Color(color = 0xFF9C8A7A))
                    .width(400.dp)
                    .height(300.dp),
                contentAlignment = Alignment.TopStart,
            ) {
                Row() {
                    Column(
                        verticalArrangement = Arrangement.Bottom,
                        modifier = Modifier.padding(5.dp)
                    ) {
                        TileBox(tiles[0]) {
                            if (it == 0L) {
                                score = score + 2
                                CalculateMax(valor = 2)
                            } else if (it  < 4096L){
                                score = it + score
                                CalculateMax(valor = it * 2)
                            }

                        }

                        TileBox(tiles[1]) {

                            if (it == 0L) {
                                score = score + 2
                                CalculateMax(valor = 2)
                            } else if (it != 2048L){
                                score = it + score
                                CalculateMax(valor = it * 2)
                            }

                        }

//                        TileBox() {
//                            if (it == 0L) {
//                                score = score + 2
//                            } else {
//                                score = it + score
//                            }
//
//                        }
//
//                        TileBox() {
//                            if (it == 0L) {
//                                score = score + 2
//                            } else {
//                                score = it + score
//                            }
//
//                        }

                    }

                    Column(
                        verticalArrangement = Arrangement.Bottom,
                        modifier = Modifier.padding(5.dp)
                    ) {
//                        TileBox() {
//                            if (it == 0L) {
//                                score = score + 2
//                            } else {
//                                score = it + score
//                            }
//
//                        }
//
//                        TileBox() {
//                            if (it == 0L) {
//                                score = score + 2
//                            } else {
//                                score = it + score
//                            }
//
//                        }
//
//                        TileBox() {
//                            if (it == 0L) {
//                                score = score + 2
//                            } else {
//                                score = it + score
//                            }
//
//                        }
//
//                        TileBox() {
//                            if (it == 0L) {
//                                score = score + 2
//                            } else {
//                                score = it + score
//                            }
//
//                        }
                    }

                    Column(
                        verticalArrangement = Arrangement.Bottom,
                        modifier = Modifier.padding(5.dp)
                    ) {
//                        TileBox() {
//                            if (it == 0L) {
//                                score = score + 2
//                            } else {
//                                score = it + score
//                            }
//
//                        }
//
//                        TileBox() {
//                            if (it == 0L) {
//                                score = score + 2
//                            } else {
//                                score = it + score
//                            }
//
//                        }
//
//                        TileBox() {
//                            if (it == 0L) {
//                                score = score + 2
//                            } else {
//                                score = it + score
//                            }
//
//                        }
//
//                        TileBox() {
//                            if (it == 0L) {
//                                score = score + 2
//                            } else {
//                                score = it + score
//                            }
//
//                        }
                    }

                    Column(
                        verticalArrangement = Arrangement.Bottom,
                        modifier = Modifier.padding(5.dp)
                    ) {
//                        TileBox() {
//                            if (it == 0L) {
//                                score = score + 2
//                            } else {
//                                score = it + score
//                            }
//
//                        }
//
//                        TileBox() {
//                            if (it == 0L) {
//                                score = score + 2
//                            } else {
//                                score = it + score
//                            }
//
//                        }
//
//                        TileBox() {
//                            if (it == 0L) {
//                                score = score + 2
//                            } else {
//                                score = it + score
//                            }
//
//                        }
//
//                        TileBox() {
//                            if (it == 0L) {
//                                score = score + 2
//                            } else {
//                                score = it + score
//                            }
//
//                        }
                    }


                }
            }
        }
        Box(modifier = Modifier
            .align(Alignment.BottomCenter)
            .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.random_icons),
                contentDescription = "My image",
                modifier = Modifier.size(200.dp)
            )
        }

    }
}

