package co.istad.elearningrestapi.features.student;

import co.istad.elearningrestapi.features.student.dto.StudentCreateRequest;
import co.istad.elearningrestapi.features.student.dto.StudentResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    //Create a new student
    @PostMapping
    void createNew(@Valid @RequestBody StudentCreateRequest studentCreateRequest) {
        studentService.createNew(studentCreateRequest);
    }

    //Find all students by pagination
    @GetMapping
    Page<StudentResponse> findList(
            @RequestParam(required = false, defaultValue = "0") int page,
            @RequestParam(required = false, defaultValue = "25") int size
    ){
        return studentService.findList(page, size);
    }

//[GET] /api/v1/students/{username} => Find a student’s profile
//[PUT] /api/v1/students/{username} => Update a student’s profile

}
