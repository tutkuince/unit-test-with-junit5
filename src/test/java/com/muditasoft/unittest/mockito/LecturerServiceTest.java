package com.muditasoft.unittest.mockito;

import com.muditasoft.unittest.courserecord.model.Course;
import com.muditasoft.unittest.courserecord.model.Lecturer;
import com.muditasoft.unittest.courserecord.model.Semester;
import com.muditasoft.unittest.courserecord.repository.LecturerRepository;
import com.muditasoft.unittest.courserecord.service.LecturerService;
import com.muditasoft.unittest.courserecord.service.impl.LecturerServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

public class LecturerServiceTest {

    @Test
    void find_lecturer() {
        final Course course = new Course("101");
        final Semester semester = new Semester();

        final LecturerRepository lecturerRepository = Mockito.mock(LecturerRepository.class);
        final Lecturer lecturer = new Lecturer();
        when(lecturerRepository.findByCourseAndSemester(course, semester))
                .thenReturn(Optional.of(lecturer));

        final LecturerService lecturerService = new LecturerServiceImpl(lecturerRepository);

        final Optional<Lecturer> lecturerOptional = lecturerService.findLecturer(course, semester);
        assertTrue(lecturerOptional.isPresent());

        assertEquals(lecturer, lecturerOptional.get());

        Mockito.verify(lecturerRepository,
                Mockito.times(1)).findByCourseAndSemester(course, semester);
    }
}
