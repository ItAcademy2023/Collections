import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        String[] cars = {"Subaru", "BMW", "Suzuki"};
        System.out.println(cars[1]);
        for(int i = 0; i < cars.length; i++){
            if (Objects.equals(cars[i], "Suzuki")) {
                cars[i] = "Honda";
            }
        }
        System.out.println(cars.length);
        for(String car : cars){
            System.out.println(car);
        }

        int[] numbers = {40, 55, 63, 17, 22, 68, 89, 97, 89};
        for(int number : numbers){
            System.out.print(number + " ");
        }
            System.out.println();
    }
}