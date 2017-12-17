package com.schiughi.esboot.domain

import io.ebean.Finder

open class BookFinder : Finder<Long, Book> {
    constructor() : super(Book::class.java)

    constructor(serverName: String) : super(Book::class.java, serverName)
}
