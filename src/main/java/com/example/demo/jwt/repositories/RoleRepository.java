package com.example.demo.jwt.repositories;

import com.example.demo.jwt.common.ERole;
import com.example.demo.jwt.entities.Role;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository {

    Optional<Role> findByName(ERole name);

}
