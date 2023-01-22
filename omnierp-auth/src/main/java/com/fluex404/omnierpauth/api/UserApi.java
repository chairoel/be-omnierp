package com.fluex404.omnierpauth.api;

import com.fluex404.omnierpauth.dto.UserLoginRequestDTO;
import com.fluex404.omnierpauth.dto.UserRegistrationRequestDTO;
import com.fluex404.omnierpauth.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserApi {

    private final UserService userService;

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody UserLoginRequestDTO dto) {
        return ResponseEntity.ok(userService.login(dto));
    }

    @PostMapping("/regis")
    public ResponseEntity regis(@RequestBody UserRegistrationRequestDTO dto){
        return ResponseEntity.ok(userService.register(dto));
    }

    @GetMapping("/role1")
    @PreAuthorize("hasAnyAuthority('user-api:edit')")
    public ResponseEntity role1(){
        return ResponseEntity.ok("Hallo user how have role role1");
    }

    @GetMapping("/role2")
    @PreAuthorize("hasAnyAuthority('user-api:delete')")
    public ResponseEntity role2(){
        return ResponseEntity.ok("Hallo user how have role role2");
    }

}
