package miniproject1;

public class Project {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Please enter Employee Id");
            return;
        }

        Employee[] list = new Employee[7];

        list[0] = new Employee(1001, "Ashish", "01/04/2009", 'e', "R&D", 20000, 8000, 3000);
        list[1] = new Employee(1002, "Sushma", "23/08/2012", 'c', "PM", 30000, 12000, 9000);
        list[2] = new Employee(1003, "Rahul", "12/11/2008", 'k', "Acct", 10000, 8000, 1000);
        list[3] = new Employee(1004, "Chahat", "29/01/2013", 'r', "Front Desk", 12000, 6000, 2000);
        list[4] = new Employee(1005, "Ranjan", "16/07/2005", 'm', "Engg", 50000, 20000, 20000);
        list[5] = new Employee(1006, "Suman", "01/01/2000", 'e', "Manufacturing", 23000, 9000, 4400);
        list[6] = new Employee(1007, "Tanmay", "12/06/2006", 'c', "PM", 29000, 12000, 10000);

        int empId = Integer.parseInt(args[0]);

        int index = -1;

        for (int i = 0; i < list.length; i++) {
            if (list[i].id == empId) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("There is no employee with empid : " + empId);
            return;
        }

        Employee emp = list[index];

        String designation = "";
        int da = 0;

        switch (emp.code) {

            case 'e':
                designation = "Engineer";
                da = 20000;
                break;

            case 'c':
                designation = "Consultant";
                da = 32000;
                break;

            case 'k':
                designation = "Clerk";
                da = 12000;
                break;

            case 'r':
                designation = "Receptionist";
                da = 15000;
                break;

            case 'm':
                designation = "Manager";
                da = 40000;
                break;

            default:
                designation = "Unknown";
                da = 0;
        }

        int salary = emp.basic + emp.hra + da - emp.it;

        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-8s %-12s %-18s %-15s %-8s\n",
                "Emp No", "Emp Name", "Department", "Designation", "Salary");
        System.out.println("---------------------------------------------------------------");

        System.out.printf("%-8d %-12s %-18s %-15s %-8d\n",
                emp.id,
                emp.name,
                emp.dept,
                designation,
                salary);

        System.out.println("---------------------------------------------------------------");
    }
}