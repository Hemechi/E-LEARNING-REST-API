package co.istad.elearningrestapi.features.user;

import co.istad.elearningrestapi.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorityRepository extends JpaRepository<Authority, Long> {

}
