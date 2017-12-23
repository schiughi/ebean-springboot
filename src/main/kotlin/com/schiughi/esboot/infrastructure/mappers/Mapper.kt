package com.schiughi.esboot.infrastructure.mappers

import com.schiughi.esboot.application.forms.Form
import com.schiughi.esboot.domain.entities.Entity
import com.schiughi.esboot.infrastructure.records.Record

/**
 * レイヤー間のデータの受け渡しを担うインターフェース
 * Query層では使用しない
 * 処理の流れは Form -> Entity -> Record に限られる。
 *
 */
interface Mapper <in F : Form, E : Entity, out R: Record>{
    fun convertToEntity(form: F): E

    fun convertToRecord(entity: E): R
}

