package string;

import java.util.Scanner;

public class FirstHalfString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (str.length() % 2 == 0) {
            String result = str.substring(0, str.length() / 2);
            System.out.println(result);
        } 
        else {
            System.out.println("null");
        }

        sc.close();
    }
}