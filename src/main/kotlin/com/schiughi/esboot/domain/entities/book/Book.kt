package com.schiughi.esboot.domain.entities.book

import com.schiughi.esboot.application.forms.BookForm
import com.schiughi.esboot.domain.entities.Entity
import com.schiughi.esboot.infra.records.BookRecord

class Book(
        var title: String = "UNKNOWN",

        val isbn: Isbn = Isbn("")
) : Entity<Book> {
    companion object {
        fun of(form: BookForm): Book {
            return Book(title = form.title , isbn = Isbn(form.isbn))
        }
    }
}
