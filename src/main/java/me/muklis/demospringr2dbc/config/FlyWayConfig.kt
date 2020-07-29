package me.muklis.demospringr2dbc.config

import lombok.extern.slf4j.Slf4j
import org.flywaydb.core.Flyway
import org.springframework.boot.autoconfigure.flyway.FlywayProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Slf4j
@Configuration
class FlyWayConfig() {

    lateinit var flywayProperties: FlywayProperties

    @Bean(initMethod = "migrate")
    fun flyWay(): Flyway {
        return Flyway(Flyway
                .configure()
                .baselineOnMigrate(true)
                .dataSource(flywayProperties.url, flywayProperties.user, flywayProperties.password))
    }

}