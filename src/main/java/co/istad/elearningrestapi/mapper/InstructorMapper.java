package co.istad.elearningrestapi.mapper;

import co.istad.elearningrestapi.domain.Instructor;
import co.istad.elearningrestapi.features.instructor.dto.InstructorCreateRequest;
import co.istad.elearningrestapi.features.instructor.dto.InstructorResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InstructorMapper {

    Instructor fromInstructorCreateRequest(InstructorCreateRequest instructorCreateRequest);

    InstructorResponse toInstructorResponse(Instructor instructor);
}
