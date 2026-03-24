package com.jacksondelima.taskflow.dto.auth;

public record LoginRequestDTO(
        String email,
        String password
) {}