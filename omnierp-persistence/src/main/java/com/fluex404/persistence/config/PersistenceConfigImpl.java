package com.fluex404.persistence.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan("com.fluex404.persistence")
@EnableJpaRepositories(basePackages = "com.fluex404.persistence.repository")
@EntityScan(basePackages = "com.fluex404.persistence.entity")
public class PersistenceConfigImpl {
}
