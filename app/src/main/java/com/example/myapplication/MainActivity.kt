package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}


data class Student(val name: String, val age: Int)
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview2() {
    MyApplicationTheme {
        val students =
            listOf(Student("Ivan",20),
                Student("Olga",19),
                Student("Maria",18),
                Student("Peter", 21)
            )
        Column(modifier = Modifier.padding(vertical = 50.dp)){
            for(s in students){
                Row(modifier = Modifier.padding(10.dp).fillMaxWidth()){
                    Box(modifier=Modifier.size(50.dp).background(Color.Green))
                    Text(text = s.name, fontSize = 28.sp, modifier = Modifier.padding(10.dp))
                }
            }
        }
    }
}



@Composable
fun GreetingPreview() {
    MyApplicationTheme {
       Box(modifier = Modifier
           .fillMaxSize()
           .border(10.dp,Color.Red),
           contentAlignment = Alignment.Center
       ) {
            Button({}) {
                Text("Click")
            }
       }
    }
}