package co.istad.elearningrestapi.features.student;

import co.istad.elearningrestapi.features.student.dto.StudentCreateRequest;
import co.istad.elearningrestapi.features.student.dto.StudentResponse;
import org.springframework.data.domain.Page;

public interface StudentService {
    void createNew(StudentCreateRequest studentCreateRequest);
    Page<StudentResponse> findList(int page, int size);
}
