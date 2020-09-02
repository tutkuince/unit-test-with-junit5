package com.muditasoft.unittest.courserecord.repository;

import com.muditasoft.unittest.courserecord.model.Course;
import com.muditasoft.unittest.courserecord.model.Lecturer;
import com.muditasoft.unittest.courserecord.model.Semester;

import java.util.Optional;

public interface LecturerRepository {

    Optional<Lecturer> findByCourseAndSemester(Course course, Semester semester);
}
