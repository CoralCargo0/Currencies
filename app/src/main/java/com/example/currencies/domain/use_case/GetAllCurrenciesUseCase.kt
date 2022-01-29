package com.example.currencies.domain.use_case

import com.example.currencies.data.repository.CurrencyRepositoryImpl
import com.example.currencies.domain.model.Currency

class GetAllCurrenciesUseCase(
    private val repo: CurrencyRepositoryImpl
) {
    suspend operator fun invoke(): List<Currency> = repo.getAllCurrencies()
}
