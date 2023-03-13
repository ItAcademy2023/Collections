import java.util.*;

public class Fruits {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(Arrays.asList("Apple","Pear","Banana","Mango","Apple","Orange","Fig"));


        System.out.println(fruits.size());
        Set<String> covertFruit = new HashSet<>(fruits);

    }



}
