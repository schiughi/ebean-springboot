package com.schiughi.esboot.application

import com.schiughi.esboot.domain.Book
import io.ebean.Ebean
import org.springframework.stereotype.Service

@Service
class SearchBooksService {
    fun run(): List<Book> = Ebean.find(Book::class.java).findList()
}
