package exceptionHandling;

public class MathOperation {

    public static void main(String[] args) throws NumberFormatException, ArithmeticException {

        if (args.length != 5) {
            System.out.println("Please enter exactly 5 integers.");
            return;
        }

        int[] arr = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(args[i]);
            sum += arr[i];
        }

        double average = (double) sum / arr.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}