import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FruitList {
    public static void main(String[] args){

//        String[] fruits = {"Apple", "Pear", "Banana", "Apple", "Cherry", "Fig", "Orange", "Banana",
//                "Apple"};
         ArrayList<String> fruitsList = new ArrayList<>(List.of("Apple", "Pear", "Banana", "Apple", "Cherry", "Fig", "Orange", "Banana",
                 "Apple"));
        System.out.println(fruitsList);

        HashSet<String> uniqueFruits = new HashSet<String>(fruitsList);


    }
}
