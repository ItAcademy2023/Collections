import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Fruits {

    public static void run() {

        // Create a ArrayList of fruits and add them to the list.
        // Apple, Pear, Banana, Apple, Cherry, Fig, Orange, Banana, Apple.
        // Print the size of this list.
        // Convert ArrayList items to HashSet.
        // Print what items are in the list.
        // Print the size of HashSet.

        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Pear", "Banana", "Apple", "Cherry", "Fig", "Orange", "Banana", "Apple"));

        Set<String> uniqueFruits = new HashSet<>(fruits);

        System.out.println(
                "\nList of fruits: " + fruits +
                        "\nFruits list size: " + fruits.size() +
                        "\n\nList of unique fruits: " + uniqueFruits +
                        "\nUnique fruits list size: " + uniqueFruits.size());
    }
}
