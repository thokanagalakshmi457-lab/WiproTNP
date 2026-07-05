package flowControlStatements;

public class IfStatement1b {

    public static void main(String[] args) {

        int num1 = 7;
        int num2 = 17;

        if (num1 % 10 == num2 % 10) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
