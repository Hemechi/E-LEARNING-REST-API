package co.istad.elearningrestapi.features.student.dto;

import jakarta.validation.constraints.NotBlank;

public record StudentResponse(
        String highSchool,
        String university
) {
}
