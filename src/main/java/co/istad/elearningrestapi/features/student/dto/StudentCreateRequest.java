package co.istad.elearningrestapi.features.student.dto;

import jakarta.validation.constraints.NotBlank;

public record StudentCreateRequest(
        @NotBlank(message = "HighSchool is required")
        String highSchool,
        @NotBlank(message = "University is required")
        String university
) {
}
