package string;

import java.util.Scanner;

public class StringCopies {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = "";

        String firstTwo = str.substring(0, 2);

        for (int i = 0; i < str.length(); i++) {
            result = result + firstTwo;
        }

        System.out.println(result);

        sc.close();
    }
}