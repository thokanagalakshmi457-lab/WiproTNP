package string;

import java.util.Scanner;

public class RepeatLastCharacters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        String result = "";

        String lastChars = str.substring(str.length() - n);

        for (int i = 0; i < n; i++) {
            result = result + lastChars;
        }

        System.out.println(result);

        sc.close();
    }
}