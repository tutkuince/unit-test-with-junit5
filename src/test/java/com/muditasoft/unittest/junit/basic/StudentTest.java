package com.muditasoft.unittest.junit.basic;

import com.muditasoft.unittest.courserecord.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {


    @Test
    @DisplayName("Test every student must have an id, name and surname")
    void should_create_student_wth_id_name_and_surname() {
        Student student = new Student("1", "Tutku", "Ince");

        assertEquals("Tutku", student.getName());
        assertEquals("Ince", student.getSurname(), "Student's surname");
        assertNotEquals("Emin", student.getName(), "Student's name");

        assertTrue(student.getName().startsWith("T"));
        assertTrue(student.getName().startsWith("T"), () -> "Student's name " + "starts with T");

        assertFalse(() -> {
            Student std = new Student("id1", "Emin", "Koklu");
            return std.getName().endsWith("e");
        }, () -> "Student's name " + "ends with e");

        Student studentTutku = new Student("id1", "Unknown", "Person");
        assertNotSame(student, studentTutku);

        studentTutku = student;
        assertSame(student, studentTutku);


    }
}
