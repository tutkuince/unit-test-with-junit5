package com.muditasoft.unittest.courserecord.model;

import java.util.Set;

public class Department {

    private String code;
    private String name;
    private Set<Lecturer> lecturers;
    private Set<Course> courses;
    private Set<Student> students;
    private Faculty faculty;
}
