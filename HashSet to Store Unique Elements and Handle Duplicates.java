import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // Add elements
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // Duplicate element

        // Display the HashSet
        System.out.println("HashSet: " + set);
    }
}
