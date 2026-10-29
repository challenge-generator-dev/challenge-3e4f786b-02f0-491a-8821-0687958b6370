package com.bank.auth.application.services;


import com.bank.auth.infrastructure.security.JwtTokenUtil;
import com.bank.auth.domain.model.User;
import com.bank.auth.domain.ports.AuthPort;
import org.springframework.stereotype.Service;

@Service
public class BasicAuthService implements AuthPort {

    private final UserRepository userRepository;
    private final JwtTokenUtil jwtTokenUtil;

    public BasicAuthService(UserRepository userRepository, JwtTokenUtil jwtTokenUtil) {
        this.userRepository = userRepository;
        this.jwtTokenUtil = jwtTokenUtil;
    }

    @Override
    public User authenticate(String username, String password) {
        throw new UnsupportedOperationException("Implementar autenticación básica");
    }

    @Override
    public String generateToken(User user) {
        throw new UnsupportedOperationException("Implementar generación de token");
    }
}