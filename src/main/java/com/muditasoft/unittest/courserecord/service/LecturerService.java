package com.muditasoft.unittest.courserecord.service;

import com.muditasoft.unittest.courserecord.model.Course;
import com.muditasoft.unittest.courserecord.model.Lecturer;
import com.muditasoft.unittest.courserecord.model.Semester;

import java.util.Optional;

public interface LecturerService {

    Optional<Lecturer> findLecturer(Course course, Semester semester);
}
