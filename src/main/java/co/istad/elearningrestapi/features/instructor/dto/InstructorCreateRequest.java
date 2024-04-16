package co.istad.elearningrestapi.features.instructor.dto;

import jakarta.validation.constraints.NotBlank;

public record InstructorCreateRequest(
        @NotBlank(message = "Biography is required")
        String biography,
        String github,
        @NotBlank(message = "Job Title is required")
        String jobTitle,
        String linkedIn,
        String website
) {
}
