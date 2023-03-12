public class CarArray {

    public static void run() {
        String[] cars = {"Subaru", "Bmw", "Suzuki"};

        System.out.println(cars[1]);

        cars[2] = "Honda";

        System.out.println(cars.length);
        System.out.println();

        for (String car : cars) {
            System.out.println(car);
        }
    }

    public static void main(String[] args) {

        CarArray.run();

        int[] numbers = {40, 55, 63, 17, 22, 68, 89, 97, 89};

        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }
}
