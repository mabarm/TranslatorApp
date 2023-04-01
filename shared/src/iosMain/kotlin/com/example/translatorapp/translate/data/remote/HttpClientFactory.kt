package com.example.translatorapp.translate.data.remote

import io.ktor.client.*

actual class HttpClientFactory {
    actual  fun create(): HttpClient {
        return HttpClient()
    }
}

