package com.santiagoruiz.jepackbasico

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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