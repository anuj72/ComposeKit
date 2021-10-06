package co.mounty.composekit.ui.presentation.navigation

import androidx.annotation.StringRes
import co.mounty.composekit.R

sealed class Screen(val route: String, @StringRes val resourceId: Int) {
    object Home : Screen("home", R.string.home)
    object Profile : Screen("profile", R.string.profile)

}