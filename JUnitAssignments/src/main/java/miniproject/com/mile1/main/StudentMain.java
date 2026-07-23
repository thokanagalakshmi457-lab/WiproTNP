package miniproject.com.mile1.main;

import miniproject.com.mile1.bean.Student;
import miniproject.com.mile1.service.StudentReport;
import miniproject.com.mile1.service.StudentService;

public class StudentMain {

    public static void main(String[] args) {
        Student data[] = new Student[4];
        data[0] = new Student("Sekar", new int[] {85, 75, 96});
        data[1] = new Student(null, new int[] {11, 22, 33});
        data[2] = new Student("Manoj", null);
        data[3] = null;
        StudentReport report = new StudentReport();
        for (int i = 0; i < data.length; i++){
            try {
                String grade = report.findGrades(data[i]);
                System.out.println("Grade : " + grade);

            }
            catch (Exception e) {
                System.out.println(e);

            }
        }
        StudentService service = new StudentService();
        System.out.println("Number of Null Marks Array = "
                + service.findNumberOfNullMarksArray(data));
        System.out.println("Number of Null Names = "
                + service.findNumberOfNullNames(data));
        System.out.println("Number of Null Objects = "
                + service.findNumberOfNullObjects(data));
    }
}