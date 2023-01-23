package com.fluex404.omnierpapp;

import com.fluex404.omnierpauth.config.AuthConfig;
import com.fluex404.omnierpusermanagement.config.UserManagementConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AuthConfig
@UserManagementConfig
public class OmnierpAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(OmnierpAppApplication.class, args);
    }

}
