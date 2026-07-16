package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentService;

public class StudentMain {

    public static void main(String[] args) {

        Student[] students = new Student[4];

        students[0] = new Student("Sekhar", new int[] {85, 75, 95});
        students[1] = new Student(null, new int[] {80, 70, 90});
        students[2] = new Student("Ravi", null);
        students[3] = null;

        StudentService service = new StudentService();

        for (Student student : students) {

            try {

                if (student != null) {
                    System.out.println("Grade : " + service.findGrades(student));
                } else {
                    service.findGrades(student);
                }

            } catch (NullStudentObjectException e) {
                System.out.println("NullStudentObjectException Occurred");
            } catch (NullNameException e) {
                System.out.println("NullNameException Occurred");
            } catch (NullMarksArrayException e) {
                System.out.println("NullMarksArrayException Occurred");
            }
        }

        System.out.println();
        System.out.println("Number of Null Objects : "
                + service.findNumberOfNullObjects(students));

        System.out.println("Number of Null Names : "
                + service.findNumberOfNullNames(students));

        System.out.println("Number of Null Marks Arrays : "
                + service.findNumberOfNullMarksArray(students));
    }
}