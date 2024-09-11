package org.ugonna.springboot.keycloak.dto;

import lombok.Data;

@Data
public class RegisterRequest {
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String password;
}