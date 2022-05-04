package com.example.contact.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ContactDbModel(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "content") val content: String,
    @ColumnInfo(name = "can_be_checked_off") val canBeCheckedOff: Boolean,
    @ColumnInfo(name = "is_checked_off") val isCheckedOff: Boolean,
    @ColumnInfo(name = "tag_id") val tagId: Long,
    @ColumnInfo(name = "in_trash") val isInTrash: Boolean,
    @ColumnInfo(name = "is_recent") val isRecent: Boolean,




) {
    companion object {
        val DEFAULT_CONTACTS = listOf(
            ContactDbModel(1, "Dad", "0813611007", false, false, 6, false,false),
            ContactDbModel(2, "Mom", "0853678907", false, false, 6, false,false),
            ContactDbModel(3, "Sister", "0638642568", false, false, 6, false,false),
            ContactDbModel(4, "Bob", "076283002", false, false, 2, false,false),
            ContactDbModel(5, "Mr.Tar", "0854281363", false, false, 3, false,false),
            ContactDbModel(6, "Yim", "0882368140", false, false, 1, false,false),
            ContactDbModel(7, "Gym", "0872730665", false, false, 1, false,false),
            ContactDbModel(8, "David", "0892430274", false, false, 5, false,false),
            ContactDbModel(9, "Teacher", "022728933", false, false, 7, false,false),
            ContactDbModel(10, "Nin", "0849306775", false, false, 7, false,false),
            ContactDbModel(11, "Ohm", "0832744536", false, false, 7, false,false),
            ContactDbModel(12, "Kik", "0896457575", false, false, 7, false,false),
            ContactDbModel(13, "Pun", "08143563290", false, false, 7, false,false),
        )
    }
}


