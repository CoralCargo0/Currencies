package com.example.currencies.domain.use_case

import com.example.currencies.data.repository.CurrencyRepositoryImpl
import com.example.currencies.domain.model.Currency

class SaveAllCurrenciesInFlowUseCase(
    private val repo: CurrencyRepositoryImpl
) {
    operator fun invoke(currency: MutableList<Currency>) {
        repo.saveAllCurrenciesInFlow(currency)
    }
}
