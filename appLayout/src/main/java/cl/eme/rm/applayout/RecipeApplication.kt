package cl.eme.rm.applayout

import android.app.Application
import cl.eme.rm.applayout.di.appModule
import cl.eme.rm.di.listingAppModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class RecipeApplication : Application() {

    /**
     * Start koin for dependencies
     */
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@RecipeApplication)
            modules(listOf(listingAppModule))

        }
    }
}
