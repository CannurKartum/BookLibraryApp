package com.example.booklibraryapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "book_table")
data class Book (
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val bookName: String = "",
    val author: String = "",
    val publishedYear: Int
)

