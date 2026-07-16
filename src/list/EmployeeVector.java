package list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EmployeeVector {

    public static void main(String[] args) {

        Vector<Employee> employees = new Vector<>();

        employees.add(new Employee(101, "Lakshmi", "lakshmi@gmail.com", "Female", 50000));
        employees.add(new Employee(102, "Ravi", "ravi@gmail.com", "Male", 45000));
        employees.add(new Employee(103, "Sita", "sita@gmail.com", "Female", 55000));

        System.out.println("Using Iterator");

        Iterator<Employee> iterator = employees.iterator();

        while (iterator.hasNext()) {
            iterator.next().getEmployeeDetails();
            System.out.println();
        }

        System.out.println("Using Enumeration");

        Enumeration<Employee> enumeration = employees.elements();

        while (enumeration.hasMoreElements()) {
            enumeration.nextElement().getEmployeeDetails();
            System.out.println();
        }
    }
}