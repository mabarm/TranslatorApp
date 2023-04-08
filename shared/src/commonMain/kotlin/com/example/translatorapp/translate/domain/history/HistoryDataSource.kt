package com.example.translatorapp.translate.domain.history

import com.example.translatorapp.core.domain.util.CommonFlow

interface HistoryDataSource {

    fun getHistory(): CommonFlow<List<HistoryItem>>

    suspend fun insertHistoryItem(item : HistoryItem)
}