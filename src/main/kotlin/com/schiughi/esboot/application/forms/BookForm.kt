package com.schiughi.esboot.application.forms

import org.hibernate.validator.constraints.NotBlank

data class BookForm(
        @NotBlank
        var title: String = "",
        @NotBlank
        var isbn: String = "") : Form
