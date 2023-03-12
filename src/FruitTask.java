import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FruitTask {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Pear", "Banana", "Cherry", "Fig", "Orange", "Banana", "Apple"));

        HashSet<String> hashSet = new HashSet<>(fruits);

        for(String value: hashSet){
            System.out.println(value);
        }

        System.out.println("Array size: " + fruits.size() + "  Hash Set size: " + hashSet.size());
    }
}
