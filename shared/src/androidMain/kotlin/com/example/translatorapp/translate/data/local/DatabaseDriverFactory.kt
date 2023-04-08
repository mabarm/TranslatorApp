package com.example.translatorapp.translate.data.local

import android.content.Context
import com.example.translatorapp.TranslateDatabase
import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.squareup.sqldelight.db.SqlDriver

actual class DatabaseDriverFactory(
    private val context : Context
){
    actual fun create() : SqlDriver{
        return AndroidSqliteDriver(TranslateDatabase.Schema, context,"translate.db")
    }
}