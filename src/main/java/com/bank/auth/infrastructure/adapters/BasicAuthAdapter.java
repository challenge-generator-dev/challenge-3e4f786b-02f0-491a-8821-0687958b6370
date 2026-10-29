package com.bank.auth.infrastructure.adapters;

import com.bank.auth.domain.model.User;
import com.bank.auth.domain.ports.AuthPort;
import com.bank.auth.infrastructure.security.JwtTokenUtil;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class BasicAuthAdapter implements AuthPort {

    private final JwtTokenUtil jwtTokenUtil;

    public BasicAuthAdapter(JwtTokenUtil jwtTokenUtil) {
        this.jwtTokenUtil = jwtTokenUtil;
    }

    @Override
    public User authenticate(String username, String password) {
        throw new UnsupportedOperationException("Implementar autenticación básica");
    }

    @Override
    public String generateToken(User user) {
        return jwtTokenUtil.generateToken(user);
    }
}