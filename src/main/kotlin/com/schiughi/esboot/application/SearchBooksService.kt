package com.schiughi.esboot.application

import com.schiughi.esboot.domain.Book
import io.ebean.EbeanServer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SearchBooksService @Autowired constructor(private val server: EbeanServer) {
    fun run(): List<Book> = server.find(Book::class.java).findList()
}
