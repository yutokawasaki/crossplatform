package com.example.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@Preview (showBackground = true)
@Composable
fun App() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF181926)),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Content()
        Footer()
    }
}

@Composable
fun Content() {
    Column(
        modifier = Modifier
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
    }
}

@Composable
fun Footer() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(40.dp),

        verticalArrangement = Arrangement.spacedBy(10.dp),
    ) {
        Text(
            text = "Weather,\nNotifications",
            color = Color.White,
            fontSize = 32.sp,
            fontWeight = FontWeight(600)
        )
        Circles()
        PrimaryButton()
        DefaultButton()
    }
}

@Composable
fun PrimaryButton() {
    Button(
        onClick = { /*TODO*/ },
        shape = RoundedCornerShape(50),
        modifier = Modifier
            .fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(Color(0xFF246BFE)),
        contentPadding = PaddingValues(14.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                modifier = Modifier.size(size = 20.dp),
                imageVector = Icons.Filled.Email,
                contentDescription = ""
            )
            Text(
                text = "Continue with email"
            )
        }
    }
}

@Composable
fun DefaultButton() {
    Button(
        onClick = { /*TODO*/ },
        shape = RoundedCornerShape(50),
        modifier = Modifier
            .fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(Color(0xFF262A34)),
        contentPadding = PaddingValues(14.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                modifier = Modifier.size(size = 20.dp),
                imageVector = Icons.Filled.Face,
                contentDescription = "",
                tint = Color(0xFFDBDADD)
            )
            Text(
                text = "Stay as guest",
                color = Color(0xFFDBDADD)
            )
        }
    }
}

@Composable
fun Circles() {
    Row(
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        modifier = Modifier
            .padding(0.dp, 30.dp),
    ) {
        Button(
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(50),
            modifier = Modifier
                .width(10.dp)
                .height(10.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFF246BFE))
        ){}
        Button(
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(50),
            modifier = Modifier
                .width(10.dp)
                .height(10.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFF262A34))
        ){}
        Button(
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(50),
            modifier = Modifier
                .width(10.dp)
                .height(10.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFF262A34))
        ){}
    }
}