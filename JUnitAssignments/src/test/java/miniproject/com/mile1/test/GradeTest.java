package miniproject.com.mile1.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import miniproject.com.mile1.bean.Student;
import miniproject.com.mile1.service.StudentReport;

public class GradeTest {

    StudentReport report = new StudentReport();

    @Test
    public void testGradeA() throws Exception {
        Student s = new Student("Rahul", new int[] {80, 80, 70});
        assertEquals("A", report.findGrades(s));
    }

    @Test
    public void testGradeD() throws Exception {
        Student s = new Student("Kiran", new int[] {50, 45, 50});
        assertEquals("D", report.findGrades(s));
    }

    @Test
    public void testGradeF() throws Exception {
        Student s = new Student("Ram", new int[] {80, 20, 90});
        assertEquals("F", report.findGrades(s));
    }
}