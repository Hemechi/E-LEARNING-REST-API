package co.istad.elearningrestapi.mapper;

import co.istad.elearningrestapi.domain.Authority;
import co.istad.elearningrestapi.domain.User;
import co.istad.elearningrestapi.features.user.dto.UserDetailsResponse;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring")
public interface UserMapper {
    List<UserDetailsResponse> toUserResponse(List<User> users);
    UserDetailsResponse toUserDetailsResponse(User user);

}
