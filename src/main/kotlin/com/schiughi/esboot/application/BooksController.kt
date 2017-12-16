package com.schiughi.esboot.application

import com.schiughi.esboot.domain.Book
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController


@RestController
class BooksController @Autowired constructor(private val service: SearchBooksService) {
    @RequestMapping(value = "/books", method = arrayOf(RequestMethod.GET))
    @ResponseBody
    fun index(): List<Book> = service.run()

    @RequestMapping(value = "/books/hello", method = arrayOf(RequestMethod.GET) )
    @ResponseBody
    fun hello(): String = "hello!!"
}
