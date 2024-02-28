package br.com.gabrielorander.antenna

import android.app.Application
import br.com.gabrielorander.antenna.di.appModule
import br.com.gabrielorander.home.feature.di.homeModule
import br.com.gabrielorander.network.di.networkModule
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
                    networkModule,
                    homeModule
                )
            )
        }
    }
}