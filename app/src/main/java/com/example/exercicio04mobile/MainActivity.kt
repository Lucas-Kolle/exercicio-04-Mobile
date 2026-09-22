package com.example.exercicio04mobile

import android.R.attr.fontWeight
import android.R.attr.name
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.exercicio04mobile.ui.theme.Exercicio04MobileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Exercicio04MobileTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PrimeiraTela(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun PrimeiraTela(modifier: Modifier = Modifier) {

    // Criando uma coluna
    Column(
        modifier = modifier
            .background(Color(216, 217, 241, 255))
            .fillMaxSize()
            .padding(0.dp, 215.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            // Criando um componete de texto
            Text(
                text = "Qual é a sua idade?",
                color = Color(71, 95, 190, 255),
                fontSize = 30.sp,
                fontWeight = FontWeight.SemiBold
            )

            Text(
                text = "Aperte os botões para informar a sua idade.",
                fontSize = 15.sp
            )
        }

        // Criando uma linha
        Row() {
            Text(
                text = "133",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Row() {

            // Criando um botão
            Button(
                onClick = {}
            ) {

                // Criando um componente de ícones
                Icon(
                    imageVector = Icons.Default.KeyboardArrowUp,
                    contentDescription = "Arrow Up Icon"
                )
            }

            Button(
                onClick = {}
            ) {

                Icon(
                    imageVector = Icons.Default.KeyboardArrowDown,
                    contentDescription = "Arrow Down Icon"
                )
            }

        }

        Row() {
            Text(
                text = "Você é CONDICIONAL de idade!"
            )
        }
    }
}