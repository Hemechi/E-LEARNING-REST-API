package co.istad.elearningrestapi.features.course;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/courses")
@RequiredArgsConstructor
public class CourseController {

//[POST] /api/v1/courses => Create a new course
//[GET] /api/v1/courses => Find all courses by pagination
//[GET] /api/v1/courses/{alias} => Find a course details
//[PUT] /api/v1/courses/{alias} => Update a course
//[PUT] /api/v1/courses/{alias}/thumbnail => Update a course’s thumbnail
//[PUT] /api/v1/courses/{alias}/categories => Update a course’s categories
//[PUT] /api/v1/courses/{alias}/disable => Disable a course

}
