package com.example.translatorapp.translate.data.local

import com.squareup.sqldelight.db.SqlDriver

expect class DatabaseDriverFactory{
    fun create() : SqlDriver
}