package com.schiughi.esboot.domain.entities.book

import com.schiughi.esboot.domain.entities.Entity
import com.schiughi.esboot.infra.records.BookRecord

class Book(
        var title: String = "UNKNOWN",

        val isbn: Isbn = Isbn("")
) : Entity<Book> {
    companion object {
        fun of(record: BookRecord): Book {
            return Book(title = record.title, isbn = Isbn(value = record.isbn))
        }
    }
}
