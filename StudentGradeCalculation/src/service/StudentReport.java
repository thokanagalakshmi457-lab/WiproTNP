package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentReport {

    public String validate(Student student)
            throws NullStudentObjectException,
                   NullNameException,
                   NullMarksArrayException {

        if (student == null) {
            throw new NullStudentObjectException("Student object is null");
        }

        if (student.getName() == null || student.getName().trim().isEmpty()) {
            throw new NullNameException("Student name is null");
        }

        if (student.getMarks() == null) {
            throw new NullMarksArrayException("Marks array is null");
        }

        int[] marks = student.getMarks();
        boolean fail = false;

        for (int mark : marks) {
            if (mark < 35) {
                fail = true;
                break;
            }
        }

        if (fail) {
            student.setGrade("F");
            return "FAIL";
        } else {
            student.setGrade("PASS");
            return "PASS";
        }
    }
}