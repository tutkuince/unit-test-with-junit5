package com.muditasoft.unittest.courserecord.service.impl;

import com.muditasoft.unittest.courserecord.model.Course;
import com.muditasoft.unittest.courserecord.model.Lecturer;
import com.muditasoft.unittest.courserecord.model.Semester;
import com.muditasoft.unittest.courserecord.repository.LecturerRepository;
import com.muditasoft.unittest.courserecord.service.LecturerService;

import java.util.Optional;

public class LecturerServiceImpl implements LecturerService {

    private final LecturerRepository lecturerRepository;

    public LecturerServiceImpl(LecturerRepository lecturerRepository) {
        this.lecturerRepository = lecturerRepository;
    }

    @Override
    public Optional<Lecturer> findLecturer(Course course, Semester semester) {
        if (course == null || semester == null) {
            throw new IllegalArgumentException("Can't find lecturer without course and semester");
        }
        return lecturerRepository.findByCourseAndSemester(course, semester);
    }
}
