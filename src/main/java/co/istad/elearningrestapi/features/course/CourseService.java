package co.istad.elearningrestapi.features.course;

import co.istad.elearningrestapi.features.course.dto.CourseCreateRequest;

public interface CourseService {
    void createNew(CourseCreateRequest courseCreateRequest);
}
