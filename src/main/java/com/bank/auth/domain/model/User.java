package com.bank.auth.domain.model;

import java.util.UUID;

/**
 * Entidad de dominio que representa un usuario del sistema bancario.
 * Superficie de práctica para implementar la lógica de negocio.
 */
public class User {
    private UUID id;
    private String username;
    private String password;
    private String email;
    private String role;

    public User(UUID id, String username, String password, String email, String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
    }

    public UUID getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }
}