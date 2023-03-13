import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        // small tasks
        String[] cars = {"Subaru", "Bmw", "Suzuki"};
        System.out.println(cars[1]);
        cars[2] = "Honda";
        System.out.println(cars.length);
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        //final task
        int[] numbers = new int[9];
        numbers[0] = 40;
        numbers[1] = 55;
        numbers[2] = 63;
        numbers[3] = 17;
        numbers[4] = 22;
        numbers[5] = 68;
        numbers[6] = 89;
        numbers[7] = 97;
        numbers[8] = 89;

        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }


}
