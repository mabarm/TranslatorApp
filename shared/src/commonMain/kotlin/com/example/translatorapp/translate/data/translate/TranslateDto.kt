package com.example.translatorapp.translate.data.translate

import com.example.translatorapp.core.domain.language.Language
import kotlinx.serialization.SerialName

@kotlinx.serialization.Serializable
data class TranslateDto(
    @SerialName("q") val textToTranslate : String,
    @SerialName("source") val sourceLanguageCode : Language,
    @SerialName("target") val targetLanguageCode : Language
)
