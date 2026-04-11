package com.example.moviles.glitchwave

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.actividad1am.R
import com.example.moviles.ui.theme.LightRed

//@Preview(showBackground = true)
@Composable
fun PaymentSummary(resultadoFinal: PaymentResult){
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = R.drawable.glitchwave),
            contentDescription = "My image",
            modifier = Modifier.fillMaxWidth().height(50.dp)
        )
        Text(text = "RESUMEN DE PAGO",
            fontSize = 30.sp,
            color = LightRed,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Monospace
        )

        Column(modifier = Modifier
            .height(500.dp)
            .width(350.dp)
            .clip(RoundedCornerShape(9.dp))
            .background(LightRed),
            verticalArrangement = Arrangement.SpaceEvenly) {
            if (resultadoFinal.ageRestriction == true) {
                Text("- No tienes edad suficiente para jugar lo que compraste",
                    fontSize = 17.sp)
            }

            if (resultadoFinal.moneyRestriction == true) {
                Text("- No tienes dinero suficiente para comprar lo que pediste",
                    fontSize = 17.sp)
            } else if (resultadoFinal.ageRestriction == false) {
                Text("Compra realizada con exito",
                    color = Color.Green,
                    fontSize = 22.sp
                )

                Text("Total a pagar: $${resultadoFinal.totalMoney} \n Dinero con el que pago: $${resultadoFinal.initMoney} \n Restante: $${resultadoFinal.initMoney - resultadoFinal.totalMoney}",
                    fontSize = 20.sp)

            }

        }
    }
}

@Preview(showBackground = true)
@Composable

fun PreviewPaymentSummary(){
    val resultPlaceholder = PaymentResult(true, true, 150, 100)
    PaymentSummary(resultPlaceholder)
}