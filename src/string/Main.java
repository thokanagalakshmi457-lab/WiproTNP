package string;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        StringBuffer sb = new StringBuffer(str);
        String reverse = sb.reverse().toString();

        if (str.equals(reverse)) {
            System.out.println("Given String is Palindrome");
        } else {
            System.out.println("Given String is not Palindrome");
        }

        sc.close();
    }
}