package co.istad.elearningrestapi.features.instructor;

import co.istad.elearningrestapi.features.instructor.dto.InstructorCreateRequest;
import co.istad.elearningrestapi.features.instructor.dto.InstructorResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/instructors")
@RequiredArgsConstructor
public class InstructorController {

    private final InstructorService instructorService;

    //Create a new instructor
    @PostMapping
    void createNew(@Valid @RequestBody InstructorCreateRequest instructorCreateRequest) {
        instructorService.createNew(instructorCreateRequest);
    }

    //Find all instructors by pagination
    @GetMapping
    Page<InstructorResponse> findList(
            @RequestParam(required = false, defaultValue = "0") int page,
            @RequestParam(required = false, defaultValue = "25") int size
    ){
        return instructorService.findList(page, size);
    }

//[GET] /api/v1/instructors/{username} => Find an instructor’s profile
//[PUT] /api/v1/instructors/{username} => Update an instructor’s profile

}
