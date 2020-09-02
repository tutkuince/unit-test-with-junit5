package com.muditasoft.unittest.courserecord.service;

import com.muditasoft.unittest.courserecord.model.Course;
import com.muditasoft.unittest.courserecord.model.Department;

import java.util.Optional;

public interface CourseService {
    Optional<Course> findCourse(Course course);

    Optional<Course> findCourse(Department department, String code, String name);
}
