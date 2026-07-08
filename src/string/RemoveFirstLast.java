package string;

import java.util.Scanner;

public class RemoveFirstLast {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = str.substring(1, str.length() - 1);

        System.out.println(result);

        sc.close();
    }
}