package com.schiughi.esboot.application

import com.schiughi.esboot.domain.BookRepository
import com.schiughi.esboot.domain.book.Book
import io.ebean.EbeanServer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SearchBooksService @Autowired constructor(private val repository: BookRepository) {
    fun run(): List<Book> = repository.all()
}
