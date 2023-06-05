package com.ascoder.state

import kotlin.random.Random
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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
    ColorBox(Modifier.fillMaxSize())
}

@Composable
fun ColorBox(modifier: Modifier = Modifier) {
    val color by remember { lazy { mutableStateOf(Color.Yellow) } }

    Box(modifier = modifier
        .background(color = color.value)
        .clickable {
            color.value = Color(
                Random.nextFloat(),
                Random.nextFloat(),
                Random.nextFloat(),
                1f
            )
        }
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComponentContainer()
}