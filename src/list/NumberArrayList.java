package list;

import java.util.ArrayList;

public class NumberArrayList {

    public static void main(String[] args) {

        ArrayList<Number> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20.5f);
        numbers.add(35.75);
        numbers.add(100L);

        for (Number n : numbers) {
            System.out.println(n);
        }
    }
}