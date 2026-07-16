package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentService {

    StudentReport report = new StudentReport();

    public String findGrades(Student student)
            throws NullStudentObjectException,
                   NullNameException,
                   NullMarksArrayException {

        return report.validate(student);
    }

    public int findNumberOfNullMarksArray(Student[] students) {

        int count = 0;

        for (Student student : students) {
            if (student != null && student.getMarks() == null) {
                count++;
            }
        }

        return count;
    }

    public int findNumberOfNullNames(Student[] students) {

        int count = 0;

        for (Student student : students) {
            if (student != null &&
                (student.getName() == null || student.getName().trim().isEmpty())) {
                count++;
            }
        }

        return count;
    }

    public int findNumberOfNullObjects(Student[] students) {

        int count = 0;

        for (Student student : students) {
            if (student == null) {
                count++;
            }
        }

        return count;
    }
}