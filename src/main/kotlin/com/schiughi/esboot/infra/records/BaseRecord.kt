package com.schiughi.esboot.infra.records

import io.ebean.annotation.WhenCreated
import io.ebean.annotation.WhenModified
import java.time.LocalDateTime
import javax.persistence.Id
import javax.persistence.MappedSuperclass

@MappedSuperclass
abstract class BaseRecord {
    @Id
    var id: Long? = null

    @WhenCreated
    var createdAt: LocalDateTime = LocalDateTime.now()

    @WhenModified
    var updatedAt: LocalDateTime = LocalDateTime.now()

}