package com.muditasoft.unittest.courserecord;

import java.util.HashSet;
import java.util.Set;

public class Lecturer {
    private String id;
    private String name;
    private String surname;
    private String title;
    private Set<LecturerCourseRecord> lecturerCourseRecords = new HashSet<>();
    private Department department;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<LecturerCourseRecord> getLecturerCourseRecords() {
        return lecturerCourseRecords;
    }

    public void setLecturerCourseRecords(Set<LecturerCourseRecord> lecturerCourseRecords) {
        this.lecturerCourseRecords = lecturerCourseRecords;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void addLecturerCourseRecord(LecturerCourseRecord lecturerCourseRecord) {
        this.lecturerCourseRecords.add(lecturerCourseRecord);
    }


}
