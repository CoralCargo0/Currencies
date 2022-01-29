package com.example.currencies.domain.use_case

import com.example.currencies.data.repository.CurrencyRepositoryImpl
import com.example.currencies.domain.model.Currency

class GetAllCurrenciesFromFlowUseCase(
    private val repo: CurrencyRepositoryImpl
) {
    operator fun invoke(): MutableList<Currency> = repo.getAllCurrenciesFromFlow()
}
