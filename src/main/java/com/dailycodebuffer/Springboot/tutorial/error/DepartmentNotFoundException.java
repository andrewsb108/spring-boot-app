package com.dailycodebuffer.Springboot.tutorial.error;

public class DepartmentNotFoundException extends RuntimeException {
    public DepartmentNotFoundException() {
        super();
    }

    public DepartmentNotFoundException(String message) {
        super(message);
    }
}
