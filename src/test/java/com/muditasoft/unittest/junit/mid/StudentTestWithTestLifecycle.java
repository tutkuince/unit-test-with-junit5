package com.muditasoft.unittest.junit.mid;

import com.muditasoft.unittest.courserecord.model.Student;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class StudentTestWithTestLifecycle {

    private Student jack = new Student("1", "Jack", "Ince");

    @BeforeAll
    static void beforeAll() {

    }

    @Test
    void state_cannot_change_when_lifecycle_is_per_method() {
        assertEquals("Jack", jack.getName());
        jack = new Student("2", "Alex", "De Souza");
    }

    @Test
    void state_can_change_when_lifecycle_is_per_class() {
        assertEquals("Jack", jack.getName());
        jack = new Student("2", "Alex", "De Souza");
    }
}
