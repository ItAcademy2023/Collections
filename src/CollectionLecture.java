import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toCollection;

public class CollectionLecture {

    public static void main (String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"John",22, Grade.UNIVERSITY));
        students.add(new Student(2, "Doe", 26, Grade.PRIMARY));
        students.add(new Student(3, "Rita", 11, Grade.PRIMARY));
        students.add(new Student(4, "Juozas", 28, Grade.PRIMARY));
        students.add(new Student(5, "Tomas", 25, Grade.PRIMARY));

        Integer[] arr = {1, 2, 3};
        List<Integer> lst = Arrays.asList(arr);

        for(Integer num : lst){
            System.out.print(num + " ");
        }
        System.out.println();

        //students.removeIf(student -> student.getAge() > 25);

        for (Student student : students)
        {
            System.out.println(student);
        }

        ArrayList<String> fruitsList = Stream.of("Apple", "Pear", "Banana", "Apple", "Cherry", "Fig", "Orange", "Banana", "Apple").collect(toCollection(ArrayList::new));
        System.out.println("fruitsList size: " + fruitsList.size());
        HashSet<String> fruitsSet = new HashSet<>(fruitsList);
        fruitsSet.forEach(System.out::println);
        System.out.println("fruitsSet size: " + fruitsSet.size());
        System.out.println();


        Map<Integer, Student> studentMap = students.stream().collect(Collectors.toMap(Student::getId, student -> student));
        System.out.println(studentMap);

        studentMap.put(4, new Student(4, studentMap.get(4).getName(), 99, Grade.UNIVERSITY));

        System.out.println(studentMap.keySet());
        System.out.println(studentMap.values());


        //students.sort(Comparator.comparing(Student::getName));
        //System.out.println(students);

        ArrayList<Game> games = Stream.of(
                new Game("Zelda", Genre.RPG, 30.00, 2000000),
                new Game("League", Genre.MMO, 0.00, 20000000),
                new Game("CS", Genre.FPS, 10.00, 30),
                new Game("Phasmophobia", Genre.HORROR, 20.00, 100)
                ).collect(toCollection(ArrayList::new));

        games.forEach(System.out::println);
        games.remove(1);
        games.forEach(System.out::println);

        games.sort(new PriceComparator());
        games.forEach(System.out::println);

        games.forEach((Game game) -> game.incrementPrice(5.00));
        games.forEach(System.out::println);

        System.out.println("Filtered games: \n");
        List<Game> filteredGames = games.stream()
                .filter(game -> game.getPrice() > 10 && game.getCopiesSold() > 50)
                .toList();
        filteredGames.forEach(System.out::println);

        System.out.println("Sorted by copies sold: \n");
        games.stream().sorted(Comparator.comparingInt(Game::getCopiesSold)).forEach(System.out::println);

        System.out.println("Min copies sold: \n");
        System.out.println(games.stream().min(Comparator.comparingInt(Game::getCopiesSold)).orElseThrow(NoSuchElementException::new));

        System.out.println("Max copies sold: \n");
        System.out.println(games.stream().max(Comparator.comparingInt(Game::getCopiesSold)).orElseThrow(NoSuchElementException::new));
    }
}
