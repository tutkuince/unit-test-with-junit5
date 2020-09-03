package com.muditasoft.unittest.mockito;

import com.muditasoft.unittest.courserecord.model.*;
import com.muditasoft.unittest.courserecord.repository.StudentRepository;
import com.muditasoft.unittest.courserecord.service.CourseService;
import com.muditasoft.unittest.courserecord.service.LecturerService;
import com.muditasoft.unittest.courserecord.service.impl.StudentServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StudentServiceImplTest {

    @Test
    void add_course() {
        final Student student = new Student("id1", "Tutku", "Ince");
        final Course course = new Course("101");
        final Semester semester = new Semester();

        final Lecturer lecturer = mock(Lecturer.class);
        final CourseService courseService = mock(CourseService.class);
        final LecturerService lecturerService = mock(LecturerService.class);
        final StudentRepository studentRepository = mock(StudentRepository.class);

        // anyString() -> hangi string olursa olsun bunu don
        // thenTrow() -> ikinci kez cagirildiginda
        when(studentRepository.findById(anyString()))
                .thenReturn(Optional.of(student))
                .thenThrow(new IllegalArgumentException("Can't find a student"));

        // any() -> ne ile cagirilirsa cagirilsin bu course u don.
        when(courseService.findCourse(any()))
                .thenReturn(Optional.of(course));
        when(lecturerService.findLecturer(course, semester))
                .thenReturn(Optional.of(lecturer));
        when(lecturer.lecturerCourseRecord(course, semester))
                .thenReturn(new LecturerCourseRecord(course, semester));

        final StudentServiceImpl studentService = new StudentServiceImpl(courseService,
                lecturerService,
                studentRepository);

        studentService.addCourse("id1", course, semester);

        assertThrows(IllegalArgumentException.class, () -> studentService.findStudent("id1"));

    }
}
