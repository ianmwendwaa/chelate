package com.mwendwa.chelate

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mwendwa.chelate.ui.theme.ChelateTheme
import java.time.format.TextStyle

class SimpleActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            simplelistview()
            }
        }
    }

private val nameList= mutableListOf("Zhabotinsky","Le Charteliar","Belousov","Sabattier","Etard","Brosch")

private val listModifier= Modifier
    .fillMaxSize()
    .background(Color.Blue)
    .padding(30.dp)

@RequiresApi(Build.VERSION_CODES.O)
private val textstyle= androidx.compose.ui.text.TextStyle(fontSize = 25.sp, color = Color.Red)
@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun simplelistview() {
    LazyColumn(modifier = listModifier) {
       items(nameList) {

               jina ->
           Text(text = jina, style = textstyle)
          }
         }
    }

@RequiresApi(Build.VERSION_CODES.O)
@Preview(showBackground = true)
@Composable
fun MyList() {
    simplelistview()
    
}

