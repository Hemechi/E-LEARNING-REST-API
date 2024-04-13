package co.istad.elearningrestapi.features.student;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/students")
@RequiredArgsConstructor
public class StudentController {

//[POST] /api/v1/students => Create a new student
//[GET] /api/v1/students => Find all students by pagination
//[GET] /api/v1/students/{username} => Find a student’s profile
//[PUT] /api/v1/students/{username} => Update a student’s profile

}
