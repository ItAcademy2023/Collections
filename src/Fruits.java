import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class Fruits {

    public static void main (String[] args){

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Pear");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Cherry");
        fruits.add("Fig");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Apple");

        System.out.println(fruits.size());

        HashSet<String> uniqueFruits = new HashSet<>(fruits);
        for(String value : uniqueFruits){
            System.out.println(value);
        }
        System.out.println("Array size " + fruits.size() + " size of HashSet " + uniqueFruits.size());


    }
}
