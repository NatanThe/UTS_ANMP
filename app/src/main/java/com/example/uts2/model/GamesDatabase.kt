package com.example.uts2.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.uts2.util.DB_NAME
import com.example.uts2.util.MIGRATION_1_2

@Database(entities = arrayOf(Games::class), version = 2)
abstract class GamesDatabase: RoomDatabase() {
    abstract fun newsDao(): GamesDao

    companion object {
        @Volatile private var instance: GamesDatabase ?= null
        private val LOCK = Any()

        fun buildDatabase(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            GamesDatabase::class.java, DB_NAME)
            .addMigrations(MIGRATION_1_2)
            .build()

        operator fun invoke(context: Context) {
            if(instance!=null) {
                synchronized(LOCK) {
                    instance ?: buildDatabase(context).also {
                        instance = it
                    }
                }
            }
        }
    }
}