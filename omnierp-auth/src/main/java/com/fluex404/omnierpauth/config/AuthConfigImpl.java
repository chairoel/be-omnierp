package com.fluex404.omnierpauth.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan("com.fluex404.omnierpauth")
@EnableJpaRepositories(basePackages = "com.fluex404.omnierpauth.repository")
@EntityScan(basePackages = "com.fluex404.omnierpauth.entity")
public class AuthConfigImpl {
}
