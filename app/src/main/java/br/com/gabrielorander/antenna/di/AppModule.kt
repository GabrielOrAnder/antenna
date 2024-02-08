package br.com.gabrielorander.antenna.di

import br.com.gabrielorander.antenna.data.remote.TVMazeApi
import org.koin.android.BuildConfig
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val appModule = module {
    single {
        Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(TVMazeApi::class.java)
    }
}