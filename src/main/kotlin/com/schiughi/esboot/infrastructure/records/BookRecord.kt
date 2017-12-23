package com.schiughi.esboot.infrastructure.records

import io.ebean.Finder
import io.ebean.annotation.Cache
import javax.persistence.*
import javax.validation.constraints.NotNull

@Cache(enableQueryCache=true)
@Entity
@Table(name = "books")
class BookRecord(
        @get: NotNull
        var title: String = "UNKNOWN",
        @get: NotNull
        var isbn: String = ""
) : BaseRecord(), Record {
    companion object find: BookFinder()

}

open class BookFinder : Finder<Long, BookRecord> {
    constructor() : super(BookRecord::class.java)

    constructor(serverName: String) : super(BookRecord::class.java, serverName)
}

