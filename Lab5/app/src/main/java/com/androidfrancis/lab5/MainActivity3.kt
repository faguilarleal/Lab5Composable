package com.androidfrancis.lab5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.androidfrancis.lab5.ui.theme.Lab5Theme

class MainActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab5Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Main3()
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Main3() {
    Column(Modifier
        .fillMaxHeight()
        .verticalScroll(rememberScrollState())

    ){
        Box(Modifier
            .fillMaxWidth()
            .height(210.dp)
            .background(Color.LightGray)
        ){

            Column(modifier = Modifier.padding(top = 180.dp, bottom = 2.dp,start=10.dp)){
                Text(text = "Lugar:", fontSize = 15.sp)
            }
        }
        Text("Alemania",
            modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
            fontWeight= FontWeight.Bold, fontSize = 25.sp)
        Row(){
            Icon(modifier= Modifier
                .size(55.dp)
                .padding(15.dp)
                ,painter = painterResource(id = R.drawable.ic_calendario),
                contentDescription = "")
            Text("Fecha",
                Modifier.padding(5.dp).weight(5.0f),
                fontSize = 15.sp)
            Text("Hora",
                Modifier.padding(5.dp).weight(1.0f),
                fontSize = 15.sp,
            )
        }
        Column(){
            Text("About",
                Modifier.padding(10.dp),
                fontWeight= FontWeight.Bold,
                fontSize = 20.sp)
            Text("Aqui va informacion importante sobre muchas cosas no se que hacer ni que escribir bla bla bla ",
                Modifier.padding(start=10.dp),
                fontSize = 15.sp,
            )
        }
        Row(
            modifier = Modifier.padding(top= 170.dp,start = 85.dp),
            verticalAlignment = Alignment.Bottom,

        ) {
            Button(onClick = { /*TODO*/ },

                modifier= Modifier.padding(5.dp)) {
                Text("Favorite")
            }
            Spacer(modifier =Modifier.width(40.dp))

            Button(onClick = { /*TODO*/ }, modifier= Modifier.padding(5.dp)) {
                Text("Buy")
            }
        }
    }
}



