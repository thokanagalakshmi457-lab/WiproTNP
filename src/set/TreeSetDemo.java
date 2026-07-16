package set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<String> set = new TreeSet<>();

        set.add("Java");
        set.add("Python");
        set.add("C");
        set.add("C++");
        set.add("HTML");

        System.out.println("Reverse Order:");
        System.out.println(set.descendingSet());

        System.out.println("\nUsing Iterator:");

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nElement Exists:");
        System.out.println("Java : " + set.contains("Java"));
        System.out.println("PHP : " + set.contains("PHP"));
    }
}