package com.schiughi.esboot.presentation.api.books

import com.schiughi.esboot.application.forms.BookForm
import com.schiughi.esboot.application.services.BooksService
import com.schiughi.esboot.domain.entities.book.Book
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
class RegistrationController @Autowired constructor(private val service: BooksService) {
    @RequestMapping(value = "/books", method = arrayOf(RequestMethod.POST),  consumes = arrayOf(MediaType.APPLICATION_JSON_VALUE) )
    @ResponseBody
    fun create(@RequestBody bookForm: BookForm): Book = service.create(bookForm)
}
