package miniproject.com.mile1.service;
import miniproject.com.mile1.bean.Student;
import miniproject.com.mile1.exception.NullMarksArrayException;
import miniproject.com.mile1.exception.NullNameException;
import miniproject.com.mile1.exception.NullStudentObjectException;

public class StudentReport {

    public void validate(Student s)
            throws NullStudentObjectException,
                   NullNameException,
                   NullMarksArrayException {

        if (s == null)
            throw new NullStudentObjectException();

        if (s.getName() == null)
            throw new NullNameException();

        if (s.getMarks() == null)
            throw new NullMarksArrayException();
    }


    public String findGrades(Student studentObject)
            throws NullStudentObjectException,
                   NullNameException,
                   NullMarksArrayException {

        validate(studentObject);
        int[] marks = studentObject.getMarks();
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 35) {
                return "F";
            }
        }

        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        if (sum < 150) {
            return "C";
        } 
        else if (sum < 200) {
            return "B";
        } 
        else if (sum < 250) {
            return "A";
        } 
        else {
            return "A+";
        }
    }
}