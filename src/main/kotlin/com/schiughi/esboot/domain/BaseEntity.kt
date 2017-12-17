package com.schiughi.esboot.domain

import io.ebean.Model
import io.ebean.annotation.WhenCreated
import io.ebean.annotation.WhenModified
import java.sql.Timestamp
import java.time.LocalDateTime
import javax.persistence.Id
import javax.persistence.MappedSuperclass

@MappedSuperclass
abstract class BaseEntity : Model(){
    @Id
    var id: Long? = null

    @WhenCreated
    var createdAt: Timestamp = Timestamp.valueOf(LocalDateTime.now())

    @WhenModified
    var updatedAt: Timestamp = Timestamp.valueOf(LocalDateTime.now())
}
