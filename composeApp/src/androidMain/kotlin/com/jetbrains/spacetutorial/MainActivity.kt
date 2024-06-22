package com.jetbrains.spacetutorial

import App
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CounterApp()
        }
    }
}
//@Preview
//@Composable
//fun AppAndroidPreview() {
//    App()
//}

@Preview
@Composable
fun CounterApp(){
    val count = remember {
        mutableIntStateOf(0)
    }
    Column {
        Row{
            Text(count.intValue.toString())
        }
        Row {
            Increment(count)
            Decrement(count)
        }
    }
}
@Composable
fun Increment(count : MutableState<Int>){
    Button(onClick = { count.value+=1 }, Modifier.padding(6.dp)) {
        Text(text = "+")
    }
}

@Composable
fun Decrement(count : MutableState<Int>){
    Button(onClick = { count.value-=1 }, Modifier.padding(6.dp)) {
        Text(text = "-")
    }
}