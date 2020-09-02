package com.muditasoft.unittest.courserecord.model;

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

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Set<StudentCourseRecord> getStudentCourseRecords() {
        return studentCourseRecords;
    }

    public void setStudentCourseRecords(Set<StudentCourseRecord> studentCourseRecords) {
        this.studentCourseRecords = studentCourseRecords;
    }

    public void addCourse(LecturerCourseRecord lecturerCourseRecord) {

        if (lecturerCourseRecord == null) {
            throw new IllegalArgumentException("Can't add course with null lecturer course record");
        }

        final StudentCourseRecord studentCourseRecord = new StudentCourseRecord(lecturerCourseRecord);
        studentCourseRecords.add(studentCourseRecord);
    }
}
