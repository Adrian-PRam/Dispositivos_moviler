package com.example.moviles.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.moviles.R

import java.nio.file.WatchEvent

@Preview(showBackground = true)
@Composable
fun ProductView(){
    Card(modifier = Modifier.fillMaxWidth().padding(10.dp)) {
        Column(modifier = Modifier.fillMaxWidth())  {
            Row(modifier = Modifier.padding(4.dp)) {
                Image(painter = painterResource(id = R.drawable.reyes),
                    contentDescription = "imagen cool",
                    modifier = Modifier.size(size = 150.dp))

                Column(modifier = Modifier.padding(4.dp)) {
                    Text(text = "Macbook Pro:", fontSize = 30.sp)
                    Text(text = "⭐4.8 Estrellas" , fontSize = 17.sp)
                    Text(text = "$12,998" , fontSize = 15.sp, fontWeight = FontWeight.Bold)
                    Text(text = "Llega el viernes", fontSize = 15.sp)
                    Spacer(modifier = Modifier.size(10.dp))
                    Button(onClick = {}, colors = ButtonDefaults.buttonColors(Color.Yellow, contentColor = Color.Black) ) {Text(text = "Agregar al carrito")}
                }
            }
        }
    }


}

