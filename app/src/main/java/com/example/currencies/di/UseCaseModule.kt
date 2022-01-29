package com.example.currencies.di

import com.example.currencies.domain.use_case.*
import org.koin.dsl.module

val useCaseModule = module {
    single { GetCurrenciesFromApiUseCase(get()) }
    single { GetAllCurrenciesUseCase(get()) }
    single { InsertCurrencyUseCase(get()) }
    single { GetAllCurrenciesFromFlowUseCase(get()) }
    single { SaveAllCurrenciesInFlowUseCase(get()) }
    single { GetDynamicsUseCase(get()) }
}
