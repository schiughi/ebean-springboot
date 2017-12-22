package com.schiughi.esboot.application.commands

import com.schiughi.esboot.application.forms.BookForm
import com.schiughi.esboot.domain.entities.book.Book
import com.schiughi.esboot.domain.repositories.BookRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class RegisterNewArrivalBookCommandImpl @Autowired constructor(private val repository: BookRepository) : RegisterNewArrivalBookCommand {
    override fun create(bookForm: BookForm): Book {
        val book = Book.of(bookForm)
        repository.register(book)
        return book
    }
}
