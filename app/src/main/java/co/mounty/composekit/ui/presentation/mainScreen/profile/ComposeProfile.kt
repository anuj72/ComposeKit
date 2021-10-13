package co.mounty.composekit.ui.presentation.mainScreen.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import co.mounty.composekit.R
import co.mounty.composekit.ui.prefrences.UserSharedPreference
import co.mounty.composekit.ui.presentation.MainActivity



@Composable
fun ComposeProfile(
    navController: NavController
    , context: MainActivity,
    myPref: UserSharedPreference = org.koin.androidx.compose.get()
) {
    myPref.setName("Anuj Sachan")
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .fillMaxWidth()
        ) {
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {

                Column() {
                    Image(
                        painter = painterResource(R.drawable.a1),
                        contentDescription = "avatar",
                        contentScale = ContentScale.Crop,            // crop the image if it's not a square
                        modifier = Modifier
                            .size(90.dp)
                            .clip(CircleShape)                       // clip to the circle shape
                            .border(1.dp, Color.White, CircleShape)   // add a border (optional)
                    )

                }


            }
            Text(myPref.getName().toString(),textAlign = TextAlign.Center,modifier = Modifier.padding(4.dp).fillMaxWidth())


        }

    }

}

@Preview
@Composable
fun ComposemProfile() {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .fillMaxWidth()
        ) {
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {

                Column() {
                    Image(
                        painter = painterResource(R.drawable.a1),
                        contentDescription = "avatar",
                        contentScale = ContentScale.Crop,            // crop the image if it's not a square
                        modifier = Modifier
                            .size(90.dp)
                            .clip(CircleShape)                       // clip to the circle shape
                            .border(1.dp, Color.White, CircleShape)   // add a border (optional)
                    )

                }


            }
          Text("Hello World",textAlign = TextAlign.Center,modifier = Modifier.fillMaxWidth())


        }

    }

}