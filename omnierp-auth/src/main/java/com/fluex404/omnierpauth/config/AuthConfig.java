package com.fluex404.omnierpauth.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import(AuthConfigImpl.class)
@Configuration
public @interface AuthConfig {
}
