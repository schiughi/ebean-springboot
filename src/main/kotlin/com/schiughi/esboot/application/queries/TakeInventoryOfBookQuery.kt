package com.schiughi.esboot.application.queries

import com.schiughi.esboot.infra.records.BookRecord

interface TakeInventoryOfBookQuery {
    fun run(): List<BookRecord>
}
