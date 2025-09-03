package com.example.myapplication.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
import androidx.compose.ui.text.style.TextAlign

@Composable
fun WelcomeScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(32.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Imagen
        Image(
            painter = painterResource(id = R.drawable.welcome),
            contentDescription = "welcome",
            modifier = Modifier
                .size(200.dp)
                .padding(bottom = 24.dp)
        )

        // Título en azul, centrado y más grande
        Text(
            text = "Discover Your Dream Job here",
            style = MaterialTheme.typography.headlineLarge.copy(
                fontSize = 32.sp, // un poco más grande
                fontWeight = FontWeight.Bold,
                color = Color(0xFF3568FF)
            ),
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )

        // Subtítulo más grande
        Text(
            text = "Explore all the existing job roles based on your interest and study major",
            style = MaterialTheme.typography.bodyLarge.copy(
                fontSize = 18.sp // agrandado
            ),
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 48.dp)
        )

        // Fila de botones
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Botón de Iniciar sesión (azul)
            Button(
                onClick = { /* Navegar a Login */ },
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF3568FF)),
                shape = RoundedCornerShape(12.dp)
            ) {
                Text("Login", color = Color.White)
            }

            // Botón de Register (blanco con texto negro)
            OutlinedButton(
                onClick = { /* Navegar a Register */ },
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.outlinedButtonColors(containerColor = Color.White),
                shape = RoundedCornerShape(12.dp)
            ) {
                Text("Register", color = Color.Black)
            }
        }
    }
}
