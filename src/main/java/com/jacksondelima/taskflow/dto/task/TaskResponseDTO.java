package com.jacksondelima.taskflow.dto.task;

public record TaskResponseDTO(
        Long id,
        String title,
        String description,
        String status,
        String userEmail
) {
}