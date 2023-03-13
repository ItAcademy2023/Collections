import java.util.Arrays;
import java.util.List;

public class AudriusLists {
    public static void main(String[] args){
        int[] numbers = {12, 13, 14, 16, 18};
        List<Integer> listOfNumbers = Arrays.stream(numbers).boxed().toList();

        System.out.println(listOfNumbers);

    }



}

