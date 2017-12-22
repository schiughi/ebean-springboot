package com.schiughi.esboot.domain.repositories

import com.schiughi.esboot.domain.entities.book.Book

interface BookRepository {
    fun register(book: Book)
}
