package FunctionalInterface.HandsOnAssignment4;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo {
	public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee(101, "Ravi", 8000));
        empList.add(new Employee(102, "Sneha", 12000));
        empList.add(new Employee(103, "Arjun", 9500));
        empList.add(new Employee(104, "Sita", 15000));
        empList.add(new Employee(105, "Ram", 7000));
        Predicate<Employee> p = e -> e.getSalary() < 10000;
        System.out.println("Employees with Salary Less Than 10000:");
        for (Employee e : empList){
            if (p.test(e)) {
                System.out.println(e.getName());
            }
        }
    }
}