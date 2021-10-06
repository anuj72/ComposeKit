package co.mounty.composekit.ui.presentation.component

import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.skydoves.landscapist.ShimmerParams
import com.skydoves.landscapist.coil.CoilImage

@Preview
@Composable
fun UserCard2(s: String) {

    Card(modifier = Modifier
        .height(300.dp)
        .fillMaxWidth()) {
       Column {
           CoilImage(
               imageModel = s,

               modifier = Modifier.fillMaxWidth().height(240.dp),
               // shows a shimmering effect when loading an image.
               shimmerParams = ShimmerParams(
                   baseColor = MaterialTheme.colors.background,
                   highlightColor = Color.LightGray,
                   durationMillis = 550,
                   dropOff = 0.65f,
                   tilt = 10f
               ),
               // shows an error text message when request failed.
               failure = {
                   Text(text = "image request failed.")
               })
           Text(text = "Hello Shiba Inu Here",Modifier.padding(8.dp))
       }


    }

}