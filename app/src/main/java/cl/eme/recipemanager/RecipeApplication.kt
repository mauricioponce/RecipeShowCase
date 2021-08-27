package cl.eme.recipemanager

import android.app.Application
import cl.eme.recipemanager.di.appModule
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
            modules(appModule)
        }
    }
}