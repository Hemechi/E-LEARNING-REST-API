package co.istad.elearningrestapi.features.instructor;

import co.istad.elearningrestapi.domain.Instructor;
import co.istad.elearningrestapi.features.instructor.dto.InstructorCreateRequest;
import co.istad.elearningrestapi.features.instructor.dto.InstructorResponse;
import co.istad.elearningrestapi.mapper.InstructorMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@Slf4j
@RequiredArgsConstructor
public class InstructorServiceImpl implements InstructorService{

    private final InstructorRepository instructorRepository;
    private final InstructorMapper instructorMapper;

    @Override
    public void createNew(InstructorCreateRequest instructorCreateRequest) {
        Instructor instructor = instructorMapper.fromInstructorCreateRequest(instructorCreateRequest);
        instructor.setBlocked(false);

        instructorRepository.save(instructor);
    }

    @Override
    public Page<InstructorResponse> findList(int page, int size) {
        //validate page and size
        if (page < 0) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    "Page number must be greater than or equal to zero"
            );
        }
        if (size < 1) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    "Page size must be greater than or equal to one"
            );
        }
        Pageable pageable = PageRequest.of(page, size);
        Page<Instructor> instructors = instructorRepository.findAll(pageable);

        return instructors.map(instructorMapper::toInstructorResponse);
    }
}
