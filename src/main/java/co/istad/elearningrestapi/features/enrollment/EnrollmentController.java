package co.istad.elearningrestapi.features.enrollment;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/enrollments")
@RequiredArgsConstructor
public class EnrollmentController {

//[POST] /api/v1/enrollments => Create a new enrollment
//[GET] /api/v1/enrollments => Find all enrollments by pagination, sort, and filter below:
//    Sort by enrolledAt
//    Filter by code, course’s title, course’s category, student’s username, isCertified
//[GET] /api/v1/enrollments/{code} => Find an enrollment details
//[PUT] /api/v1/enrollments/{code}/progress => Update an enrollment progress
//[GET] /api/v1/enrollments/{code}/progress => Get the progress of enrolled learning
//[PUT]/api/v1/enrollments/{code}/is-certified => Certify an enrollment when progress 100
//[PUT] /api/v1/enrollments/{code} => Disable an enrollment

//    city and countries end-points

//[GET] /api/v1/cities => Find all cities (sort by name or filter by name)
//[GET] /api/v1/countries => Find all countries (sort by name or filter by name)
//[GET] /api/v1/countries/{iso}/cities => Find all cities in a country


}
