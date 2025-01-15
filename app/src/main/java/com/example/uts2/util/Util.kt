package com.example.uts2.util

import android.content.Context
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.uts2.model.UserDatabase
import com.example.uts2.model.GamesDatabase

val MIGRATION_1_2 = object : Migration(1, 2) {
    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL(
            "ALTER TABLE news RENAME COLUMN image TO picture")
    }
}

val DB_NAME = "newsesdb"
val DB_NAME2 = "userdb"


fun buildUserDb(context: Context): UserDatabase {
    val db = UserDatabase.buildDatabase(context)
    return db
}

fun buildNewsDb(context: Context): GamesDatabase {
    val db = GamesDatabase.buildDatabase(context)
    return db
}