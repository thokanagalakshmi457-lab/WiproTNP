package string;

import java.util.Scanner;

public class RemoveX {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (str.startsWith("x") && str.endsWith("x")) {
            str = str.substring(1, str.length() - 1);
        } 
        else if (str.startsWith("x")) {
            str = str.substring(1);
        } 
        else if (str.endsWith("x")) {
            str = str.substring(0, str.length() - 1);
        }

        System.out.println(str);

        sc.close();
    }
}