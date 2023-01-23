package com.fluex404.persistence.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import(PersistenceConfigImpl.class)
@Configuration
public @interface PersistenceConfig {
}
