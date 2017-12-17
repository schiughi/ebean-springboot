package com.schiughi.esboot.infra

import io.ebean.EbeanServer
import io.ebean.EbeanServerFactory
import io.ebean.config.ServerConfig
import org.springframework.beans.factory.FactoryBean
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component


@Component
class EbeanFactoryBean @Autowired constructor(private val currentUser: CurrentUser) : FactoryBean<EbeanServer> {
    override fun getObject(): EbeanServer {
        val config = ServerConfig()
        config.addPackage("com.schiughi.esboot")
        config.name = "db"
        config.isDefaultServer = true
        config.currentUserProvider = currentUser
        config.loadFromProperties()
        return EbeanServerFactory.create(config)
    }

    override fun getObjectType(): Class<*> = EbeanServer::class.java

    override fun isSingleton(): Boolean = true
}
