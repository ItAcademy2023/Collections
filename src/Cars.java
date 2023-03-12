public class Cars {

    public static void run() {

        // Create an array of type String called cars. Add 3 cars.
        String[] cars = {"Subaru", "BMW", "Suzuki"};

        // Print the second item in the cars array.
        System.out.println("Second item: " + cars[1] + "\n");

        // Change the value from „Suzuki" to „Honda", in the cars array.
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].equals("Suzuki")) {
                cars[i] = "Honda";
            }
        }

        // Print how many elements the cars array have.
        System.out.println("Array has " + cars.length + " elements\n");

        // Loop through the items in the cars array.
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
