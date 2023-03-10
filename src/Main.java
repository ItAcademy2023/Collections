import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

    }

    public void gameTasks() {

        ArrayList<Game> games = new ArrayList<>();
        PriceComparator priceComparator = new PriceComparator();
        games.add(new Game("American School", Genre.FPS, 15.99, 1));
        games.add(new Game("LOL", Genre.MOBA, 20.0, 50000));
        games.add(new Game("FIFA", Genre.SPORT, 60.0, 1000000));
        games.add(new Game("Minecraft", Genre.ADVENTURE, 5.0, 5));
        printGames(games);
        games.remove(1);
        printGames(games);
        Collections.sort(games, priceComparator);
        printGames(games);
        Collections.sort(games, priceComparator.reversed());
        printGames(games);

        games.stream().forEach(s -> s.setPrice(s.incrementPrice(s.getPrice())));
        printGames(games);
        List<Game> newGames = games.stream().filter(game -> game.getPrice() > 10 && game.getCopiesSold() > 50).collect(Collectors.toList());
        newGames.forEach(System.out::println);

        games.stream().sorted(Comparator.comparing(Game::getCopiesSold)).forEach(System.out::println);

        System.out.println(games.stream().min(Comparator.comparing(Game::getCopiesSold)));
        System.out.println(games.stream().max(Comparator.comparing(Game::getCopiesSold)));
    }

    public static void printGames(ArrayList<Game> games) {
        for (Game game: games) {
            System.out.print(game + " ");
        }
        System.out.println();
    }

    public void basicTasks() {
        int[] numbers = {40, 55, 63, 17, 22, 68, 89, 97, 89};
        List<Integer> values = Arrays.stream(numbers).boxed().toList();

        for (Integer value: values) {
            System.out.print(value + " ");
        }
        System.out.println();

        List<Student> students = new ArrayList<>(List.of(
                new Student(1,15, "Petras", Grade.PRIMARY),
                new Student(2,20, "Smetras", Grade.SECONDARY),
                new Student(3,25, "Ketras", Grade.UNIVERSITY),
                new Student(4,30, "Betras", Grade.PRIMARY),
                new Student(5,35, "Metras", Grade.SECONDARY)));

        students.removeIf(student -> student.getAge() > 25);
        System.out.println(students);

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Pear");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Cherry");
        fruits.add("Fig");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Apple");
        System.out.println(fruits.size());
        HashSet<String> fruities = new HashSet<>(fruits);
        for (String fruit: fruities) {
            System.out.print(fruit + " ");
        }
        System.out.println();
        System.out.println(fruities.size());

        List<Student> studentos = new ArrayList<>(List.of(
                new Student(1,15, "Petras", Grade.PRIMARY),
                new Student(2,20, "Smetras", Grade.SECONDARY),
                new Student(3,25, "Ketras", Grade.UNIVERSITY),
                new Student(4,30, "Betras", Grade.PRIMARY),
                new Student(5,35, "Metras", Grade.SECONDARY)));

        Map<Integer, Student> studentsMap = studentos.stream().collect(Collectors.toMap(Student::getId, Function.identity()));
        System.out.println(studentsMap.get(4).getName() + " " + studentsMap.get(4).getGrade() + " " + studentsMap.get(4).getAge());
        studentsMap.get(4).setGrade(Grade.UNIVERSITY);
        studentsMap.get(4).setAge(50);
        System.out.println(studentsMap.get(4).getName() + " " + studentsMap.get(4).getGrade() + " " + studentsMap.get(4).getAge());
        System.out.println(studentsMap.values());
    }
}