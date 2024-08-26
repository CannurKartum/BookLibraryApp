package com.example.booklibraryapp.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

// Data Access Object for the Book entity
@Dao
interface BookDao {
    @Insert(onConflict = OnConflictStrategy.ABORT)
    fun addBook(book: Book)

    @Query("SELECT * FROM book_table ORDER BY id ASC")
    fun readAllBooks(): LiveData<List<Book>>
}