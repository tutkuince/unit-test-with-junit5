package com.muditasoft.unittest.courserecord;

public class LecturerCourseRecord {

    private final Course course;
    private final Semester semester;
    private int credit;
    private Lecturer lecturer;

    public LecturerCourseRecord(Course course, Semester semester) {
        this.course = course;
        this.semester = semester;
    }
}
