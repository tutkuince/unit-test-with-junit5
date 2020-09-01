package com.muditasoft.unittest.junit.mid;

import com.muditasoft.unittest.courserecord.Course;
import com.muditasoft.unittest.courserecord.LecturerCourseRecord;
import com.muditasoft.unittest.courserecord.Semester;
import com.muditasoft.unittest.courserecord.Student;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class StudentTestWithRepeatedTest implements TestLifecycleReporter {

    private Student student;

    @BeforeAll
    void setUp() {
        student = new Student("id1", "Ahmet", "Yilmaz");
    }

    @DisplayName("Add Course to Student")
    @RepeatedTest(value = 5, name = "{displayName} => Add one course to student and student has {currentRepetition} courses")
    void addCourseToStudent(RepetitionInfo repetitionInfo) {

        final LecturerCourseRecord lecturerCourseRecord = new LecturerCourseRecord(
                new Course(String.valueOf(repetitionInfo.getCurrentRepetition())), new Semester());
        student.addCourse(lecturerCourseRecord);
        assertEquals(repetitionInfo.getCurrentRepetition(), student.getStudentCourseRecords().size());
    }
}
