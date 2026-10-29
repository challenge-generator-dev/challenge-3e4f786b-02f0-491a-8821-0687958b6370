package com.bank.auth.infrastructure.controllers;

import com.bank.auth.domain.ports.AuthPort;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/auth")
@Tag(name = "Autenticación", description = "Endpoints para gestión de autenticación de usuarios")
public class AuthController {

    private final AuthPort authPort;

    public AuthController(AuthPort authPort) {
        this.authPort = authPort;
    }

    @PostMapping("/login")
    @Operation(summary = "Autenticar usuario", description = "Autentica un usuario y retorna token JWT")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Autenticación exitosa"),
        @ApiResponse(responseCode = "401", description = "Credenciales inválidas"),
        @ApiResponse(responseCode = "400", description = "Solicitud inválida")
    })
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        // SUPERFICIE DE PRÁCTICA: Implementar autenticación
        // El estudiante debe completar la lógica aquí
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED)
            .body(Map.of("message", "Implementar autenticación básica"));
    }

    @PostMapping("/oauth2/login")
    @Operation(summary = "Autenticación OAuth2", description = "Autentica usuario mediante OAuth2")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Autenticación OAuth2 exitosa"),
        @ApiResponse(responseCode = "401", description = "Autenticación OAuth2 fallida")
    })
    public ResponseEntity<?> oauth2Login(@RequestBody OAuth2LoginRequest request) {
        // SUPERFICIE DE PRÁCTICA: Implementar autenticación OAuth2
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED)
            .body(Map.of("message", "Implementar autenticación OAuth2"));
    }

    @GetMapping("/validate")
    @Operation(summary = "Validar token", description = "Valida un token JWT existente")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Token válido"),
        @ApiResponse(responseCode = "401", description = "Token inválido o expirado")
    })
    public ResponseEntity<?> validateToken(@RequestHeader("Authorization") String authHeader) {
        // SUPERIFICIE DE PRÁCTICA: Implementar validación de token
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED)
            .body(Map.of("message", "Implementar validación de token"));
    }

    @PostMapping("/refresh")
    @Operation(summary = "Refrescar token", description = "Obtiene un nuevo token JWT antes de expirar")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Token refrescado exitosamente"),
        @ApiResponse(responseCode = "401", description = "No se pudo refrescar el token")
    })
    public ResponseEntity<?> refreshToken(@RequestBody RefreshTokenRequest request) {
        // SUPERFICIE DE PRÁCTICA: Implementar refresh de token
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED)
            .body(Map.of("message", "Implementar refresh de token"));
    }

    // DTOs del request
    public record LoginRequest(String username, String password) {}
    public record OAuth2LoginRequest(String provider, String authCode) {}
    public record RefreshTokenRequest(String refreshToken) {}
}