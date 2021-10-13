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
import co.mounty.composekit.ui.prefrences.UserSharedPreference
import co.mounty.composekit.ui.presentation.mainScreen.home.ComposeHome
import co.mounty.composekit.ui.presentation.mainScreen.profile.ComposeProfile
import co.mounty.composekit.ui.presentation.navigation.MyBottomNavigation
import co.mounty.composekit.ui.presentation.navigation.Screen
import co.mounty.composekit.ui.theme.ComposeKitTheme
import org.koin.androidx.compose.get
import org.koin.java.KoinJavaComponent.get
import org.koin.java.KoinJavaComponent.inject

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

