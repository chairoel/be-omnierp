package com.fluex404.omnierpauth.mapper;

import com.fluex404.omnierpauth.dto.RoleResponseDTO;
import com.fluex404.omnierpauth.entity.Privilage;
import com.fluex404.omnierpauth.entity.Role;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.stream.Collectors;

@Mapper
public abstract class RoleMapper {
    public static RoleMapper INSTANCE = Mappers.getMapper(RoleMapper.class);

    public abstract RoleResponseDTO toDTO(Role entity);

    @AfterMapping
    public void afterToDTO(@MappingTarget RoleResponseDTO dto, Role entity) {
        dto.setPrivilages(
                entity.getPrivilages().stream().map(PrivilageMapper.INSTANCE::toDTO).collect(Collectors.toList())
        );
    }
}
