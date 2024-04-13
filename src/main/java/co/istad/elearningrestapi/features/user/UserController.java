package co.istad.elearningrestapi.features.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/users")
@RequiredArgsConstructor
public class UserController {

//[GET] /api/v1/users => Find all users in the platform (both students and instructors) by advanced options below:
//    Sort by id
//    Filter by username, email, nationalIdCard, phoneNumber, name, gender, and role
//[GET] /api/v1/users/{username} => Find a user details
//[PUT] /api/v1/users/{username}/disable => Disable a user
//[PUT] /api/v1/users/{username}/enable => Enable a user
//[DELETE] /api/v1/users/{username} => Permanently delete a user from platform

//    roles end-points

//[GET] /api/v1/roles => Find all roles (response with authorities)
//[GET]/api/v1/roles/{name} => Find a role by name (response with authorities)

}
