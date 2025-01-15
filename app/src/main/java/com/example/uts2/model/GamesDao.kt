package com.example.uts2.model

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface GamesDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg games:Games)

    @Query("SELECT * FROM games")
    fun selectAllNews(): List<Games>

    @Query("SELECT * FROM games WHERE uuid= :id")
    fun selectNews(id:Int): Games

    @Delete
    fun deleteNews(games:Games)
}