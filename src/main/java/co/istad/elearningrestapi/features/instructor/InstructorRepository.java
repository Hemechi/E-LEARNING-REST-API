package co.istad.elearningrestapi.features.instructor;

import co.istad.elearningrestapi.domain.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor,Long> {
}
