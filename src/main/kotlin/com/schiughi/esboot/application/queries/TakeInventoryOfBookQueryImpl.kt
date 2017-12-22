package com.schiughi.esboot.application.queries

import com.schiughi.esboot.infra.records.BookRecord
import org.springframework.stereotype.Service

@Service
class TakeInventoryOfBookQueryImpl : TakeInventoryOfBookQuery {
    override fun run(): List<BookRecord> = BookRecord.find.all()
}
