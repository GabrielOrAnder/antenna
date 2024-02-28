package br.com.gabrielorander.network.di

import br.com.gabrielorander.network.BuildConfig
import br.com.gabrielorander.network.data.remote.TVMazeApi
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val networkModule = module {
    single {
        Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(TVMazeApi::class.java)
    }
}