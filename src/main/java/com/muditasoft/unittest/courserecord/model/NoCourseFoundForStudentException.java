package com.muditasoft.unittest.courserecord.model;

public class NoCourseFoundForStudentException extends RuntimeException {

    public NoCourseFoundForStudentException(String message) {
        super(message);
    }
}
