package com.auradecristal.aura_de_cristal.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {
    private String nombre;
    private String apellido;
    private String email;
    private String password;
}