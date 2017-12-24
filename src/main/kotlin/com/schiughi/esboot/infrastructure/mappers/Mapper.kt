package com.schiughi.esboot.infrastructure.mappers

import com.schiughi.esboot.application.forms.Form
import com.schiughi.esboot.domain.entities.Entity
import com.schiughi.esboot.infrastructure.records.Record

/**
 * レイヤー間のデータの受け渡しを担うインターフェース
 * Query層では使用しない
 */
interface Mapper <in F, E, R>
        where F: Form,
              E: Entity,
              R: Record {
    fun convertToEntity(form: F): E

    fun convertToEntity(record: R): E

    fun convertToRecord(entity: E): R
}
