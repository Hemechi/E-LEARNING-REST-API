package co.istad.elearningrestapi.features.course;

import co.istad.elearningrestapi.features.course.dto.CourseCreateRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService{
    @Override
    public void createNew(CourseCreateRequest courseCreateRequest) {

    }
}
