import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Why store attributes value in objects type instead of primitive data types?

        // First task
        String cars[] = {"Subaru", "BMW", "Suzuki"};

        System.out.println(cars[1]);

        cars[2] = "Honda";

        System.out.println(cars.length);

        for (String car : cars) {
            System.out.println(car);
        }

        // Second task
        int numbers[] = {40, 55, 63, 17, 22, 68, 89, 97, 89};

        System.out.println(Arrays.toString(numbers));

        // Third task
        Integer newArr[] = {1, 2, 3, 4, 5, 6};

        List<Integer> newList = Arrays.asList(newArr); // ?

        System.out.println(newList);


        // Fourth task
        List <Student> listOfStudents = new ArrayList<>();

        listOfStudents.add(new Student("Alex", 20, Education.Secondary, 1));
        listOfStudents.add(new Student("James", 21, Education.University, 2));
        listOfStudents.add(new Student("Howard", 26, Education.University, 3));
        listOfStudents.add(new Student("Peter", 24, Education.Primary, 4));
        listOfStudents.add(new Student("Anna", 22, Education.Secondary, 5));

        for (Student student : new ArrayList<>(listOfStudents)) {
            if (student.getAge() > 25) listOfStudents.remove(student);
        }

//        Iterable <Student> iterableStudents = listOfStudents;
//        for (Student student : iterableStudents) {
//            if (student.getAge() > 25) iterableStudents.remove(student);
//        }
        // Iterable interface and common?
        // Why new collection instead of iterating through initial (listOfStudents)?

        List <Student> filteredListOfStudents = listOfStudents
                .stream()
                .filter(student -> student.getAge() < 25)
                .toList();

//      students.removeIf(streamStudent -> streamStudent.getAge() > 25); - ?

//      overriding .equals method? compare by address / value?

        System.out.println(filteredListOfStudents);

        // Fifth task
        String fruits = "Apple Pear Banana Banana";

        List <String> fruitsList = new ArrayList <>(
                Arrays.asList(
                        fruits.split(" ")));

        System.out.println(fruitsList.size());

        Set <String> fruitsSet = new HashSet<>(fruitsList);

        System.out.println(fruitsList);
        System.out.println(fruitsSet);
        System.out.println(fruitsSet.size());

        // Sixth task
        Map <Integer, Student> studentsMap = listOfStudents
                .stream()
                .collect(Collectors
                        .toMap(Student:: getID, student -> student));
        // Map only interface? Collectors? ArrayList or List when declare variable?

        System.out.println(studentsMap);

        studentsMap.get(4).setAge(17);
        studentsMap.get(4).setEducation(Education.Primary);

        System.out.println(studentsMap.keySet());
        System.out.println(studentsMap.values());

        // Seventh task
        Games gameOne = new Games("Game One", Genre.One, 20, 5);
        Games gameTwo = new Games("Game Two", Genre.Two, 15, 4);
        Games gameThree = new Games("Game Three", Genre.Three, 40, 3);
        Games gameFour = new Games("Game Four", Genre.Four, 30, 51);

        List <Games> listOfGames = new ArrayList <>();

        listOfGames.add(gameOne);
        listOfGames.add(gameTwo);
        listOfGames.add(gameThree);
        listOfGames.add(gameFour);

        for (Games game : listOfGames) {
            System.out.println(game);
        }

        listOfGames.remove(gameTwo);

        listOfGames.sort(Comparator.comparing(Games::getPrice));
        System.out.println(listOfGames);

        listOfGames.sort(Comparator.comparing(Games::getPrice).reversed());
        System.out.println(listOfGames);

        // Eighth task
        listOfGames
                .stream()
                .forEach(game -> game.incrementPrice());

        // Is it okay ? Not iterable?

        List <Games> newListOfGames = new ArrayList<>(listOfGames)
                .stream()
                .filter(game -> game.getPrice() > 10)
                .filter(game -> game.getCopiesSold() > 50)
                .toList();

        System.out.print(newListOfGames);

        // Tenth task
        List <Games> sortedGamesList = listOfGames
                .stream()
                .sorted(Comparator.comparing(Games::getCopiesSold))
                .toList();

        System.out.println(sortedGamesList);

        System.out.println(listOfGames.stream().max(Comparator.comparing(Games::getCopiesSold)));
        System.out.println(listOfGames.stream().min(Comparator.comparing(Games::getCopiesSold)));
    }
}