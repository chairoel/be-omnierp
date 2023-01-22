package com.fluex404.omnierpauth.service;

import com.fluex404.omnierpauth.dto.UserAuthenticationResponseDTO;
import com.fluex404.omnierpauth.dto.UserLoginRequestDTO;
import com.fluex404.omnierpauth.dto.UserRegistrationRequestDTO;

public interface UserService {
    UserAuthenticationResponseDTO register(UserRegistrationRequestDTO dto);

    UserAuthenticationResponseDTO login(UserLoginRequestDTO dto);
}
