package br.com.gabrielorander.home.sample

import android.app.Application
import br.com.gabrielorander.home.feature.di.homeModule
import br.com.gabrielorander.network.di.networkModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class HomeSampleApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidLogger()
            androidContext(this@HomeSampleApplication)
            modules(
                networkModule,
                homeModule
            )
        }
    }
}