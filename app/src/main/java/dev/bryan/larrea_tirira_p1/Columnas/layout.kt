package dev.bryan.larrea_tirira_p1.Columnas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Columnas(){
    Column  (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(vertical = 36.dp, horizontal = 8.dp)
            .background(color=androidx.compose.ui.graphics.Color.Yellow)
            .fillMaxSize()

    ){

        Text (
            text = "Computacion movil PAO 6",

            )
        Text (
            text = "Bryan Larrea",

            )
        Text (
            text = "Kevin Tirira",

            )
    }

}