import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        //1.1
        String[] carArray = {"Subaru", "Bmw", "Suzuki"};
        //1.2
        System.out.println(carArray[1]);
        //1.3
        carArray[2] = "Honda";
        //1.4
        System.out.println(carArray.length);
        //1.5
        for (String car : carArray) {
            System.out.println(car);
        }

        //2.1
        int[] numArray = {40, 55, 63, 17, 22, 68, 89, 97, 89};
        //2.2
        StringBuilder output = new StringBuilder("Output -");
        for (int number : numArray) {
            output.append(" ").append(number);
        }

        System.out.println(output);


        //3.1
        Integer[] numberArray = new Integer[]{40, 55, 63};
        List<Integer> Numberlist = Arrays.asList(numberArray);
        System.out.println(Numberlist);

        //3.2
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student(26, "3Name", Grade.PRIMARY, 1),
                new Student(22, "4Name2", Grade.SECONDARY, 2),
                new Student(26, "5Name3", Grade.PRIMARY, 3),
                new Student(23, "2Name4", Grade.SECONDARY, 4),
                new Student(26, "1Name5", Grade.PRIMARY, 5)
        ));

        //3.3
        Iterator<Student> iter = students.iterator();
        while (iter.hasNext()) {
            if (iter.next().getAge() > 25) {
                // iter.remove();
            }
        }
        //(if without asList list) students.removeIf(streamStudent -> streamStudent.getAge() > 25);

        //3.4
        for (Student student : students) {
            System.out.println(student.toString());
        }

        //Set
        //=============================================================================================================//
       /* Set<Student> uniqueStudents = new HashSet<>(students);
        System.out.println("List size " + students.size());
        System.out.println("Set size " + uniqueStudents.size());

        //uniqueStudents.removeIf(s -> Grade.SECONDARY.equals(s.getGrade())); //use equal instead of == to check for nulz
        System.out.println(uniqueStudents);*/
        //=============================================================================================================//

        //4.0
        List<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Pear", "Banana", "Apple", "Cherry", "Fig", "Orange", "Banana", "Apple"));
        Set<String> fruitHashSet = new HashSet<>(fruits);
        System.out.println("Fruit list size " + fruits.size() + ", Fruit hash size " + fruitHashSet.size());

        //=============================================================================================================//
        //Mapz
      /*  Map<String, Student> keyValuePairs = uniqueStudents.stream().collect(Collectors.toMap(Student::getName, item -> item));

        //new
        Map<String, Student> studentMap = new HashMap<>();
        studentMap.put("CoolName", new Student(55, "Naame6", Grade.PRIMARY, 1));
        //edit
        keyValuePairs.put("Name", new Student(55, "ReplaceName", Grade.PRIMARY, 2));
        //Same data under new key
        keyValuePairs.put("Name2", new Student(55, "ReplaceName", Grade.PRIMARY, 3));
        //protect data overwrite
        keyValuePairs.putIfAbsent("CoolerName", new Student(19, "Radical Name", Grade.PRIMARY, 4));

        System.out.println(keyValuePairs.keySet());
        System.out.println(keyValuePairs.values());
        System.out.println(keyValuePairs.get("Name")); */
        //=============================================================================================================//
        //5.0

        Map<Integer, Student> studentMap2 = students.stream().collect(Collectors.toMap(Student::getID, item -> item));
        System.out.println(studentMap2);
        studentMap2.put(4, new Student(18, "Name4", Grade.PRIMARY, 4));
        System.out.println(studentMap2.get(4).getID() + " - " + studentMap2.get(4).toString());
        System.out.println(studentMap2.keySet());
        System.out.println(studentMap2.values());

        //=============================================================================================================//
        //Comparator sorting
       /* students.stream().forEach(s -> System.out.println(s.getName()));
        System.out.println();
        students.sort(Comparator.comparing(Student::getName));
        students.stream().forEach(s -> System.out.println(s.getName()));
        //return the sorted list
        students.stream()
                .sorted(Comparator.comparing(Student::getName))
                .forEach(s -> System.out.println(s.getName()));
        Set<String> names = students.stream()
                .filter(student -> student.getAge() > 25)
                .map(Student::getName)
                .collect(Collectors.toSet());

        Optional<Student> optionalStudent = students.stream()
                .filter(student -> student.getGrade().equals(null))
                .findFirst();

        optionalStudent.ifPresent(student -> System.out.println(student.getName()));

        //reduce
        //sum all
        Integer sum = students.stream()
                .map(Student::getAge)
                .reduce(0, Integer::sum);
        System.out.println(sum);*/
        //=============================================================================================================//
        //6.1
        System.out.println("Unsorted - " + fruits);
        fruits.sort(Comparator.naturalOrder());
        System.out.println("Sorted - " + fruits);
        //6.2
        System.out.println("Unsorted - " + fruits);
        fruits.sort(Comparator.reverseOrder());
        System.out.println("Sorted - " + fruits);
        //
        // Custom sorting student entries by name
        System.out.println("Unsorted - " + students);
        Collections.sort(students, new Student.Sortbyname());
        System.out.println("Sorted - " + students);

        //7.0
        Game game1 = new Game("Game1", Genre.STEALTH, 15.5, 200);
        Game game2 = new Game("Game2", Genre.RPG, 25.5, 300);
        Game game3 = new Game("Game3", Genre.ACTION, 35.5, 400);
        Game game4 = new Game("Game4", Genre.MMO, 45.5, 500);
        List<Game> games = new ArrayList<>();
        games.add(game1);
        games.add(game2);
        games.add(game3);
        games.add(game4);

        for (Game game : games) {
            game.toString();
        }
        games.remove(1);

        for (Game game : games) {
            game.printGame();
        }

        Collections.reverse(games);
        //descending
        games.sort(new Game.PriceComparator().reversed());
        //ascending
        games.sort(new Game.PriceComparator());

        //8.0
        Set<String> gamesMoreThan10 = games.stream()
                .filter(Game -> Game.getPrice() > 10 && Game.getCopiesSold() > 50)
                .map(Game::getTitle)
                .collect(Collectors.toSet());
        System.out.println("Games with price > 10 and 50 < copies sold " + gamesMoreThan10);

        //9.0
        List<Game> games2 = new ArrayList<>();
        Game game11 = new Game("Game1", Genre.STEALTH, 15.5, 1000);
        Game game22 = new Game("Game2", Genre.RPG, 25.5, 300);
        Game game33 = new Game("Game3", Genre.ACTION, 35.5, 400);
        Game game44 = new Game("Game4", Genre.MMO, 45.5, 500);

        games2.add(game11);
        games2.add(game22);
        games2.add(game33);
        games2.add(game44);
        games2.sort(Comparator.comparing(Game::getCopiesSold));
        for (Game game : games2) {
            game.printGame();
        }

        Integer max = games2.stream()
                .map(Game::getCopiesSold)
                .reduce(0, Integer::max);
        Integer min = games2.stream()
                .map(Game::getCopiesSold)
                .reduce(0, Integer::min);

        System.out.println("Maximum is : " + max);
        System.out.println("Minimum is : " + min);

    }
}