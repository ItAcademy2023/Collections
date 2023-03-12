import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Fruits {
    public static void main(String[] args){
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList(
                "Apple", "Pear", "Banana", "Apple", "Cherry", "Fig", "Orange", "Banana", "Apple"));
        System.out.println("fruit array list size: " + fruits.size());
        // Set<String> uniqueFruit = fruits.stream().collect(Collectors.toSet());
        HashSet<String> fruitSet = new HashSet<>(fruits);
        System.out.println("fruit set items: " + fruitSet);
        System.out.println("size of hashset: " + fruitSet.size());
    }
}
