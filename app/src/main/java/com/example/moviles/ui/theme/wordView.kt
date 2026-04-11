package com.example.moviles.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.PowerSettingsNew
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale

@Preview(showBackground = true)
@Composable

fun WordleViewMaster() {
    var secretWord by remember { mutableStateOf("ACABA") }
    var answer by remember{mutableStateOf("")}
    var counter by remember { mutableStateOf(0) }
    val letters = remember { mutableStateListOf<String>().apply { repeat(30) { add("") } } }
    var wordPos by remember { mutableStateOf(0) }
    fun addLetter(addedLetter: String) {
        if (wordPos >= 0 && wordPos != 5){
            letters[wordPos] = addedLetter
            wordPos += 1
        } else {
            wordPos = wordPos
        }

    }

    fun substractLetter() {
        if (wordPos != 0){
            wordPos -= 1
            letters[wordPos] = ""
        } else {
            wordPos = 0
        }


    }

    fun verifyWord(){
        for (i in 0..4) {
            if (letters[i] == secretWord[i].toString()){
                counter += 1
            }
        }
        if (counter == 5){
            answer = secretWord
        }

        counter = 0
    }
    Box(modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier.padding(15.dp)) {
            Column() {
                Column() {
                    Row() {
                        Box(
                            modifier = Modifier.border(
                                width = 2.dp,
                                color = Color.Gray
                            )
                                .size(70.dp)
                                .padding(6.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = letters[0],
                                fontSize = 30.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }

                        Box(
                            modifier = Modifier.border(
                                width = 2.dp,
                                color = Color.Gray
                            )
                                .size(70.dp)
                                .padding(6.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = letters[1],
                                fontSize = 30.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }

                        Box(
                            modifier = Modifier.border(
                                width = 2.dp,
                                color = Color.Gray
                            )
                                .size(70.dp)
                                .padding(6.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = letters[2],
                                fontSize = 30.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }

                        Box(
                            modifier = Modifier.border(
                                width = 2.dp,
                                color = Color.Gray
                            )
                                .size(70.dp)
                                .padding(6.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = letters[3],
                                fontSize = 30.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }

                        Box(
                            modifier = Modifier.border(
                                width = 2.dp,
                                color = Color.Gray
                            )
                                .size(70.dp)
                                .padding(6.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = letters[4],
                                fontSize = 30.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }

                Box(modifier = Modifier.fillMaxWidth().height(100.dp)) {
                    Column(){
                        Row(){
                            Box(
                                modifier = Modifier
                                    .size(60.dp)
                                    .padding(6.dp)
                                    .clip(RoundedCornerShape(6.dp))
                                    .background(Color.LightGray)
                                    .clickable() {addLetter("A")},
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = "A",
                                    fontSize = 25.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }

                            Box(
                                modifier = Modifier
                                    .size(60.dp)
                                    .padding(6.dp)
                                    .clip(RoundedCornerShape(6.dp))
                                    .background(Color.LightGray)
                                    .clickable() {addLetter("B")},
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = "B",
                                    fontSize = 25.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }

                            Box(
                                modifier = Modifier
                                    .size(60.dp)
                                    .padding(6.dp)
                                    .clip(RoundedCornerShape(6.dp))
                                    .background(Color.LightGray)
                                    .clickable() {addLetter("C")},
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = "C",
                                    fontSize = 25.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }

                            Box(
                                modifier = Modifier
                                    .size(60.dp)
                                    .padding(6.dp)
                                    .clip(RoundedCornerShape(6.dp))
                                    .background(Color.LightGray)
                                    .clickable() {substractLetter()},
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    imageVector = Icons.Filled.ArrowBack,
                                    contentDescription = "My image",
                                    colorFilter = ColorFilter.tint(Color.Black),
                                    modifier = Modifier
                                        .padding(2.dp)
                                        .size(30.dp),
                                    contentScale = ContentScale.Fit
                                )
                            }

                            Box(
                                modifier = Modifier
                                    .size(60.dp)
                                    .padding(6.dp)
                                    .clip(RoundedCornerShape(6.dp))
                                    .background(Color.LightGray)
                                    .clickable() {verifyWord()},
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    imageVector = Icons.Filled.Check,
                                    contentDescription = "My image",
                                    colorFilter = ColorFilter.tint(Color.Black),
                                    modifier = Modifier
                                        .padding(2.dp)
                                        .size(30.dp),
                                    contentScale = ContentScale.Fit
                                )


                            }
                        }
                        Text(text = answer,
                            fontSize = 40.sp,
                            color = Color.Green)
                    }
                }
            }
        }
    }
}