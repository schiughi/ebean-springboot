package com.schiughi.esboot.infrastructure.mappers

import com.schiughi.esboot.application.forms.BookForm
import com.schiughi.esboot.domain.entities.book.Book
import com.schiughi.esboot.domain.entities.book.Isbn
import com.schiughi.esboot.infrastructure.records.BookRecord

object BookMapper : Mapper<BookForm,Book,BookRecord> {
    override fun convertToEntity(bookForm: BookForm): Book = Book(title = bookForm.title, isbn = Isbn(bookForm.isbn))

    override fun convertToRecord(book: Book): BookRecord = BookRecord(title = book.title, isbn = book.isbn.toString())
}
