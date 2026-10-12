package com.example.plantillaequipoesports

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.plantillaequipoesports.ui.theme.PlantillaEquipoESportsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PlantillaEquipoESportsTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                    )
                {
                    PantallaPlantilla()

                }
            }

        }

    }
}

@Composable
fun PantallaPlantilla(){
    Column(
        modifier = Modifier
        .fillMaxSize()
        .statusBarsPadding()
        .background(Color.Red)
            .padding(horizontal =20.dp)
    ){
        Text(
            text = "TEAM TITANS",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 40.dp, bottom = 30.dp)
                .align(Alignment.CenterHorizontally),
            style = MaterialTheme.typography.headlineLarge,
            color = MaterialTheme.colorScheme.primary,
            fontWeight = FontWeight.ExtraBold,
            textAlign = TextAlign.Center,
            letterSpacing = 3.sp

        )
        Jugador(
            nombre = "AlexPro",
            rol = "Atacante",
            edad = 21,
            nivel = 87,
            imagen = R.drawable.jugador1
        )
        HorizontalDivider(
            modifier = Modifier.padding(vertical =12.dp),
            thickness = 1.5.dp,
            color = Color.Yellow
        )
        Jugador(
            nombre = "ShadowX",
            rol = "Defensor",
            edad = 24,
            nivel = 91,
            imagen = R.drawable.jugador2
        )

        HorizontalDivider(
            modifier = Modifier.padding(vertical = 12.dp),
            thickness = 1.5.dp,
            color = Color.Yellow
        )

        Jugador(
            nombre = "MartaGG",
            rol = "Soporte",
            edad = 20,
            nivel = 84,
            imagen = R.drawable.jugador3
        )

        HorizontalDivider(
            modifier = Modifier.padding(vertical = 12.dp),
            thickness = 1.5.dp,
            color = Color.Yellow
        )

        Jugador(
            nombre = "Destroyer",
            rol = "Atacante",
            edad = 23,
            nivel = 89,
            imagen = R.drawable.jugador4
        )
    }
}
@Composable
fun Jugador(
    nombre: String,
    rol: String,
    edad: Int,
    nivel: Int,
    @DrawableRes imagen: Int
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        Image(
            painter = painterResource(id = imagen),
            contentDescription = "Foto de $nombre",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(92.dp)
                .clip(CircleShape)
                .background(Color.Red),
        )

        Spacer(modifier = Modifier.width(20.dp))
        Column(
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = nombre,
                color = Color.White,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = rol,
                color = MaterialTheme.colorScheme.primary,
                fontSize = 25.sp,
                fontWeight = FontWeight.Medium
            )
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = "$edad años",
                color = Color(0xFF8B949E),
                fontSize = 20.sp
            )
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = "Nivel: $nivel",
                color = Color(0xFF3FB950),
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold

            )
        }
    }

}
@Preview(showBackground = true)
@Composable
fun JugadorPreview() {
    PlantillaEquipoESportsTheme {
        Surface(color = Color(0xFF0D1117)) {
            Jugador(
                nombre = "AlexPro",
                rol = "Atacante",
                edad = 21,
                nivel = 87,
                imagen = R.drawable.jugador1
            )
        }
    }
}
