import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 5, 8, 2};
        List<Integer> numbersList = new ArrayList<>();
        for (int number : numbers) {
            numbersList.add(number);
        }
        System.out.println(numbersList);

        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student(1, 19, "Tomas", Grade.UNIVERSITY),
                new Student(2, 29, "Jonas", Grade.PRIMARY),
                new Student(3, 30, "Greta", Grade.UNIVERSITY),
//                new Student(4, 20, "Alice", Grade.PRIMARY),
                new Student(4, 20, "Alice", Grade.PRIMARY),
                new Student(5, 22, "Peter", Grade.UNIVERSITY)));
        students.add(new Student(6, 25, "Oliver", Grade.PRIMARY));

//        students.removeIf(student -> student.getAge() > 25);

//        System.out.println();
//        for (Student student : students) {
//            System.out.println(student);
//        }
        Set<Student> uniqueStudents = new HashSet<>(students);

        System.out.println("Student list: " + students.size());
        System.out.println("Unique student list: " + uniqueStudents.size());
        //  uniqueStudents.removeIf(s -> Grade.PRIMARY.equals(s.getGrade()));

        System.out.println("-------------");

        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Pear", "Banana", "Apple", "Cherry", "Fig", "Orange", "Banana", "Apple"));
        System.out.println(fruits.size());

        HashSet<String> uniqueFruits = new HashSet<>(fruits);
        System.out.println(uniqueFruits.size());
        System.out.println(uniqueFruits);

        System.out.println("-------------");

        Map<String, Student> studentsMap2 = new HashMap<>();

        Map<String, Student> studentMap = uniqueStudents.stream().collect(Collectors.toMap(Student::getName, item -> item));

//        studentMap.putIfAbsent("Jonas", new Student (27, "Karolis", Grade.PRIMARY));
        System.out.println(studentMap.keySet());
        System.out.println(studentMap.values());
        System.out.println(studentMap.get("Jonas"));

        System.out.println("-------------");

        Map<Integer, Student> studentMap2 = students.stream().collect(Collectors.toMap(Student::getId, student -> student));
        System.out.println(studentMap2);
        studentMap2.put(4, new Student(4, 23, studentMap2.get(4).getName(), Grade.UNIVERSITY));
        System.out.println(studentMap2.keySet() + "\n" + studentMap2.values());

        System.out.println("-------------");

        students.stream().forEach(student -> System.out.println(student.getName()));
        System.out.println();

        students.sort(Comparator.comparing(Student::getName));
       // students.stream().forEach(student -> System.out.println(student.getName()));

//        students.stream()
//                .sorted(Comparator.comparing(Student::getName))
//                .forEach(student -> System.out.println(student.getName()));

        Set<String> names = students.stream()
                .filter(student -> student.getAge() > 25)
                .map(Student::getName)
                .collect(Collectors.toSet());

        System.out.println(names);

        Optional<Student> optionalStudent = students.stream()
                .filter(student -> student.getGrade().equals(Grade.UNIVERSITY))
                .findFirst();
        optionalStudent.ifPresent(student -> System.out.println(student.getName()));

        Integer sum = students.stream()
                .map(Student::getAge)
                .reduce(0, Integer::sum);

        System.out.println(sum);
        System.out.println("-------------");

        //--------------------------------------TASK WITH GAME CLASS

        List<Game> games = new ArrayList<>(Arrays.asList(
                new Game("Minecraft", Genre.ADVENTURE, 59.99, 1),
                new Game("Double", Genre.LOGIC, 9.99, 0),
                new Game("CATAN", Genre.ADVENTURE, 69.99, 7),
                new Game("CS", Genre.BATTLE, 39.99, 4),
                new Game("Cards", Genre.LOGIC, 2.99, 3)
        ));

        printGames(games);
        System.out.println("-------");

        games.remove(1);
        printGames(games);

        games.sort(Comparator.comparing(Game::getPrice));

        printGames(games);

        games.stream()
                .forEach(game -> game.incrementPriceByFive());

        System.out.println("-------");

        printGames(games);
        System.out.println("-------");

        List<Game> gamePriceMoreThanTen = games.stream()
                .filter(game -> game.getPrice() > 10.00)
                .collect(Collectors.toList());

        printGames(gamePriceMoreThanTen);
        System.out.println("-------");

        games.sort(Comparator.comparing(Game::getCopiesSold, Comparator.reverseOrder()));
        printGames(games);

        System.out.println("-------");

        Game gameMaxCopies = games.stream()
                .max(Comparator.comparing(Game::getCopiesSold))
                .orElseThrow();

        Game gameMinCopies = games.stream()
                .min(Comparator.comparing(Game::getCopiesSold))
                .orElseThrow();

        System.out.println(gameMaxCopies);
        System.out.println(gameMinCopies);


    }

    private static void printGames (List<Game> games) {
        for (Game game : games) {
            System.out.println(game);
        }
    }
}
