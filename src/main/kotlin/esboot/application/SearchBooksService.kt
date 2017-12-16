package esboot.application

import esboot.domain.Book
import io.ebean.Ebean
import org.springframework.stereotype.Service

@Service
class SearchBooksService {
    fun run(): List<Book> = Ebean.find(Book::class.java).findList()
}
