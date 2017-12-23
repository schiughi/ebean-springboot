package com.schiughi.esboot.domain.entities.book

import com.schiughi.esboot.domain.entities.ValueObject

data class Isbn(val value: String = "") : ValueObject{
    override fun toString() = value
}
