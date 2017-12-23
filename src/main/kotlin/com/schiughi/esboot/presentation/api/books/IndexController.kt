package com.schiughi.esboot.presentation.api.books

import com.schiughi.esboot.application.queries.TakeInventoryOfBookQuery
import com.schiughi.esboot.infrastructure.records.BookRecord
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
class IndexController @Autowired constructor(private val query: TakeInventoryOfBookQuery) {
    @RequestMapping(value = "/books", method = arrayOf(RequestMethod.GET))
    @ResponseBody
    fun index(): List<BookRecord> = query.run()
}
