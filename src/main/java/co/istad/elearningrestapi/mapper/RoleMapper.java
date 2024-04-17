package co.istad.elearningrestapi.mapper;


import co.istad.elearningrestapi.domain.Role;
import co.istad.elearningrestapi.features.user.dto.RoleResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    List<RoleResponse> toRoleAuthorityResponses(List<Role> role);
    RoleResponse toRoleAuthorityResponse(Role role);
}