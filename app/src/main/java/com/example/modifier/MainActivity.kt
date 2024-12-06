package com.example.modifier

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val myModifier: Modifier = Modifier
            .padding(vertical = 10.dp, horizontal = 25.dp)
            .border(width = 3.dp, color = Color.Red)
            .background(Color.Yellow)
            .padding(vertical = 10.dp, horizontal = 25.dp)
        setContent {
            Greeting("Привет", myModifier)
        }
    }
}

@Composable
fun Greeting(
    name: String,
    textModifier: Modifier = Modifier
        .padding(vertical = 10.dp, horizontal = 25.dp)
) {
    val defaultModifier = Modifier
        .padding(start = 155.dp, top = 750.dp)
        .border(width = 3.dp, color = Color.Red)
    Text(text = name, defaultModifier.then(textModifier))
}