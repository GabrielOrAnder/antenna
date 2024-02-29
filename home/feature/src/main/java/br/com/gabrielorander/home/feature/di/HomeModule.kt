package br.com.gabrielorander.home.feature.di

import br.com.gabrielorander.home.feature.data.HomeRepositoryImpl
import br.com.gabrielorander.home.feature.domain.HomeRepository
import br.com.gabrielorander.home.feature.presentation.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module


val homeModule = module {
    singleOf(::HomeRepositoryImpl) { bind<HomeRepository>() }
    viewModelOf(::HomeViewModel)
}