package com.schiughi.esboot.application.commands

import com.schiughi.esboot.application.forms.BookForm

interface RegisterNewArrivalBookCommand {
    fun create(bookForm: BookForm)
}
