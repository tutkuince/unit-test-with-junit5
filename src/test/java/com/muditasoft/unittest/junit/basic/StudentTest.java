package com.muditasoft.unittest.junit.basic;

import com.muditasoft.unittest.courserecord.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

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

    @Test
    @DisplayName("Test every student must have an id, name and surname with grouped assertions")
    void shouldCreateStudentWithIdNameAndSurnameWithGroupedAssertions() {

        /**
         * grouped assertions
         * failed grouped assertions
         * dependent assertions
         */

        // In a grouped assertion all assertions are executed,
        Student student = new Student("1", "Tutku", "Ince");

        assertAll("Student's name check",
                () -> assertEquals("Tutku", student.getName()),
                () -> assertEquals("Tutku", student.getName(), "Student's name"),
                () -> assertNotEquals("Utku", student.getName(), "Student's name")
        );

        // and any failures will be reported together.
        assertAll("Student's name character check",
                () -> assertTrue(student.getName().startsWith("T")),
                () -> assertTrue(student.getName().startsWith("T"), () -> "Student's name " + "starts with Mu"),
                () -> assertFalse(() -> {
                    Student mehmet = new Student("id1", "Mehmet", "Can");
                    return mehmet.getName().endsWith("M");
                }, () -> "Student's name " + "ends with M")
        );

        //dependent assertions
        assertAll(() -> {
                    final Student ahmet = new Student("2", "Ahmet", "Yilmaz");

                    assertArrayEquals(new String[]{"Tutku", "Ahmet"}, Stream.of(student, ahmet).map(Student::getName).toArray());
                },
                () -> {
                    Student std = student;
                    final Student ahmet = new Student("2", "Ahmet", "Yilmaz");

                    assertSame(std, std); // Tutku == student
                    assertNotSame(std, ahmet);
                });
    }

}
