package com.example.currencies.presentation.settings_fragment

import androidx.lifecycle.ViewModel
import com.example.currencies.domain.model.Currency
import com.example.currencies.domain.use_case.GetAllCurrenciesFromFlowUseCase
import com.example.currencies.domain.use_case.SaveAllCurrenciesInFlowUseCase
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class SettingsViewModel(
    private val getAllCurrenciesFromFlowUseCase: GetAllCurrenciesFromFlowUseCase,
    private val saveAllCurrenciesInFlowUseCase: SaveAllCurrenciesInFlowUseCase,
) : ViewModel() {

    val state: MutableStateFlow<MutableList<Currency>> = MutableStateFlow(mutableListOf())

    private var isInit = false
    fun setCurrencies() {
        if (!isInit) {
            state.value = getAllCurrenciesFromFlowUseCase.invoke()
            state.value.sortBy { !it.isShowing }
            isInit = true
        }
    }

    fun save() {
        GlobalScope.launch {
            saveAllCurrenciesInFlowUseCase.invoke(state.value)
        }
    }
}
