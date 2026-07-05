package flowControlStatements;



public class SumOfDigits14f {

    public static void main(String[] args) {

        int num = Integer.parseInt(args[0]);
        int sum = 0;

        for (; num > 0; num = num / 10) {

            sum = sum + (num % 10);

        }

        System.out.println("Sum of digits = " + sum);
    }
}