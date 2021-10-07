package co.mounty.composekit.ui.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import co.mounty.composekit.ui.presentation.mainScreen.ComposeHome
import co.mounty.composekit.ui.presentation.mainScreen.ComposeProfile
import co.mounty.composekit.ui.presentation.navigation.MyBottomNavigation
import co.mounty.composekit.ui.presentation.navigation.Screen
import co.mounty.composekit.ui.theme.ComposeKitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ComposeKitTheme {
                Scaffold() {
                    Surface(color = MaterialTheme.colors.background) {
                        Greeting(this)
                    }

                }

            }
        }
    }
}

@Composable
fun Greeting(context: MainActivity) {

    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            MyBottomNavigation(navController = navController)
        }
    ) { innerPadding ->
        NavHost(
            navController,
            startDestination = Screen.Home.route,
            Modifier.padding(innerPadding)
        ) {
            composable("home") { ComposeHome(navController,context) }
            composable("profile") { ComposeProfile(navController,context) }
        }
    }


}

