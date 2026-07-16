package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ContactList {

    public static void main(String[] args) {

        HashMap<String, Integer> contacts = new HashMap<>();

        contacts.put("Lakshmi", 123456789);
        contacts.put("Ravi", 987654321);
        contacts.put("Sita", 456789123);

        System.out.println("Key Exists : " + contacts.containsKey("Lakshmi"));
        System.out.println("Value Exists : " + contacts.containsValue(987654321));

        Iterator<Map.Entry<String, Integer>> iterator =
                contacts.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}