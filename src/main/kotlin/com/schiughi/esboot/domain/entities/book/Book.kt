package com.schiughi.esboot.domain.entities.book

import com.schiughi.esboot.domain.entities.Entity

class Book(
        var title: String = "UNKNOWN",

        val isbn: Isbn = Isbn("")
) : Entity
