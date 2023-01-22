package com.fluex404.omnierpauth.service.impl;

import com.fluex404.omnierpauth.dto.UserAuthenticationResponseDTO;
import com.fluex404.omnierpauth.dto.UserLoginRequestDTO;
import com.fluex404.omnierpauth.dto.UserRegistrationRequestDTO;
import com.fluex404.omnierpauth.entity.User;
import com.fluex404.omnierpauth.repository.RoleRepository;
import com.fluex404.omnierpauth.repository.UserRepository;
import com.fluex404.omnierpauth.service.UserService;
import com.fluex404.omnierpauth.utils.JwtUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtils jwtUtils;
    private final AuthenticationManager authenticationManager;

    @Override
    public UserAuthenticationResponseDTO register(UserRegistrationRequestDTO dto){
        var user = User.builder()
                .firstname(dto.getFirstname())
                .lastname(dto.getLastname())
                .email(dto.getEmail())
                .password(passwordEncoder.encode(dto.getPassword()))
                .roles(roleRepository.findAllByNameIn(dto.getRoles()))
                .build();
        userRepository.save(user);
        var jwtToken = jwtUtils.generateToken(user);
        return UserAuthenticationResponseDTO.builder().jwtToken(jwtToken).build();
    }
    @Override
    public UserAuthenticationResponseDTO login(UserLoginRequestDTO dto){
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        dto.getEmail(),
                        dto.getPassword()
                )
        );
        var user = userRepository.findByEmail(dto.getEmail())
                .orElseThrow();
        var jwtToken = jwtUtils.generateToken(user);
        return UserAuthenticationResponseDTO.builder()
                .jwtToken(jwtToken)
                .build();
    }
}
