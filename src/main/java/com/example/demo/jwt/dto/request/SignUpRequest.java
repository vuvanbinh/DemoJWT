package com.example.demo.jwt.dto.request;

import lombok.Data;

import java.util.Set;

@Data
public class SignUpRequest {
    private String username;
    private String email;
    private String password;
    private Set<String> role;
}
