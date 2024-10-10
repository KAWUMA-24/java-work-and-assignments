import java.util.ArrayList;

public class StoreDisplayArrayList {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Display elements
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
