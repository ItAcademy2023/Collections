import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Fruits {
    public void fruits() {
        List<String> fruits = List.of("Apple", "Pear", "Banana", "Apple", "Cherry", "Fig", "Orange", "Banana", "Apple");
        Set<String> fruitSet = new HashSet<>(fruits);
        System.out.println("{List size: " + fruits.size() + "}" + ", {Set Size: " + fruitSet.size() + "}, {Set: " + fruitSet + "}");
    }

}
