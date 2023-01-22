package com.fluex404.omnierpauth.repository;

import com.fluex404.omnierpauth.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface RoleRepository extends JpaRepository<Role, Long> {
    List<Role> findAllByName(String name);
    List<Role> findAllByNameIn(List<String> names);
}