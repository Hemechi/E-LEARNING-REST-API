package co.istad.elearningrestapi.init;

import co.istad.elearningrestapi.domain.Authority;
import co.istad.elearningrestapi.domain.Role;
import co.istad.elearningrestapi.features.user.AuthorityRepository;
import co.istad.elearningrestapi.features.user.RoleRepository;
import co.istad.elearningrestapi.features.user.dto.RoleAuthorityResponse;
import co.istad.elearningrestapi.features.user.dto.RoleResponse;
import co.istad.elearningrestapi.mapper.RoleMapper;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class DataInit {

    private final RoleRepository roleRepository;
    private final AuthorityRepository authorityRepository;

    @PostConstruct
    void initData() {
        if (roleRepository.count() < 1 && authorityRepository.count() < 1) {
            Authority userAuthority = new Authority();
            userAuthority.setName("write, read, update, delete, progressRead, elearningRead");
            Authority studentAuthority = new Authority();
            studentAuthority.setName("ProgressWrite");
            Authority instructorAuthority = new Authority();
            instructorAuthority.setName("elearningWrite, elearningUpdate, elearningDelete");
            Authority adminAuthority = new Authority();
            adminAuthority.setName("progressWrite, elearningWrite, elearning Update, elearningDelete");

            authorityRepository.saveAll(List.of(userAuthority, studentAuthority, instructorAuthority, adminAuthority));

            Role userRole = new Role();
            userRole.setName("USER");
            Role studentRole = new Role();
            studentRole.setName("STUDENT");
            Role instructorRole = new Role();
            instructorRole.setName("INSTRUCTOR");
            Role adminRole = new Role();
            adminRole.setName("ADMIN");

            userRole.setAuthorities(List.of(new Authority[]{userAuthority}));
            studentRole.setAuthorities(List.of(new Authority[]{studentAuthority}));
            instructorRole.setAuthorities(List.of(new Authority[]{instructorAuthority}));
            adminRole.setAuthorities(List.of(new Authority[]{adminAuthority}));

            roleRepository.saveAll(List.of(userRole, studentRole, instructorRole, adminRole));
        }
    }


}