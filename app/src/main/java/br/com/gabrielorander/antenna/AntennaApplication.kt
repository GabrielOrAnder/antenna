package br.com.gabrielorander.antenna

import android.app.Application
import br.com.gabrielorander.antenna.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class AntennaApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@AntennaApplication)
            modules(
                listOf(
                    appModule,
                    //homeModule
                )
            )
        }
    }
}