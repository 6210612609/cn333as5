package com.example.contact.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TagDbModel(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "hex") val hex: String,
    @ColumnInfo(name = "name") val name: String
) {
    companion object {
        val DEFAULT_TAGS = listOf(
            TagDbModel(1, "#000000","Mobile"),
            TagDbModel(2, "#FFFFFF","Iphone"),
            TagDbModel(3, "#FF8B3B","Work"),
            TagDbModel(4, "#3B4DFF","School"),
            TagDbModel(5, "#FF0000","Emergency"),
            TagDbModel(6, "#FFA0DA","Family"),
            TagDbModel(7, "#40E0D0","Gang"),

        )
        val DEFAULT_TAG = DEFAULT_TAGS[0]
    }
}
