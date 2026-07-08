package string;

import java.util.Scanner;

public class ShortLongShort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String a = sc.nextLine();

        System.out.print("Enter second string: ");
        String b = sc.nextLine();

        String result;

        if (a.length() < b.length()) {
            result = a + b + a;
        } 
        else {
            result = b + a + b;
        }

        System.out.println(result);

        sc.close();
    }
}