import java.util.*;

public class FruitList {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>
                (Arrays.asList("Apple", "Pear", "Banana", "Apple", "Cherry", "Fig", "Orange", "Banana", "Apple"));

        System.out.println(fruits.size());

        Set<String> uniqueFruits = new HashSet<>(fruits);       // without duplicates

        System.out.println(uniqueFruits);
        System.out.println(uniqueFruits.size());
    }
}
