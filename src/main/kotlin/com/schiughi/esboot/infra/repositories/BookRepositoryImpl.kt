package com.schiughi.esboot.infra.repositories

import com.schiughi.esboot.domain.entities.book.Book
import com.schiughi.esboot.domain.repositories.BookRepository
import com.schiughi.esboot.infra.records.BookRecord
import org.springframework.stereotype.Repository

@Repository
class BookRepositoryImpl : BookRepository {
    override fun all(): List<Book> = BookRecord.find.all().map { Book.of(it) }

    override fun register(book: Book) {
        BookRecord(title = book.title, isbn = book.isbn.toString()).save()
    }
}

