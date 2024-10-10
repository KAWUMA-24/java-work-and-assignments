import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);

        // Access elements
        System.out.println("Value for key 'Banana': " + map.get("Banana"));

        // Display the HashMap
        System.out.println("HashMap: " + map);
    }
}
