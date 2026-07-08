package string;

import java.util.Scanner;

public class RemoveStar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '*') {
            
                i++;
                continue;
            }

            if (i + 1 < str.length() && str.charAt(i + 1) == '*') {
                continue;
            }

            result = result + str.charAt(i);
        }

        System.out.println(result);

        sc.close();
    }
}