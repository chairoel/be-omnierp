package com.fluex404.omnierpauth.mapper;

import com.fluex404.omnierpauth.dto.PrivilageResponseDTO;
import com.fluex404.omnierpauth.dto.RoleResponseDTO;
import com.fluex404.omnierpauth.entity.Privilage;
import com.fluex404.omnierpauth.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class PrivilageMapper {
    public static PrivilageMapper INSTANCE = Mappers.getMapper(PrivilageMapper.class);

    public abstract PrivilageResponseDTO toDTO(Privilage entity);

}
