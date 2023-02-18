package com.fluex404.omnierpauth.api;

import com.fluex404.omnierpauth.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/role")
@RequiredArgsConstructor
public class RoleApi {

    private final RoleService roleService;

    @GetMapping
    public ResponseEntity get() {
        return ResponseEntity.ok(roleService.get());
    }
}
