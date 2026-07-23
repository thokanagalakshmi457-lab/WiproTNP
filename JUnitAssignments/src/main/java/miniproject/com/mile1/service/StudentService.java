package miniproject.com.mile1.service;

import miniproject.com.mile1.bean.Student;
import miniproject.com.mile1.exception.NullMarksArrayException;
import miniproject.com.mile1.exception.NullNameException;
import miniproject.com.mile1.exception.NullStudentObjectException;

public class StudentService {

    StudentReport report = new StudentReport();
    public int findNumberOfNullMarksArray(Student[] students) {

        int count = 0;

        for (int i = 0; i < students.length; i++){

            try {
                report.validate(students[i]);
            }
            catch (NullMarksArrayException e){
                count++;
            }
            catch (NullNameException e){

            }
            catch (NullStudentObjectException e){

            }
        }

        return count;
    }
    public int findNumberOfNullNames(Student[] students){

        int count = 0;

        for (int i = 0; i < students.length; i++){

            try {
                report.validate(students[i]);
            }
            catch (NullNameException e){
                count++;
            }
            catch (NullMarksArrayException e){

            }
            catch (NullStudentObjectException e){

            }
        }
        return count;
    }
    public int findNumberOfNullObjects(Student[] students){

        int count = 0;

        for (int i = 0; i < students.length; i++){

            try {
                report.validate(students[i]);
            }
            catch (NullStudentObjectException e){
                count++;
            }
            catch (NullMarksArrayException e){

            }
            catch (NullNameException e){

            }
        }

        return count;
    }
}