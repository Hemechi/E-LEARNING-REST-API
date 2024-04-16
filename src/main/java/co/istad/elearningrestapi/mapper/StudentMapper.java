package co.istad.elearningrestapi.mapper;

import co.istad.elearningrestapi.domain.Student;
import co.istad.elearningrestapi.features.student.dto.StudentCreateRequest;
import co.istad.elearningrestapi.features.student.dto.StudentResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    Student fromStudentCreateRequest(StudentCreateRequest studentCreateRequest);

    StudentResponse toStudentResponse(Student student);
}
