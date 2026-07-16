package miniproject7;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Card> map = new HashMap<>();
        int count = 0;
        while (map.size() < 4) {
            System.out.println("Enter a card :");
            char symbol = sc.next().charAt(0);
            int number = sc.nextInt();
            count++;
            if (!map.containsKey(symbol)) {
                map.put(symbol, new Card(symbol, number));
            }
        }
        TreeSet<Card> set = new TreeSet<>(map.values());
        System.out.println("Four symbols gathered in " + count + " cards.");
        System.out.println("Cards in Set are :");
        for (Card c : set) {
            System.out.println(c.getSymbol() + " " + c.getNumber());
        }
        sc.close();
    }
}