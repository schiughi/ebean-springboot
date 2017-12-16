package esboot.application

import esboot.domain.Book
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/books")
class BooksController @Autowired constructor(private val service: SearchBooksService) {
    @RequestMapping(value = "/index", method = arrayOf(RequestMethod.GET))
    fun index(): List<Book> = service.run()
}
