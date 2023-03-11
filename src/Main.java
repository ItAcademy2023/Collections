public class Main {
    public static void main(String[] args) {
        // 1 task
        String[] cars = {"Subaru", "Bmw", "Suzuki"};

        // 2 task
        System.out.println(cars[1]);

        // 3 task
        for (int i = 0; i < cars.length; i++)
        {
            if(cars[i] == "Suzuki")
            {
                cars[i] = "Honda";
                break;
            }
        }

        // 4 task
        System.out.println(cars.length);

        // 5 task
        for(String car : cars)
        {
            System.out.println(car);
        }

        // final task
        int[] arrayOfNum = {40, 55, 63, 17, 22, 68, 89, 97, 89};

        for(int num : arrayOfNum)
        {
            System.out.print(num + " ");
        }
    }
}