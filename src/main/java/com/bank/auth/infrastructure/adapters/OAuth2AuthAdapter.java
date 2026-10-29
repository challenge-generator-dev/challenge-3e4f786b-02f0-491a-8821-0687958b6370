package com.bank.auth.infrastructure.adapters;

import com.bank.auth.domain.model.User;
import com.bank.auth.domain.ports.AuthPort;
import com.bank.auth.infrastructure.security.JwtTokenUtil;
import org.springframework.stereotype.Component;

@Component
public class OAuth2AuthAdapter implements AuthPort {

    private final JwtTokenUtil jwtTokenUtil;

    public OAuth2AuthAdapter(JwtTokenUtil jwtTokenUtil) {
        this.jwtTokenUtil = jwtTokenUtil;
    }

    @Override
    public User authenticate(String username, String password) {
        throw new UnsupportedOperationException("Implementar autenticación OAuth2");
    }

    @Override
    public String generateToken(User user) {
        return jwtTokenUtil.generateToken(user);
    }

    public User authenticateWithAuthorizationCode(String code) {
        throw new UnsupportedOperationException("Implementar flujo OAuth2 con código de autorización");
    }

    public String refreshToken(String refreshToken) {
        throw new UnsupportedOperationException("Implementar renovación de token OAuth2");
    }
}