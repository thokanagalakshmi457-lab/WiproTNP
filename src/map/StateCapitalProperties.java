package map;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class StateCapitalProperties {

    public static void main(String[] args) {

        Properties properties = new Properties();

        properties.put("Andhra Pradesh", "Amaravati");
        properties.put("Telangana", "Hyderabad");
        properties.put("Karnataka", "Bengaluru");
        properties.put("Tamil Nadu", "Chennai");

        Iterator<Map.Entry<Object, Object>> iterator =
                properties.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Object, Object> entry = iterator.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}