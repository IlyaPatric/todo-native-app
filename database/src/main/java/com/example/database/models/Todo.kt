package com.example.database.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TodoDBO(
    @PrimaryKey(autoGenerate = true) val id: Long,
    @ColumnInfo("name") val name: String,
    @ColumnInfo("completed") val isCompleted: Boolean,
)
