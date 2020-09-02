package com.muditasoft.unittest.courserecord.service;

import com.muditasoft.unittest.courserecord.model.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface StudentService {
    void addCourse(String studentId, Course course);

    void addCourse(String studentId, Course course, Semester semester);

    void dropCourse(String studentId, Course course);

    void addGrade(String studentId, Course course, StudentCourseRecord.Grade grade);

    boolean isTakeCourse(String studentId, Course course);

    BigDecimal gpa(String studentId);

    List<TranscriptItem> transcript(String studentId);

    Optional<Student> findStudent(String studentId);

    void deleteStudent(String studentId);
}
