package com.example.ucp2_pertemuan9

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ucp2_pertemuan9.ui.theme.UCP2_pertemuan9Theme

@Composable
fun HalamanHome(
    onNextButtonClicked: () -> Unit
) {
    val image = painterResource(id = R.drawable.umy)
    Column(
        modifier = Modifier,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        OutlinedCard(
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surface,
            ),
            border = BorderStroke(1.dp, Color.Black), modifier = Modifier
                .fillMaxWidth(0.95f)
                .padding(vertical = 50.dp)
                .align(Alignment.CenterHorizontally)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            ) {
                Image(
                    painter = image,
                    contentDescription = null,
                    contentScale = ContentScale.Crop
                )
            }
        }
            Button(
                modifier = Modifier.weight(1f),
                onClick = onNextButtonClicked
            ) {
                Text(stringResource(R.string.btn_next))
            }
        }
    }
@Preview(showBackground = true)
@Composable
fun PreviewHalamanHome() {
    UCP2_pertemuan9Theme{
        HalamanHome(onNextButtonClicked = {})
    }
}