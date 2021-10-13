package co.mounty.composekit.ui

import android.app.Application
import co.mounty.composekit.ui.prefrences.UserSharedPreference
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin
import org.koin.dsl.module


class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        val mySharedPref = module {
            single {
                UserSharedPreference(get())
            }
        }



        startKoin {
            androidLogger()
            //inject Android context
            androidContext(this@MainApplication)
            // use modules
            modules(listOf(mySharedPref))
        }

    }
}
