package co.mounty.composekit.ui.presentation.mainScreen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import co.mounty.composekit.ui.presentation.MainActivity
import co.mounty.composekit.ui.presentation.component.UserCard1
import co.mounty.composekit.ui.presentation.component.UserCard2

import co.mounty.composekit.ui.utils.getJsonDataFromAsset
import com.google.gson.Gson


@Preview
@Composable
fun ComposeHome(navController: NavController, context: MainActivity) {
    val list = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
    ) {

        /*Text(text = "First item")


        Image(
            painter = rememberImagePainter("https://koenig-media.raywenderlich.com/uploads/2020/01/JetpackCompose-feature.png"),
            contentDescription = null,
            modifier = Modifier.size(128.dp)
        )*/
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
        /* Button(onClick = {
             navController.navigate("profile") {
                 popUpTo("home")*//* { inclusive = true }*//*
            }
        }) {
            Text("Hello")
        }
*/
        val jsonFileString = getJsonDataFromAsset(context, "DummyRes.json")
        if (jsonFileString != null) {
          //  Log.i("data", jsonFileString)
        }

        val gson = Gson()


        var myList=gson.fromJson(jsonFileString,Array<String>::class.java)
        myList.forEach {
            UserCard2(it)

        }





    }


}