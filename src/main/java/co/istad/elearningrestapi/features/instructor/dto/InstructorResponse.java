package co.istad.elearningrestapi.features.instructor.dto;

import jakarta.validation.constraints.NotBlank;

public record InstructorResponse(
        String biography,
        String github,
        String jobTitle,
        String linkedIn,
        String website
) {
}
