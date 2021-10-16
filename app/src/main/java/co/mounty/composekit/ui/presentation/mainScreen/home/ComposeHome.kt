package co.mounty.composekit.ui.presentation.mainScreen.home

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import co.mounty.composekit.ui.network.wrapper.UiState
import co.mounty.composekit.ui.presentation.MainActivity
import co.mounty.composekit.ui.presentation.component.UserCard1
import co.mounty.composekit.ui.presentation.component.UserCard2
import co.mounty.composekit.ui.presentation.mainScreen.profile.ComposeProfileVM

import co.mounty.composekit.ui.utils.getJsonDataFromAsset
import com.google.gson.Gson
import org.koin.androidx.compose.getViewModel


@Composable
fun ComposeHome(navController: NavController, context: MainActivity) {
    val list = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val scrollState = rememberScrollState()
    val vm = getViewModel<ComposeHomeVM>()
    val currentData = vm.uiState.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
    ) {

        LazyRow(modifier = Modifier.fillMaxWidth()) {
            items(count = list.size, itemContent = { index ->
                UserCard1(index)
            })
        }
        Spacer(modifier = Modifier.height(16.dp))
        Divider(
            color = Color.Gray, thickness = 1.dp,modifier = Modifier.alpha(0.1F)
        )
        Spacer(modifier = Modifier.height(32.dp))


        currentData.value.let {
            when(it){
               is UiState.Loading->{
                   Box(modifier = Modifier.fillMaxSize().wrapContentSize(Alignment.Center)) {
                       CircularProgressIndicator()
                   }
               }
               is UiState.Success->{
                   it.data.forEach {
                       UserCard2(it)
                   }
               }
            }
        }


           /* UserCard2(it)*/







    }


}