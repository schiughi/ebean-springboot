package com.schiughi.esboot.application.commands

import com.schiughi.esboot.application.forms.BookForm
import com.schiughi.esboot.domain.repositories.BookRepository
import com.schiughi.esboot.infrastructure.mappers.BookMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class RegisterNewArrivalBookCommandImpl @Autowired constructor(private val repository: BookRepository) : RegisterNewArrivalBookCommand {
    override fun create(bookForm: BookForm) {
        val book = BookMapper.convertToEntity(bookForm)
        repository.register(book)
    }
}
