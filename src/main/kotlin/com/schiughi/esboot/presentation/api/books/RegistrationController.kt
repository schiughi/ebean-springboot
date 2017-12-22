package com.schiughi.esboot.presentation.api.books

import com.schiughi.esboot.application.forms.BookForm
import com.schiughi.esboot.application.commands.RegisterNewArrivalBookCommand
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
class RegistrationController @Autowired constructor(private val command: RegisterNewArrivalBookCommand) {
    @RequestMapping(value = "/books", method = arrayOf(RequestMethod.POST),  consumes = arrayOf(MediaType.APPLICATION_JSON_VALUE) )
    @ResponseStatus
    fun create(@RequestBody bookForm: BookForm) = command.create(bookForm)
}
