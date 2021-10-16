package co.mounty.composekit.ui

import android.app.Application
import co.mounty.composekit.ui.network.api.FakeApiCallRepository
import co.mounty.composekit.ui.prefrences.UserSharedPreference
import co.mounty.composekit.ui.presentation.mainScreen.home.ComposeHome
import co.mounty.composekit.ui.presentation.mainScreen.home.ComposeHomeVM
import co.mounty.composekit.ui.presentation.mainScreen.profile.ComposeProfileVM
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

        val fakeApiCall = module {
            factory {
                FakeApiCallRepository(get())
            }
        }
        val composeProfileVM = module {
            factory {
                ComposeProfileVM(get(),get())
            }
        }
        val composeHomeVM = module {
            factory {
                ComposeHomeVM(get())
            }
        }



        startKoin {
            androidLogger()
            //inject Android context
            androidContext(this@MainApplication)
            // use modules
            modules(listOf(mySharedPref,fakeApiCall,composeHomeVM,composeProfileVM))
        }

    }
}
