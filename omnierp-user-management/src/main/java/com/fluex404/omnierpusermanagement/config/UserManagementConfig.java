package com.fluex404.omnierpusermanagement.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import(UserManagementConfigImpl.class)
@Configuration
public @interface UserManagementConfig {
}
