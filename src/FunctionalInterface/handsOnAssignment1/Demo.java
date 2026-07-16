package FunctionalInterface.handsOnAssignment1;
import java.util.ArrayList;
import java.util.function.Function;
public class Demo {
    public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee(101, "Rahul", "Pune", 50000));
        empList.add(new Employee(102, "Sneha", "Hyderabad", 55000));
        empList.add(new Employee(103, "Arjun", "Chennai", 60000));
        empList.add(new Employee(104, "Sita", "Bangalore", 65000));
        empList.add(new Employee(105, "Ram", "Mumbai", 70000));
        Function<Employee, String> f = e -> e.location;
        ArrayList<String> locations = new ArrayList<>();
        for (Employee e : empList) {
            locations.add(f.apply(e));
        }
        System.out.println("Employee Locations:");
        locations.forEach(System.out::println);
    }
}