package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {


        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("in", "India");
        countryMap.put("en", "England");
        countryMap.put("us", "United States");

        System.out.println("Country Map: " + countryMap);


        Map<String, String> masterTable = new HashMap<>();
        masterTable.put("br", "Brazil");

        System.out.println("Before Merge: " + masterTable);


        masterTable.putAll(countryMap);

        System.out.println("After Merge: " + masterTable);


        System.out.println("Fetched Value for 'br': " + masterTable.get("br"));


    }
}
