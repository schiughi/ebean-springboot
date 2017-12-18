package com.schiughi.esboot.domain.book

import com.schiughi.esboot.domain.Entity
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
