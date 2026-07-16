package map;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class CountryHashtable {

    Hashtable<String, String> M1 = new Hashtable<>();

    public Hashtable<String, String> saveCountryCapital(String country, String capital) {
        M1.put(country, capital);
        return M1;
    }

    public String getCapital(String country) {
        return M1.get(country);
    }

    public String getCountry(String capital) {

        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equals(capital))
                return entry.getKey();
        }

        return null;
    }

    public Hashtable<String, String> createCapitalCountryMap() {

        Hashtable<String, String> map = new Hashtable<>();

        for (Map.Entry<String, String> entry : M1.entrySet()) {
            map.put(entry.getValue(), entry.getKey());
        }

        return map;
    }

    public ArrayList<String> createCountryArrayList() {
        return new ArrayList<>(M1.keySet());
    }

    public static void main(String[] args) {

        CountryHashtable obj = new CountryHashtable();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");

        System.out.println(obj.getCapital("India"));
        System.out.println(obj.getCountry("Tokyo"));
        System.out.println(obj.createCapitalCountryMap());
        System.out.println(obj.createCountryArrayList());
    }
}