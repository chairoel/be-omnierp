package com.fluex404.omnierpauth.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserApi {
    @GetMapping
    public ResponseEntity get(){
        return ResponseEntity.ok("Hallo User");
    }
}
