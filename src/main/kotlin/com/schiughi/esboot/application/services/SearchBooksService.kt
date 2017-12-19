package com.schiughi.esboot.application.services

import com.schiughi.esboot.domain.repositories.BookRepository
import com.schiughi.esboot.domain.entities.book.Book
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SearchBooksService @Autowired constructor(private val repository: BookRepository) {
    fun run(): List<Book> = repository.all()
}
