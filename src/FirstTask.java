public class FirstTask {

    public static void main(String[] args) {


        String[] cars = {"Subaru", "Bmw", "Suzuki"};
        System.out.println(cars[1]);
        cars[2] = "Honda";
        int arraySize = cars.length;
        System.out.println(arraySize);

        for (String car : cars) {
            System.out.println(car);
        }

        int[] numbers = {40, 55, 63, 17, 22, 68, 89, 97, 89};
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
