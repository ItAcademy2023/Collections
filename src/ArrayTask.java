public class ArrayTask {
    public static void run() {
        String[] cars = {"Subaru", "BMW", "Suzuki"};

        cars[2] = "Honda";
        System.out.println(cars[1]);
        for (String car : cars) {
            System.out.println(car);
        }
        int[] numbers = {40, 55, 63, 17, 22, 68, 89, 97, 89};
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}