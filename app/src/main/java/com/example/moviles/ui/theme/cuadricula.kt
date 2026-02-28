package com.example.moviles.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.moviles.R
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue


@Composable

fun Personajes() {
    var BorderColor by remember { mutableStateOf(GreyBorder) }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(8.dp)
            .clip(RoundedCornerShape(7.dp))
            .background(Color.Black)
    ) {
        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.reyes),
                contentDescription = "My image",
                modifier = Modifier
                    .padding(6.dp)
                    .width(120.dp)
                    .height(125.dp)
                    .border(
                    width = 2.dp,
                    color = Color.Gray
                )
            )

            Row(modifier = Modifier.fillMaxWidth().height(125.dp),
                horizontalArrangement = Arrangement.SpaceBetween) {
                Image(
                    painter = painterResource(id = R.drawable.reyes),
                    contentDescription = "My image",
                    modifier = Modifier
                        .padding(6.dp)
                        .width(120.dp)
                        .height(125.dp)
                        .border(
                            width = 2.dp,
                            color = Color.Gray
                        )
                )

                Image(
                    painter = painterResource(id = R.drawable.reyes),
                    contentDescription = "My image",
                    modifier = Modifier
                        .padding(6.dp)
                        .width(120.dp)
                        .height(125.dp)
                        .border(
                            width = 2.dp,
                            color = Color.Gray
                        )
                )

            }

            Image(
                painter = painterResource(id = R.drawable.reyes),
                contentDescription = "My image",
                modifier = Modifier
                    .padding(6.dp)
                    .width(120.dp)
                    .height(125.dp)
                    .border(
                        width = 2.dp,
                        color = Color.Gray
                    )
            )
        }
    }

}

@Composable

fun PersonajesUp() {
    var BorderColor by remember { mutableStateOf(GreyBorder) }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(450.dp)
            .padding(8.dp)
            .clip(RoundedCornerShape(7.dp))
            .background(Color.Black)
    ) {
        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.reyes),
                contentDescription = "My image",
                modifier = Modifier
                    .padding(6.dp)
                    .width(120.dp)
                    .height(125.dp)
                    .border(
                        width = 2.dp,
                        color = Color.Yellow
                    )
            )

            Row(modifier = Modifier.fillMaxWidth().height(125.dp),
                horizontalArrangement = Arrangement.SpaceBetween) {
                Image(
                    painter = painterResource(id = R.drawable.reyes),
                    contentDescription = "My image",
                    modifier = Modifier
                        .padding(6.dp)
                        .width(120.dp)
                        .height(125.dp)
                        .border(
                            width = 2.dp,
                            color = Color.Gray
                        )
                )

                Image(
                    painter = painterResource(id = R.drawable.reyes),
                    contentDescription = "My image",
                    modifier = Modifier
                        .padding(6.dp)
                        .width(120.dp)
                        .height(125.dp)
                        .border(
                            width = 2.dp,
                            color = Color.Gray
                        )
                )

            }

            Image(
                painter = painterResource(id = R.drawable.reyes),
                contentDescription = "My image",
                modifier = Modifier
                    .padding(6.dp)
                    .width(120.dp)
                    .height(125.dp)
                    .border(
                        width = 2.dp,
                        color = Color.Gray
                    )
            )
        }
    }

}


@Composable

fun PersonajesLeft() {
    var BorderColor by remember { mutableStateOf(GreyBorder) }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(450.dp)
            .padding(8.dp)
            .clip(RoundedCornerShape(7.dp))
            .background(Color.Black)
    ) {
        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.reyes),
                contentDescription = "My image",
                modifier = Modifier
                    .padding(6.dp)
                    .width(120.dp)
                    .height(125.dp)
                    .border(
                        width = 2.dp,
                        color = Color.Gray
                    )
            )

            Row(modifier = Modifier.fillMaxWidth().height(125.dp),
                horizontalArrangement = Arrangement.SpaceBetween) {
                Image(
                    painter = painterResource(id = R.drawable.reyes),
                    contentDescription = "My image",
                    modifier = Modifier
                        .padding(6.dp)
                        .width(120.dp)
                        .height(125.dp)
                        .border(
                            width = 2.dp,
                            color = Color.Yellow
                        )
                )

                Image(
                    painter = painterResource(id = R.drawable.reyes),
                    contentDescription = "My image",
                    modifier = Modifier
                        .padding(6.dp)
                        .width(120.dp)
                        .height(125.dp)
                        .border(
                            width = 2.dp,
                            color = Color.Gray
                        )
                )

            }

            Image(
                painter = painterResource(id = R.drawable.reyes),
                contentDescription = "My image",
                modifier = Modifier
                    .padding(6.dp)
                    .width(120.dp)
                    .height(125.dp)
                    .border(
                        width = 2.dp,
                        color = Color.Gray
                    )
            )
        }
    }

}

@Composable

fun PersonajesRight() {
    var BorderColor by remember { mutableStateOf(GreyBorder) }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(450.dp)
            .padding(8.dp)
            .clip(RoundedCornerShape(7.dp))
            .background(Color.Black)
    ) {
        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.reyes),
                contentDescription = "My image",
                modifier = Modifier
                    .padding(6.dp)
                    .width(120.dp)
                    .height(125.dp)
                    .border(
                        width = 2.dp,
                        color = Color.Gray
                    )
            )

            Row(modifier = Modifier.fillMaxWidth().height(125.dp),
                horizontalArrangement = Arrangement.SpaceBetween) {
                Image(
                    painter = painterResource(id = R.drawable.reyes),
                    contentDescription = "My image",
                    modifier = Modifier
                        .padding(6.dp)
                        .width(120.dp)
                        .height(125.dp)
                        .border(
                            width = 2.dp,
                            color = Color.Gray
                        )
                )

                Image(
                    painter = painterResource(id = R.drawable.reyes),
                    contentDescription = "My image",
                    modifier = Modifier
                        .padding(6.dp)
                        .width(120.dp)
                        .height(125.dp)
                        .border(
                            width = 2.dp,
                            color = Color.Yellow
                        )
                )

            }

            Image(
                painter = painterResource(id = R.drawable.reyes),
                contentDescription = "My image",
                modifier = Modifier
                    .padding(6.dp)
                    .width(120.dp)
                    .height(125.dp)
                    .border(
                        width = 2.dp,
                        color = Color.Gray
                    )
            )
        }
    }

}

@Composable

fun PersonajesDown() {
    var BorderColor by remember { mutableStateOf(GreyBorder) }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(450.dp)
            .padding(8.dp)
            .clip(RoundedCornerShape(7.dp))
            .background(Color.Black)
    ) {
        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.reyes),
                contentDescription = "My image",
                modifier = Modifier
                    .padding(6.dp)
                    .width(120.dp)
                    .height(125.dp)
                    .border(
                        width = 2.dp,
                        color = Color.Gray
                    )
            )

            Row(modifier = Modifier.fillMaxWidth().height(125.dp),
                horizontalArrangement = Arrangement.SpaceBetween) {
                Image(
                    painter = painterResource(id = R.drawable.reyes),
                    contentDescription = "My image",
                    modifier = Modifier
                        .padding(6.dp)
                        .width(120.dp)
                        .height(125.dp)
                        .border(
                            width = 2.dp,
                            color = Color.Gray
                        )
                )

                Image(
                    painter = painterResource(id = R.drawable.reyes),
                    contentDescription = "My image",
                    modifier = Modifier
                        .padding(6.dp)
                        .width(120.dp)
                        .height(125.dp)
                        .border(
                            width = 2.dp,
                            color = Color.Gray
                        )
                )

            }

            Image(
                painter = painterResource(id = R.drawable.reyes),
                contentDescription = "My image",
                modifier = Modifier
                    .padding(6.dp)
                    .width(120.dp)
                    .height(125.dp)
                    .border(
                        width = 2.dp,
                        color = Color.Yellow
                    )
            )
        }
    }

}

@Preview(showBackground = true)
@Composable

fun PersonajesMii() {
    var BorderColor by remember { mutableStateOf(GreyBorder) }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(450.dp)
            .padding(8.dp)
            .clip(RoundedCornerShape(7.dp))
            .background(Color.Black)
    ) {
        Image(
            painter = painterResource(id = R.drawable.reyes),
            contentDescription = "My image",
            modifier = Modifier
                .padding(6.dp)
                .fillMaxSize()
                .border(
                    width = 2.dp,
                    color = Color.Gray
                )
        )

    }
}


