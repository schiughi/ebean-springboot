package com.schiughi.esboot.domain.repositories

import com.schiughi.esboot.domain.entities.book.Book

interface BookRepository {
    fun all(): List<Book>

    fun register(book: Book): Unit
}
