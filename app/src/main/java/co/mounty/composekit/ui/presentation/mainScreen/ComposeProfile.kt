package co.mounty.composekit.ui.presentation.mainScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import co.mounty.composekit.MainActivity

@Preview
@Composable
fun ComposeProfile(navController: NavController, context: MainActivity) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize()) {
            Text(text = "Profile item")

        }

    }

}