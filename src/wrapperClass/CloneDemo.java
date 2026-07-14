package wrapperClass;

public class CloneDemo {

    public static void main(String[] args) {

        try {
            Employee original = new Employee(101, "Mani", 50000);

            Employee clone = (Employee) original.clone();

            // Change original object
            original.setEmpName("Lakshmi");
            original.setSalary(60000);

            System.out.println("Original Employee:");
            original.display();

            System.out.println();

            System.out.println("Cloned Employee:");
            clone.display();

        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported.");
        }
    }
}