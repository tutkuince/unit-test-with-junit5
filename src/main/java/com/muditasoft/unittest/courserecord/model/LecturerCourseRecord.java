package com.muditasoft.unittest.courserecord.model;

public class LecturerCourseRecord {

    private final Course course;
    private final Semester semester;
    private int credit;
    private Lecturer lecturer;

    public LecturerCourseRecord(Course course, Semester semester) {
        this.course = course;
        this.semester = semester;
    }

    public Course getCourse() {
        return course;
    }

    public Semester getSemester() {
        return semester;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
}
