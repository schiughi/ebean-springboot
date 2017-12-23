package com.schiughi.esboot.application.queries

import com.schiughi.esboot.infrastructure.records.BookRecord

interface TakeInventoryOfBookQuery {
    fun run(): List<BookRecord>
}
