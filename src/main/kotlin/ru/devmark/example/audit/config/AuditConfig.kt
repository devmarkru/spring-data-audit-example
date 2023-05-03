package ru.devmark.example.audit.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.domain.AuditorAware
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import java.util.Optional

@Configuration
@EnableJpaAuditing
class AuditConfig {

    @Bean
    fun auditorProvider(): AuditorAware<String> {
        // Your custom logic here
        return AuditorAware { Optional.of("my user") }
    }
}
