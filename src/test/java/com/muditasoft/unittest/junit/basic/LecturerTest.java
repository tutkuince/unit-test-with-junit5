package com.muditasoft.unittest.junit.basic;

import com.muditasoft.unittest.courserecord.model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LecturerTest {

    private Lecturer lecturer;

    @BeforeEach
    void setUp() {
        lecturer = new Lecturer();
    }

    private LecturerCourseRecord lecturerCourseRecord() {
        return new LecturerCourseRecord(new Course(), new Semester());
    }

    @Test
    @DisplayName("When a lecturer course record is added to lecturer then lecturer course record size increase")
    void when_a_course_is_added_to_lecturer_then_lecturer_course_size_increase() {
        assertEquals(0, lecturer.getLecturerCourseRecords().size());
        lecturer.addLecturerCourseRecord(lecturerCourseRecord());
        assertEquals(1, lecturer.getLecturerCourseRecords().size());
    }

    @Test
    @DisplayName("lecturer course record has lecturer info when added to lecturer")
    void lecturer_course_record_has_lecturer_info_when_added_to_lecturer() {
        final LecturerCourseRecord lecturerCourseRecord = lecturerCourseRecord();
        lecturer.addLecturerCourseRecord(lecturerCourseRecord);
        assertEquals(lecturer, lecturerCourseRecord.getLecturer());
    }

    @Test
    void throws_illegal_argument_exception_when_a_null_course_is_added_to_lecturer() {
        final LecturerCourseRecord lecturerCourseRecord = new LecturerCourseRecord(null, new Semester());
        final IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> lecturer.addLecturerCourseRecord(lecturerCourseRecord));
        assertEquals("Can't add a null course to lecturer", illegalArgumentException.getMessage());
    }

    @Test
    void throws_not_active_semester_exception_when_a_course_is_added_for_not_active_semester_to_lecturer() {
        final Semester activeSemester = new Semester();
        final LocalDate lastYear = LocalDate.of(activeSemester.getYear() - 1, 1, 1);
        final Semester notActiveSemester = new Semester(lastYear);

        final LecturerCourseRecord lecturerCourseRecord = new LecturerCourseRecord(new Course(), notActiveSemester);
        final NotActiveSemesterException notActiveSemesterException = assertThrows(NotActiveSemesterException.class, () -> lecturer.addLecturerCourseRecord(lecturerCourseRecord));
        assertEquals(notActiveSemester.toString(), notActiveSemesterException.getMessage());
    }
}
