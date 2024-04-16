package co.istad.elearningrestapi.features.student;

import co.istad.elearningrestapi.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
