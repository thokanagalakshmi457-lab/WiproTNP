package streamAPI.HandsOnAssignment2;
import java.util.ArrayList;
import java.util.stream.Collectors;
public class EmployeeDemo {
	 public static void main(String[] args) {
	        ArrayList<Employee> empList = new ArrayList<>();
	        empList.add(new Employee(101, "Rahul", 25, "Pune"));
	        empList.add(new Employee(102, "Sneha", 23, "Hyderabad"));
	        empList.add(new Employee(103, "Arjun", 27, "Pune"));
	        empList.add(new Employee(104, "Priya", 24, "Chennai"));
	        empList.add(new Employee(105, "Ram",   26, "Pune"));
	        ArrayList<Employee> puneEmployees = empList.stream()
	                .filter(e -> e.location.equalsIgnoreCase("Pune"))
	                .collect(Collectors.toCollection(ArrayList::new));
	        System.out.println("Employees from Pune:");
	        puneEmployees.forEach(System.out::println);
	    }
}