package co.istad.elearningrestapi.features.user;

import co.istad.elearningrestapi.features.user.dto.RoleResponse;

import java.util.List;

public interface RoleService {
    List<RoleResponse> findAll();
    RoleResponse findByName(String name);

}
