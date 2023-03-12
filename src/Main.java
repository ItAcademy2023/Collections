import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        //Task 1 - Array
        String[] cars = {"Subaru", "Bmw", "Suzuki"};

        for (String car : cars) {
            System.out.println(car);
        }

        System.out.println("Second item in cars array is " + cars[1]);

        cars[2] = "Honda";
        System.out.println("Third car was changed to " + cars[2]);

        System.out.println("Array is " + cars.length + " long.");

        for (String car : cars) {
            System.out.println(car);
        }

        //Task 1 - Array (final)
        int[] numbers = {40, 55, 63, 17, 22, 68, 89, 97, 89};

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\n\n\n\n");



        //Task 2 - List
        int[] arrayNumbers = {0, 1, 2};

        List<Integer> listNumbers = new ArrayList<>();

        for (int number : arrayNumbers) {
            listNumbers.add(number);
        }

        for (int number : listNumbers) {
            System.out.println(number);
        }

        System.out.println("\n\n\n\n");



        //Task 2.2 - Students
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Harry", 14, Grade.UNIVERSITY,0));
        students.add(new Student("John", 29, Grade.UNIVERSITY, 1));
        students.add(new Student("Tom", 23, Grade.PRIMARY, 2));
        students.add(new Student("Boris", 22, Grade.UNIVERSITY, 3));
        students.add(new Student("Denis", 26, Grade.PRIMARY, 4));

        students.removeIf(streamStudent -> streamStudent.getAge() > 25);
        students.forEach(System.out::println);
        System.out.println("\n\n\n\n");



          //Task 3 - HashSet
        ArrayList<String> fruits = new ArrayList<>(List.of("Apple", "Pear", "Banana", "Apple", "Cherry", "Fig", "Orange", "Banana", "Apple"));

        fruits.forEach(System.out::println);
        System.out.println("Array size is " + fruits.size() + "\n");

        HashSet<String> fruitsSet = new HashSet<>(fruits);

        fruitsSet.forEach(System.out::println);
        System.out.println("Set size is " + fruitsSet.size());
        System.out.println("\n\n\n\n");



            //Task 4 - Map
        ArrayList<Student> students2 = new ArrayList<>();
        students2.add(new Student("Harry", 14, Grade.UNIVERSITY,0));
        students2.add(new Student("John", 29, Grade.UNIVERSITY, 1));
        students2.add(new Student("Tom", 23, Grade.PRIMARY, 2));
        students2.add(new Student("Boris", 22, Grade.UNIVERSITY, 3));
        students2.add(new Student("Denis", 26, Grade.PRIMARY, 4));

        Map<Integer, Student> studentMap = students2.stream().collect(Collectors.toMap(Student::getId, student -> student));
        System.out.println(studentMap);

        Student modifiedStudent = new Student(studentMap.get(4).getName(), 11, Grade.UNIVERSITY, studentMap.get(4).getId());
        studentMap.put(4, modifiedStudent);

        System.out.println(studentMap.keySet());
        System.out.println(studentMap.values());
        System.out.println("\n\n\n\n");



        //Task 5 - Sorting
        List<Game> gameArrayList = new ArrayList<>();
        gameArrayList.add(new Game("LOL", Genre.MOBA, 0, 100));
        gameArrayList.add(new Game("DMC", Genre.ACTION, 59.99, 20));
        gameArrayList.add(new Game("Valorant", Genre.SHOOTING, 19.99, 30));
        gameArrayList.add(new Game("WOW", Genre.RPG, 15, 60));

        System.out.println("Game list");
        for(Game game : gameArrayList) {
            System.out.println(game);
        }
        System.out.println();

        gameArrayList.remove(1);
        System.out.println("Game list after removing second game");
        printList(gameArrayList);

        gameArrayList.sort(new PriceComparator());
        System.out.println("Sorted game list by price");
        printList(gameArrayList);

        gameArrayList.sort(new PriceComparator().reversed());
        System.out.println("Sorted game list by price with reverse order");
        printList(gameArrayList);



        //Task 6 - Streams
        gameArrayList.forEach(game -> game.incrementPrice(5));
        System.out.println("Game list with price increased by 5");
        printList(gameArrayList);

        List<Game> filteredList = gameArrayList.stream()
                .filter(game -> game.getPrice() > 10)
                .filter(game -> game.getCopiesSold() > 50)
                .collect(Collectors.toList());
        System.out.println("Filtered game list that has cost above 10 and sold copies above 50");
        printList(filteredList);



        //Task 7 - Comparison based Stream Operations
        List<Game> secondGameList = new ArrayList<>();
        secondGameList.add(new Game("LOL", Genre.MOBA, 0, 100));
        secondGameList.add(new Game("DMC", Genre.ACTION, 59.99, 20));
        secondGameList.add(new Game("Valorant", Genre.SHOOTING, 19.99, 30));
        secondGameList.add(new Game("WOW", Genre.RPG, 15, 60));

        List<Game> sortedSecondGameList = secondGameList.stream().sorted(Comparator.comparingInt(Game::getCopiesSold)).toList();
        System.out.println("Game list sorted by copies sold");
        printList(sortedSecondGameList);

        int maxCopiesSold = secondGameList.stream().max(Comparator.comparingInt(Game::getCopiesSold)).get().getCopiesSold();
        System.out.println("Max copies sold is " + maxCopiesSold);

        int minCopiesSold = secondGameList.stream().min(Comparator.comparingInt(Game::getCopiesSold)).get().getCopiesSold();
        System.out.println("Max copies sold is " + minCopiesSold);

    }

    private static void printList(List<Game> gameArrayList) {
        gameArrayList.forEach(System.out::println);
        System.out.println();
    }
}