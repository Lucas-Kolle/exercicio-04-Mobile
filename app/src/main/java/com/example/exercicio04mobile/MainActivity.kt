package com.example.exercicio04mobile

import android.R.attr.name
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
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
            .background(Color.Yellow)
            .fillMaxSize()
    ) {

        Column() {

            // Criando um componete de texto
            Text(
                text = "Qual é a sua idade?"
            )

            Text(
                text = "Aperte os botões para informar a sua idade."
            )
        }

        // Criando uma linha
        Row() {
            Text(
                text = "AQUI VAI FICAR A IDADE!!!"
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