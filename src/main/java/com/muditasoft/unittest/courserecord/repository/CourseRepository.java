package com.muditasoft.unittest.courserecord.repository;

import com.muditasoft.unittest.courserecord.model.Course;
import com.muditasoft.unittest.courserecord.model.Department;

import java.util.Optional;

public interface CourseRepository {

    Optional<Course> findByExample(Course course);

    Optional<Course> findByDepartmentAndCodeAndName(Department department, String code, String name);
}
