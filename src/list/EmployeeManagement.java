package list;

public class EmployeeManagement {

    public static void main(String[] args) {

        EmployeeDB db = new EmployeeDB();

        Employee e1 = new Employee(101, "Lakshmi", "lakshmi@gmail.com", "Female", 50000);
        Employee e2 = new Employee(102, "Ravi", "ravi@gmail.com", "Male", 45000);
        Employee e3 = new Employee(103, "Sita", "sita@gmail.com", "Female", 55000);

        db.addEmployee(e1);
        db.addEmployee(e2);
        db.addEmployee(e3);

        System.out.println("Employee Details:");
        e1.getEmployeeDetails();

        System.out.println("\n" + db.showPaySlip(102));

        System.out.println("\nDeleting Employee 103...");
        System.out.println(db.deleteEmployee(103));

        System.out.println("\n" + db.showPaySlip(103));
    }
}