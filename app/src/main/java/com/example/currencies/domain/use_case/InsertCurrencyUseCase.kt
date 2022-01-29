package com.example.currencies.domain.use_case

import com.example.currencies.data.repository.CurrencyRepositoryImpl
import com.example.currencies.domain.model.Currency

class InsertCurrencyUseCase(
    private val repo: CurrencyRepositoryImpl
) {
    suspend operator fun invoke(currency: Currency) {
        repo.insert(currency)
    }
}
