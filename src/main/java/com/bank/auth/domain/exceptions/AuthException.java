package com.bank.auth.domain.exceptions;

/**
 * Excepción base para errores de autenticación.
 * Superficie de práctica para manejar errores específicos.
 */
public class AuthException extends RuntimeException {
    public AuthException(String message) {
        super(message);
    }

    public AuthException(String message, Throwable cause) {
        super(message, cause);
    }
}