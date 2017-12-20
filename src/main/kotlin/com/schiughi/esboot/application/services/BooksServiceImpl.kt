package com.schiughi.esboot.application.services

import com.schiughi.esboot.application.forms.BookForm
import com.schiughi.esboot.domain.repositories.BookRepository
import com.schiughi.esboot.domain.entities.book.Book
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class BooksServiceImpl @Autowired constructor(private val repository: BookRepository) : BooksService{
    override fun selectAll(): List<Book> = repository.all()

    override fun create(bookForm: BookForm): Book {
        val book = Book.of(bookForm)
        repository.register(book)
        return book
    }
}
