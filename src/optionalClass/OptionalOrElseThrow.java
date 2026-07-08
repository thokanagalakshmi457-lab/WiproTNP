package optionalClass;

import java.util.Optional;

class Employee {

    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class InvalidEmployeeException extends Exception {

    private static final long serialVersionUID = 1L;

    public InvalidEmployeeException(String message) {
        super(message);
    }
}

public class OptionalOrElseThrow {

    public static void main(String[] args) {

        Employee emp = null;

        try {

            Employee employee = Optional.ofNullable(emp)
                    .orElseThrow(() -> new InvalidEmployeeException("Invalid Employee"));

            System.out.println(employee.name);

        } catch (InvalidEmployeeException e) {

            System.out.println(e.getMessage());
        }
    }
}