import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Numbers {

    public static void run() {

        // Create an array with these elements and print them in line.
        // Output - 40 55 63 17 22 68 89 97 89

        int[] numbers = {40, 55, 63, 17, 22, 68, 89, 97, 89};
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Create int array, convert it to a List and print it out.
        List<Integer> numbersList = new ArrayList<>();
        for (int number : numbers) {
            numbersList.add(number);
        }
        System.out.println(numbersList);
    }
}
