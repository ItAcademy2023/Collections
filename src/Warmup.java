import java.util.ArrayList;
import java.util.List;

public class Warmup {
    public void warmup() {
        String[] cars = {"Suzuki", "Bmw", "Suzuki"};
        System.out.println(cars[1]);
        for (int i = 0; i < 3; i++) {
            if (cars[i].equals("Suzuki")) {
                cars[i] = "Honda";
                break;
            }
        }
        System.out.println(cars.length);
        for (String car : cars) {
            System.out.println(car);
        }
        int[] numbers = {40, 55, 63, 17, 22, 68, 89, 97, 89};
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        List<Integer> numberList = new ArrayList<>();
        for (int number : numbers) {
            numberList.add(number);
        }
        System.out.println(numberList);
    }
}
