package com.example.uts2.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Teams(
    @ColumnInfo(name="name")
    var name:String,
    @ColumnInfo(name="ign")
    var ign:String,
    @ColumnInfo(name="roles")
    var roles:String,
    @ColumnInfo(name="game_name")
    var game_name:String
) {
    @PrimaryKey(autoGenerate = true)
    var uuid:Int =0
}