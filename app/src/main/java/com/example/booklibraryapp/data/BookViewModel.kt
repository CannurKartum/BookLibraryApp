package com.example.booklibraryapp.data

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class BookViewModel(application: Application): AndroidViewModel(application){
    private val readAllData: LiveData<List<Book>>
    private val repository: BookRepository

    init{
        val BookDao = BookDatabase.getDatabase(application).bookDao()
        repository = BookRepository(BookDao)
        readAllData = repository.readAllData
    }

    fun addBook(book:Book){
        viewModelScope.launch(Dispatchers.IO){
            repository.addBook(book)
        }
    }
}