package Miniproject3;
import java.io.*;
import java.util.Scanner;
public class EmployeeMain {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Main Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");
            int choice = sc.nextInt();
            switch (choice){
            case 1:
                System.out.print("Enter Employee ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Employee Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Employee Age: ");
                int age = sc.nextInt();
                System.out.print("Enter Employee Salary: ");
                double salary = sc.nextDouble();
                Employee emp = new Employee(id, name, age, salary);
                try{
                    File file = new File("employee.dat");
                    if (file.exists()){
                        AppendObjectOutputStream out =new AppendObjectOutputStream(new FileOutputStream(file, true));
                        out.writeObject(emp);
                        out.close();
                    } else{
                        ObjectOutputStream out =new ObjectOutputStream(new FileOutputStream(file));
                        out.writeObject(emp);
                        out.close();
                    }
                } catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case 2:
                System.out.println("----Report-----");
                try {
                    ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.dat"));
                    while (true){
                        Employee e = (Employee) in.readObject();
                        System.out.println(e.getId() + " "
                                + e.getName() + " "
                                + e.getAge() + " "
                                + e.getSalary());
                    }
                } catch (EOFException e){
                    System.out.println("----End of Report-----");
                } catch (FileNotFoundException e) {
                    System.out.println("No Employee Records");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case 3:
                System.out.println("Exiting the System");
                sc.close();
                System.exit(0);
            default:
                System.out.println("Invalid Choice");
            }
        }
    }
}