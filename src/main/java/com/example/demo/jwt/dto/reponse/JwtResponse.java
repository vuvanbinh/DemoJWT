package com.example.demo.jwt.dto.reponse;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

public class JwtResponse {
    private String token;
    private String type = "Bearer ";
    private Long id;
    private String username;
    private String email;
    private List<String> roles;

    public JwtResponse() {
    }

    public JwtResponse(String token, Long id, String username, String email, List<String> roles) {
        this.token = token;
        this.id = id;
        this.username = username;
        this.email = email;
        this.roles = roles;
    }
}
