package com.ascoder.state

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComponentContainer()
        }
    }
}

@Composable
fun ComponentContainer() {
    ColorBox()
}

@Composable
fun ColorBox(modifier: Modifier = Modifier) {
    Box(modifier = Modifier
        .background(Color.Yellow)
        .clickable {  }
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComponentContainer()
}