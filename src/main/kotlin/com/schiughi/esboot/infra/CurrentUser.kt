package com.schiughi.esboot.infra

import io.ebean.config.CurrentUserProvider
import org.springframework.stereotype.Component

@Component
class CurrentUser : CurrentUserProvider {
    override fun currentUser(): Any = "test"
}
