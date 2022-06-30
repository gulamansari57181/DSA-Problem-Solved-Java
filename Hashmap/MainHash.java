
import java.util.*;

public class MainHash {
    public static void main(String[] args) {
        // Creating a hashmap to store population of a country
        HashMap<String, Integer> hm = new HashMap<>();

        // Put values in hash

        hm.put("India", 135);
        hm.put("China", 200);
        hm.put("US", 140);
        System.out.println(hm);
        hm.put("India", 150);
        hm.put("Nigeria", 80);
        System.out.println(hm);

        // Get values from hashmap via key

        System.out.println(hm.get("India"));

        // return null if key already not present in hashmap
        System.out.println(hm.get("Pakistan"));
        System.out.println(hm.get("Bhutan"));

        // Hashmap contains or not

        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsValue(135));
        System.out.println(hm.containsValue(200));

        // To get all the keys
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        // Iterate to print all the key value pair
        for (String key : keys) {
            int val = hm.get(key);
            System.out.println(key + " " + val);
        }

    }

}
