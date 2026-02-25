package com.santiagoruiz.jepackbasico

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.santiagoruiz.jepackbasico.ui.theme.JepackBasicoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun contentScreen(){
    Column(modifier = Modifier.
    background(Color.Gray)
        .padding(12.dp)
        .fillMaxSize()
    ) {
        Row(modifier =
            Modifier
                .background(Color.Magenta)
                .padding(18.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween){
            Text(
                text = "inicio",
                modifier = Modifier.background(Color.Red).padding(8.dp))
            Text(
                text = "perfil",
                modifier = Modifier.background(Color.Green).padding(8.dp))
            Text(
                text = "configuración",
                modifier = Modifier.background(Color.Yellow).padding(8.dp))
        }

            Text(text = "inicio", modifier = Modifier.background(Color.Blue).padding(8.dp))
            Text(text = "perfil", modifier = Modifier.background(Color.Cyan).padding(8.dp))
            Text(text = "configuración", modifier = Modifier.background(Color.Red).padding(8.dp))


    }

}

@Preview(showSystemUi = true)
@Composable
fun CompletedScreen(){

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        // Imagen del centro
        Image(
            painter = painterResource(id = R.drawable.Test),
            contentDescription = "imagen completado",
            modifier = Modifier.size(200.dp)
        )

        // Primer texto (ajustado)
        Text(
            text = "All tasks completed",
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(top = 24.dp, bottom = 8.dp)
        )

        // Segundo texto (ajustado)
        Text(
            text = "Nice work!",
            fontSize = 16.sp
        )
    }
}