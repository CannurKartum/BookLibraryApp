package com.example.booklibraryapp.data

import androidx.lifecycle.LiveData

class BookRepository(private val bookDao: BookDao) {

    val readAllData: LiveData<List<Book>> = bookDao.readAllBooks()

    suspend fun addBook(book: Book) {
        bookDao.addBook(book)
        }
}