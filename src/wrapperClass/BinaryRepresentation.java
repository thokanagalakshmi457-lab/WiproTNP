package wrapperClass;

import java.util.Scanner;

public class BinaryRepresentation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1-255): ");
        int number = sc.nextInt();

        if (number < 1 || number > 255) {
            System.out.println("Invalid input. Enter a number between 1 and 255.");
        } else {
            String binary = Integer.toBinaryString(number);
            String result = String.format("%8s", binary).replace(' ', '0');

            System.out.println(result);
        }

        sc.close();
    }
}