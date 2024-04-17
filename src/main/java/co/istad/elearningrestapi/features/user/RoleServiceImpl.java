package co.istad.elearningrestapi.features.user;

import co.istad.elearningrestapi.domain.Role;
import co.istad.elearningrestapi.features.user.dto.RoleResponse;
import co.istad.elearningrestapi.mapper.RoleMapper;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
//use log
@Slf4j
public class RoleServiceImpl implements RoleService{

    private final RoleRepository roleRepository;
    private final RoleMapper roleMapper;

    @Override
    public List<RoleResponse> findAll() {

        List<Role> role = roleRepository.findAll();
        return roleMapper.toRoleAuthorityResponses(role);
    }
    @Override
    public RoleResponse findByName(String name) {

        Role role = roleRepository.findByName(name);
        return roleMapper.toRoleAuthorityResponse(role);

    }

}
