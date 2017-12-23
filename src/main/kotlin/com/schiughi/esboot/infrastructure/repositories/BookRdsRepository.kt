package com.schiughi.esboot.infrastructure.repositories

import com.schiughi.esboot.domain.entities.book.Book
import com.schiughi.esboot.domain.repositories.BookRepository
import com.schiughi.esboot.infrastructure.mappers.BookMapper
import org.springframework.stereotype.Repository

@Repository
class BookRdsRepository : BookRepository {
    override fun register(book: Book) {
        BookMapper.convertToRecord(book).save()
    }
}
