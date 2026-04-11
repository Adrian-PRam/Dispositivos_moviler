package com.example.moviles.corrutinas

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment

@SuppressLint("ViewModelConstructorInComposable")
@Preview(showBackground = true)
@Composable
fun WinnerPreview() {
    WinnerView(StudentsViewModel())
}
@Composable
fun WinnerView(studentsVM: StudentsViewModel) {
    var nombre by remember { mutableStateOf("") }
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {


        Button(onClick = {
            studentsVM.getWinner()
        }) {
            Text(text = "Comenzar")
        }

        if (studentsVM.isLoading) {
            CircularProgressIndicator()
            Text(text = "Crgando por favor espere...")
        } else {
            Text("El ganador es.... ${studentsVM.winner}")
        }

        
        Text(text = "Sorteo alumnos")
        TextField(value = nombre, onValueChange = {
            nombre = it
        })
    }
}