import java.util.*;
import java.util.stream.Collectors;

public class Tasks {

    public static void createStringArray() {
        String[] cars = {"Subaru", "BMW", "Suzuki"};

        System.out.println(cars[1]);

        cars[2] = "Honda";
        System.out.println(cars.length);

        for (String car : cars) {
            System.out.println(car);
        }

    }

    public static void createIntArray() {
        int[] numbers = {40, 55, 63, 17, 22, 68, 89, 97, 89};

        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

    }

    public static void createIntArrayToList() {
        Integer[] numbers = {1, 2, 3, 4, 5};
        List<Integer> newNumbers = Arrays.asList(numbers);

        for (Integer newNumber : newNumbers) {
            System.out.print(newNumber + " ");
        }
        System.out.println();
    }

    public static void studentLists() {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student(1, "Sandra", 29, Grade.UNIVERSITY),
                new Student(2, "Bob", 12, Grade.SECONDARY),
                new Student(3, "Timmy", 8, Grade.PRIMARY),
                new Student(4, "Julie", 15, Grade.SECONDARY),
                new Student(4, "Julie", 15, Grade.SECONDARY),
                new Student(5, "Roger", 35, Grade.UNIVERSITY)));

        // students.add(new Student("Mike", 10, Grade.PRIMARY));
        // students.addAll(students); add a collection to list

//        for (Student student : students) {
//            System.out.println(student);
//        }
//        System.out.println("");
//        Student timmy = students.get(2);
//
//        if (students.contains(timmy)) {
//            students.remove(timmy);
//            students.remove(4); // remove this because list is immutable
//        }
//
//        Student timmy = students.get(2);
//
//        if (students.contains(timmy)) {
//            students.remove(timmy);
//        }
//
//        for (Student student : students) {
//            System.out.println(student);
//        }

        students.removeIf(s -> s.getAge() > 25);
        System.out.println(students);
    }

    public static void setsInAction() {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student(1, "Sandra", 29, Grade.UNIVERSITY),
                new Student(2, "Bob", 12, Grade.SECONDARY),
                new Student(3, "Timmy", 8, Grade.PRIMARY),
                new Student(4, "Julie", 15, Grade.SECONDARY),
                new Student(4, "Julie", 15, Grade.SECONDARY),
                new Student(5, "Roger", 35, Grade.UNIVERSITY)));

        Set<Student> uniqueStudents = students.stream().collect(Collectors.toSet()); // or new hashset <>(students)

        uniqueStudents.removeIf(s -> Grade.PRIMARY.equals(s.getGrade()));// this way is null safe (instead of ==), if it is null - results in false

        System.out.println("Unique students minus primary grade: " + uniqueStudents.size());
        System.out.println(uniqueStudents); // use override equals method in class to make the second Julie equal to first
        //otherwise it will be like different object with same fields and hashset will allow it

        //SORTING
//        students.sort(Comparator.comparing(Student::getName));
//        System.out.println(students);
        //same as below
        students.stream().sorted(Comparator.comparing(Student::getName)).forEach(s -> System.out.println(s.getName()));

    }

    public static void fruitListAndSet() {

        List fruits = new ArrayList<>(Arrays.asList("Apple", "Pear", "Banana", "Apple", "Cherry", "Fig", "Orange", "Banana", "Apple"));
        System.out.println("Size of fruit array list: " + fruits.size());
        System.out.println(new HashSet<>(fruits) + " and new size is " + new HashSet<>(fruits).size()); // or use stream.collect
//        Set<String> uniqueFruits =;
//        System.out.println(uniqueFruits + " , size of set " + uniqueFruits.size());

    }

    public static void studentMap() {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student(1, "Sandra", 29, Grade.UNIVERSITY),
                new Student(2, "Bob", 12, Grade.SECONDARY),
                new Student(3, "Timmy", 8, Grade.PRIMARY),
                new Student(4, "Julie", 15, Grade.SECONDARY),
                new Student(5, "Roger", 35, Grade.UNIVERSITY)));

        Map<Integer, Student> studentsKeyValuePairs = students.stream().collect(Collectors.toMap(Student::getId, item -> item));

        System.out.println(studentsKeyValuePairs);
        System.out.println("-------Updated nr 4 student below-------");

        if (studentsKeyValuePairs.containsKey(4)) {
            studentsKeyValuePairs.put(4, new Student(4, "Julie", 20, Grade.UNIVERSITY));
        }

        System.out.println(studentsKeyValuePairs.keySet());
        System.out.println(studentsKeyValuePairs.values());


    }

    public static void gameTasks() {

        ArrayList<Game> games = new ArrayList<>(Arrays.asList(
                new Game("Dark Souls", Genre.SOULSLIKE, 69.99, 100),
                new Game("CS:GO", Genre.FPS, 3.99, 20),
                new Game("FIFA2023", Genre.SPORTS, 2.99, 60),
                new Game("FF XVII", Genre.RPG, 49.99, 40)
        ));

        for (Game game : games) {
            System.out.println(game);
        }
        System.out.println("----Removed second game (at index 1) ----");
        games.remove(1);

        for (Game game : games) {
            System.out.println(game);
        }
        System.out.println("----Sorted by price asc");

        PriceComparator priceCompare = new PriceComparator();

        Collections.sort(games, priceCompare);
        for (Game game : games) {
            System.out.println(game);
        }

        System.out.println("----Sorted by price desc");
        Collections.sort(games, priceCompare.reversed());
        for (Game game : games) {
            System.out.println(game);
        }

        System.out.println();
        System.out.println("---------Stream Tasks --- increment price by 5");

        games.stream().forEach(g -> g.incrementPrice());
        for (Game game : games) {
            System.out.println(game);
        }
        System.out.println();
        System.out.println("---------Stream Tasks --- filter by price(>10) and soldCopies (>50)");


        List<Game> filteredGames = games.stream().filter(g -> (g.getPrice() > 10) && (g.getCopiesSold() > 50)).toList();
        for (Game game : filteredGames) {
            System.out.println(game);
        }

        System.out.println();
        System.out.println("---------Stream Tasks --- sort by copies sold");
        List<Game> sortedGames = games.stream().sorted(Comparator.comparing(Game::getCopiesSold)).toList();
        for (Game game : sortedGames) {
            System.out.println(game);
        }

        System.out.println();
        System.out.println("---------Stream Tasks --- find MIN and MAX copies sold (CS:GO removed already)");

        System.out.println("Max copies sold is : " + games.stream().max(Comparator.comparing(Game::getCopiesSold)).orElseThrow(NoSuchElementException::new));
        System.out.println("Min copies sold is : " + games.stream().min(Comparator.comparing(Game::getCopiesSold)).orElseThrow(NoSuchElementException::new));


    }


}
