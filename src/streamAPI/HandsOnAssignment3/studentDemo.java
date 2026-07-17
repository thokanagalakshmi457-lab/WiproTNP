package streamAPI.HandsOnAssignment3;
import java.util.ArrayList;
public class studentDemo {
	public static void main(String[] args) {
        ArrayList<student> studentList = new ArrayList<>();
        studentList.add(new student(101, "Rahul", 38));
        studentList.add(new student(102, "Sneha", 75));
        studentList.add(new student(103, "Arjun", 60));
        studentList.add(new student(104, "sita", 50));
        studentList.add(new student(105, "Ram", 98));
        long count = studentList.stream()
                .filter(s -> s.mark >= 50)
                .count();
        System.out.println("Number of Students Passed = " + count);
    }
}