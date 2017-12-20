package com.schiughi.esboot.application.services

import com.schiughi.esboot.application.forms.BookForm
import com.schiughi.esboot.domain.entities.book.Book

interface BooksService {
    fun selectAll(): List<Book>

    fun create(bookForm: BookForm): Book
}
