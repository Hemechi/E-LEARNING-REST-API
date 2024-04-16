package co.istad.elearningrestapi.features.course;

import co.istad.elearningrestapi.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {
}
