package com.schiughi.esboot.infra.repositories

import com.schiughi.esboot.domain.repositories.BookRepository
import com.schiughi.esboot.domain.entities.book.Book
import com.schiughi.esboot.infra.records.BookRecord
import org.springframework.stereotype.Component

@Component
class BookRepositoryImpl : BookRepository {
    override fun all(): List<Book> = BookRecord.find.all().map { Book.of(it) }
}

