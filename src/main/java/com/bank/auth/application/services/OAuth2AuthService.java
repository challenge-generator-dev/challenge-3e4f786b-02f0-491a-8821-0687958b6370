package com.bank.auth.application.services;

import com.bank.auth.domain.model.User;
import com.bank.auth.domain.ports.AuthPort;
import org.springframework.stereotype.Service;

@Service
public class OAuth2AuthService {

    private final AuthPort authPort;

    public OAuth2AuthService(AuthPort authPort) {
        this.authPort = authPort;
    }

    public User authenticateWithOAuth2(String authorizationCode) {
        throw new UnsupportedOperationException("Implementar autenticación OAuth2");
    }

    public String generateOAuth2Token(User user) {
        return authPort.generateToken(user);
    }

    public User validateOAuth2Token(String token) {
        throw new UnsupportedOperationException("Implementar validación de token OAuth2");
    }
}