package com.fluex404.omnierpauth.service.impl;

import com.fluex404.omnierpauth.dto.RoleResponseDTO;
import com.fluex404.omnierpauth.mapper.RoleMapper;
import com.fluex404.omnierpauth.repository.RoleRepository;
import com.fluex404.omnierpauth.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    @Override
    public List<RoleResponseDTO> get() {
        return roleRepository.findAll()
                .stream().map(RoleMapper.INSTANCE::toDTO).collect(Collectors.toList());
    }
}
