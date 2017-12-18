package com.schiughi.esboot.domain

import com.schiughi.esboot.domain.book.Book

interface BookRepository {
    fun all(): List<Book>
}
