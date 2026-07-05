package miniproject1;

public class Employee {

    int id;
    String name;
    String doj;
    char code;
    String dept;
    int basic;
    int hra;
    int it;

    public Employee(int id, String name, String doj, char code,
                    String dept, int basic, int hra, int it) {

        this.id = id;
        this.name = name;
        this.doj = doj;
        this.code = code;
        this.dept = dept;
        this.basic = basic;
        this.hra = hra;
        this.it = it;
    }
}