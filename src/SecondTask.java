import java.util.Arrays;
import java.util.List;

public class SecondTask {

    public static void main(String[] args) {

        Integer[] numbers = new Integer[] { 1, 2, 3 };
        List<Integer> list = Arrays.asList(numbers);

        for (Integer integer : list) {
            System.out.println(integer);
        }

    }
}
