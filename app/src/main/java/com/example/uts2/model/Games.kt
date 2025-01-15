package com.example.uts2.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Games(
    @ColumnInfo(name="title")
    var title:String,
    @ColumnInfo(name="short_desc")
    var short_desc:String,
    //@ColumnInfo(name="image")
    //var image:String,
) {
    @PrimaryKey(autoGenerate = true)
    var uuid:Int =0
}