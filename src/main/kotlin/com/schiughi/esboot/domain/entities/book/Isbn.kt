package com.schiughi.esboot.domain.entities.book

import com.schiughi.esboot.domain.entities.ValueObject
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

data class Isbn(
        @Size(min = 13, max = 17)
        @Pattern(regexp = "([0-9]{3})-?([0-9]+)-?([0-9]+)-?([0-9]+)-?([0-9])")
        private val value: String
) : ValueObject {
    override fun toString() = value
}
