package co.mounty.composekit.ui.network.api

import android.content.Context
import co.mounty.composekit.ui.network.wrapper.Result
import co.mounty.composekit.ui.utils.getJsonDataFromAsset
import com.google.gson.Gson
import kotlinx.coroutines.delay
import org.koin.core.component.KoinComponent

class FakeApiCallRepository(context: Context) : KoinComponent {
    private var context = context
    suspend fun apiCall(): Result<List<String>> {
        return try {
            delay(2000)
            val jsonFileString = getJsonDataFromAsset(context, "DummyRes.json")
            val gson = Gson()
            var myList = gson.fromJson(jsonFileString, Array<String>::class.java)
            Result.Success(myList.toList())
        } catch (e: Exception) {
            println(e)
            Result.Error(e)
        }
    }
}