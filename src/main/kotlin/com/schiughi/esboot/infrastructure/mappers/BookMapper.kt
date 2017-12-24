package com.schiughi.esboot.infrastructure.mappers

import com.schiughi.esboot.application.forms.BookForm
import com.schiughi.esboot.domain.entities.book.Book
import com.schiughi.esboot.domain.entities.book.Isbn
import com.schiughi.esboot.infrastructure.records.BookRecord

object BookMapper : Mapper<BookForm,Book,BookRecord> {
    override fun convertToEntity(form: BookForm): Book = Book(title = form.title, isbn = Isbn(form.isbn))

    override fun convertToEntity(record: BookRecord): Book = Book(title = record.title, isbn = Isbn(record.isbn))

    override fun convertToRecord(entity: Book): BookRecord = BookRecord(title = entity.title, isbn = entity.isbn.toString())
}
