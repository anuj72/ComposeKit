package co.mounty.composekit.ui.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import co.mounty.composekit.R

@Preview
@Composable
fun UserCard1(param: Int?) {
var drawImg=when(param){
    0->R.drawable.a0
    1->R.drawable.a1
    2->R.drawable.a2
    3->R.drawable.a3
    4->R.drawable.a4
    5->R.drawable.a5
    6->R.drawable.a6
    7->R.drawable.a7
    8->R.drawable.a8
    9->R.drawable.a9
    10->R.drawable.a10
    else -> R.drawable.a0
}
    Image(
        painter = painterResource(drawImg),
        contentDescription = "avatar",
        contentScale = ContentScale.Crop,            // crop the image if it's not a square
        modifier = Modifier
            .padding(8.dp)
            .size(64.dp)
            .clip(CircleShape)                       // clip to the circle shape
            .border(1.dp, Color.White, CircleShape)   // add a border (optional)
    )
}