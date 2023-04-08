package com.example.translatorapp.translate.data.local

import com.example.translatorapp.TranslateDatabase
import com.squareup.sqldelight.db.SqlDriver



actual class DatabaseDriverFactory {

    actual fun create() : SqlDriver{
        return NativeSqliteDriver(TranslateDatabase.Schema, "translate.db")
    }
}