package com.schiughi.esboot.domain

import io.ebean.annotation.Cache
import javax.persistence.Entity
import javax.persistence.Table
import javax.validation.constraints.NotNull

@Cache(enableQueryCache=true)
@Entity
@Table(name = "books")
data class Book(
        @get: NotNull
        var title: String = "UNKNOWN",
        @get: NotNull
        var isbn: String = ""
) : BaseEntity(){
    companion object find: BookFinder()
}
