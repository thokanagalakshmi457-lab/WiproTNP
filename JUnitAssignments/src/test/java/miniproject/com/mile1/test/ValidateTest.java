package miniproject.com.mile1.test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import miniproject.com.mile1.bean.Student;
import miniproject.com.mile1.exception.NullMarksArrayException;
import miniproject.com.mile1.exception.NullNameException;
import miniproject.com.mile1.exception.NullStudentObjectException;
import miniproject.com.mile1.service.StudentReport;

public class ValidateTest {

    StudentReport report = new StudentReport();

    @Test
    public void testNullStudentObject() {

        assertThrows(NullStudentObjectException.class, () -> {
            report.validate(null);
        });
    }

    @Test
    public void testNullName() {

        Student s = new Student(null, new int[] {80, 90, 95});

        assertThrows(NullNameException.class, () -> {
            report.validate(s);
        });
    }

    @Test
    public void testNullMarksArray() {

        Student s = new Student("Ram", null);

        assertThrows(NullMarksArrayException.class, () -> {
            report.validate(s);
        });
    }
}