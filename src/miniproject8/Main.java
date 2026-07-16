package miniproject8;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Character, ArrayList<Cards>> map = new TreeMap<>();
        System.out.println("Enter Number of Cards :");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter card " + i + ":");
            char symbol = sc.next().charAt(0);
            int number = sc.nextInt();
            Cards card = new Cards(symbol, number);
            if (map.containsKey(symbol)) {
                map.get(symbol).add(card);
            } else {
                ArrayList<Cards> list = new ArrayList<>();
                list.add(card);
                map.put(symbol, list);
            }
        }
        System.out.println("Distinct Symbols are :");
        for (char ch : map.keySet()) {
            System.out.print(ch + " ");
        }
        System.out.println();
        for (char ch : map.keySet()) {
            System.out.println("Cards in " + ch + " Symbol");
            ArrayList<Cards> list = map.get(ch);
            int sum = 0;
            for (Cards c : list) {
                System.out.println(c.getSymbol() + " " + c.getNumber());
                sum += c.getNumber();
            }
            System.out.println("Number of cards : " + list.size());
            System.out.println("Sum of Numbers : " + sum);
        }
        sc.close();
    }
}