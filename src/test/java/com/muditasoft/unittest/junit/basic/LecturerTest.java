package com.muditasoft.unittest.junit.basic;

import com.muditasoft.unittest.courserecord.Course;
import com.muditasoft.unittest.courserecord.Lecturer;
import com.muditasoft.unittest.courserecord.LecturerCourseRecord;
import com.muditasoft.unittest.courserecord.Semester;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LecturerTest {

    @Test
    @DisplayName("When a lecturer course record is added to lecturer then lecturer course record size increase")
    void when_a_course_is_added_to_lecturer_then_lecturer_course_size_increase() {
        Lecturer lecturer = new Lecturer();
        LecturerCourseRecord lecturerCourseRecord = new LecturerCourseRecord(new Course(), new Semester());
        assertEquals(0, lecturer.getLecturerCourseRecords().size());
        lecturer.addLecturerCourseRecord(lecturerCourseRecord);
        assertEquals(1, lecturer.getLecturerCourseRecords().size());
    }




}
