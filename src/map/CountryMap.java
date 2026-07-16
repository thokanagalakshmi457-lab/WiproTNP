package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountryMap {

    HashMap<String, String> M1 = new HashMap<>();

  
    public HashMap<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

  
    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

  
    public String getCountry(String capitalName) {

        for (Map.Entry<String, String> entry : M1.entrySet()) {

            if (entry.getValue().equals(capitalName)) {
                return entry.getKey();
            }
        }

        return null;
    }

  
    public HashMap<String, String> createCapitalCountryMap() {

        HashMap<String, String> M2 = new HashMap<>();

        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }

        return M2;
    }

    public ArrayList<String> createCountryArrayList() {

        ArrayList<String> countries = new ArrayList<>();

        for (String country : M1.keySet()) {
            countries.add(country);
        }

        return countries;
    }

    public static void main(String[] args) {

        CountryMap obj = new CountryMap();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");
        obj.saveCountryCapital("USA", "Washington D.C.");
        obj.saveCountryCapital("Australia", "Canberra");

        System.out.println("Map M1:");
        System.out.println(obj.M1);

        System.out.println("\nCapital of India:");
        System.out.println(obj.getCapital("India"));

        System.out.println("\nCountry for Tokyo:");
        System.out.println(obj.getCountry("Tokyo"));

        System.out.println("\nMap M2 (Capital -> Country):");
        System.out.println(obj.createCapitalCountryMap());

        System.out.println("\nCountry List:");
        System.out.println(obj.createCountryArrayList());
    }
}