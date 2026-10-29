package com.bank.auth.domain.ports;

import com.bank.auth.domain.model.User;

/**
 * Interfaz del puerto de autenticación definida por el dominio.
 * Superficie de práctica para implementar la lógica de autenticación.
 */
public interface AuthPort {
    /**
     * Valida las credenciales de un usuario.
     * @param username Nombre de usuario
     * @param password Contraseña en texto plano
     * @return Usuario autenticado
     * @throws com.bank.auth.domain.exceptions.AuthException Si las credenciales son inválidas
     */
    User authenticate(String username, String password);

    /**
     * Genera un token JWT para un usuario autenticado.
     * @param user Usuario autenticado
     * @return Token JWT como cadena
     */
    String generateToken(User user);
}