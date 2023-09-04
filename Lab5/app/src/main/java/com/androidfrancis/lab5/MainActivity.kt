package com.androidfrancis.lab5

import android.annotation.SuppressLint
import android.graphics.Color
import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.androidfrancis.lab5.ui.theme.Lab5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab5Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Main()
                }
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview(showBackground = true, showSystemUi = true)
fun Main() {

    Column(
        modifier = Modifier
            .padding(16.dp)
            .verticalScroll(rememberScrollState())

    ){
        TopAppBar(

            colors = TopAppBarDefaults.largeTopAppBarColors(

                containerColor = MaterialTheme.colorScheme.primaryContainer,
                titleContentColor = MaterialTheme.colorScheme.primary,
            ),
            title = {
                Text("TodoEventos", fontWeight = FontWeight.Bold,)
            },
            actions = {
                IconButton(onClick = { /* do something */ }) {
                    Icon(painter = painterResource(id = R.drawable.ic_tres_puntos), contentDescription = "")
                }
            }

        )
        Text(
            "Your Favorites",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(10.dp)

        )
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(10.dp)



        ) {
            Cards(Images(R.drawable.ic_img1, "Party", "Snoopy en una fiesta"))
            Cards(Images(R.drawable.ic_img2, "Risa", "Snoopy Riendose"))
        }
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(10.dp)


        ) {
            Cards(Images(R.drawable.ic_img3, "Libreria", "Snoopy en la libreria"))
            Cards(Images(R.drawable.ic_img4, "Supermercado", "Snoopy gritando en el supermercado"))
        }
        Text(
            "All images",
            fontSize = 25.sp,
            modifier = Modifier
                .padding(10.dp)
        )
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(10.dp)


        ) {
            Cards(Images(R.drawable.ic_img1, "Party", "Snoopy en una fiesta"))
            Cards(Images(R.drawable.ic_img2, "Risa", "Snoopy Riendose"))
        }

    }


}

data class Images(var img: Int, var txt1 : String, var txt2 : String)

@Composable
fun Cards( p: Images){

    Card(
        modifier = Modifier
            .padding(10.dp)


    ){
        Column(
            modifier = Modifier
                .padding(10.dp)

        ){
            Image(
                painter = painterResource(id = p.img),
                contentDescription = stringResource(id = R.string.d1),
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .size(130.dp)
            )
            Text(
                text = p.txt1, fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
            )
            Text(
                text = p.txt2
            )
        }
    }
}


