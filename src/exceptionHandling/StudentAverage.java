package exceptionHandling;

import java.util.Scanner;

public class StudentAverage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            for (int i = 1; i <= 2; i++) {

                System.out.println("Enter Student " + i + " Name:");
                String name = sc.nextLine();

                int total = 0;

                System.out.println("Enter marks in 3 subjects:");

                for (int j = 1; j <= 3; j++) {

                    int mark = Integer.parseInt(sc.nextLine());

                    if (mark < 0) {
                        throw new NegativeValuesException("Negative values are not allowed");
                    }

                    if (mark > 100) {
                        throw new OutOfRangeException("Marks should be between 0 and 100");
                    }

                    total += mark;
                }

                double average = total / 3.0;

                System.out.println("Average marks of " + name + " = " + average);
            }

        } catch (NumberFormatException e) {

            System.out.println("NumberFormatException");

        } catch (NegativeValuesException e) {

            System.out.println(e.getMessage());

        } catch (OutOfRangeException e) {

            System.out.println(e.getMessage());
        }

        sc.close();
    }
}