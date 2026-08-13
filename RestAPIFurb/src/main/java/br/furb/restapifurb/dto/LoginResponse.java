package br.furb.restapifurb.dto;

public record LoginResponse(String token, String tipo, long expiresIn) {}
