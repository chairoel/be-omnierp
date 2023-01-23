package com.fluex404.omnierpusermanagement.config;

import com.fluex404.persistence.config.PersistenceConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.fluex404.omnierpusermanagement")
@PersistenceConfig
public class UserManagementConfigImpl {
}
