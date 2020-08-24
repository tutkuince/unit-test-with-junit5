package com.muditasoft.unittest.courserecord;

import java.util.HashSet;
import java.util.Set;

public class Student {
    private final String id;
    private final String name;
    private final String surname;
    private Set<StudentCourseRecord> studentCourseRecords = new HashSet<>();

    public Student(String id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }
}
