package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("IND", "India");
        map.put("USA", "United States");
        map.put("JPN", "Japan");
        map.put("AUS", "Australia");

        // Check Key
        System.out.println("Key IND Exists : " + map.containsKey("IND"));

        // Check Value
        System.out.println("Value Japan Exists : " + map.containsValue("Japan"));

        // Iterator
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}