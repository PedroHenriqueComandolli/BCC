package br.furb.restapifurb.controller;

import br.furb.restapifurb.dto.LoginRequest;
import br.furb.restapifurb.dto.LoginResponse;
import br.furb.restapifurb.security.JwtService;
import jakarta.validation.Valid;
import org.springframework.security.authentication.*;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;

    public AuthController(AuthenticationManager authenticationManager, JwtService jwtService) {
        this.authenticationManager = authenticationManager;
        this.jwtService = jwtService;
    }

    @PostMapping("/login")
    public LoginResponse login(@Valid @RequestBody LoginRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.username(), request.senha())
        );

        UserDetails user = org.springframework.security.core.userdetails.User
                .withUsername(request.username())
                .password("")
                .roles("USER")
                .build();

        String token = jwtService.generateToken(user);

        return new LoginResponse(token, "Bearer", jwtService.getExpiration());
    }
}
