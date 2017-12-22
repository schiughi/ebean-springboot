package com.schiughi.esboot.application.commands

import com.schiughi.esboot.application.forms.BookForm
import com.schiughi.esboot.domain.entities.book.Book

interface RegisterNewArrivalBookCommand {
    fun create(bookForm: BookForm): Book
}
