import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String[] cars = {"Subaru", "BMW", "Suzuki"};
        System.out.println(cars[1]);
        cars[2] = "Honda";
        System.out.println(cars.length);
        for (String car : cars) {
            System.out.println(car);
        }
        int[] numbers = {40, 55, 63, 17, 22, 68, 89, 97, 89};
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("");
        //=======================================================================================================
        Integer[] exampleNumbers = new Integer[] { 1, 2, 3 };
        List<Integer> list = Arrays.asList(exampleNumbers);
        System.out.println(list);

        List<Student> students =new ArrayList<>(Arrays.asList(

                new Student(23,1,"John",Grade.University),
                new Student(25,2,"Jack",Grade.Secondary),
                new Student(27,3,"Simon",Grade.University),
                new Student(28,4,"Brandon",Grade.Secondary),
                new Student(20,5,"Jules",Grade.Primary)

        ));
//        students.removeIf(s->s.getAge()>25);
//        System.out.println(students);
Set<Student> uniqueStudents =new HashSet<>(students);
//System.out.println("List size:"+students.size());
//System.out.println("Set size"+uniqueStudents.size());

        //=======================================================================================================




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

        Set<String> fruitHashSet=new HashSet<>(fruits);
        System.out.println(fruitHashSet);
        System.out.println(fruitHashSet.size());
        //=====================================================================================================

//    Map<String,Student> studentMap=new HashMap<>();
//
//        System.out.println(studentMap.get("John"));
//
//        Map<String,Student> keyValuePairs= uniqueStudents.stream().collect(Collectors.toMap(Student ::getName, item->item));
//        System.out.println(keyValuePairs.keySet());
//        System.out.println(keyValuePairs.values());
//          keyValuePairs.put("Karolis", new Student(27 ,"Karolis",Grade.University));
//
//     System.out.println(keyValuePairs.values());
//        System.out.println(keyValuePairs.get("John"));
//======================================================================================================================
        Map<Integer,Student> studentsMap= uniqueStudents.stream().collect(Collectors.toMap(Student ::getId, item->item));

        System.out.println(studentsMap.values());
        Student modifiedStudent= new Student(55,4,studentsMap.get(4).getName(),Grade.Primary);
        studentsMap.put(4,modifiedStudent);
        System.out.println(studentsMap.values());
//        //===========================================================================================================
//
//        students.sort(Comparator.comparing(Student::getName));
//        students.stream().forEach(s->System.out.println(s.getName()));
//        System.out.println(students);
//
//        students.stream().sorted(Comparator.comparing(Student::getAge));
//
//        students.stream().filter(student->student.getAge()>25).map(Student ::getName).collect(Collectors.toSet());
//
//        Optional <Student> optionalStudent = students.stream().filter(student -> student.getGrade().equals(null)).findFirst();
//        optionalStudent.ifPresent(s-> System.out.println(s.getName()));
//        Integer sum= students.stream().map(Student::getAge).reduce(0,Integer ::sum);

//======================================================================================================================
        List<Game> games =new ArrayList<>(Arrays.asList(

                new Game("StarCraft",60,Genre.Strategy,546),
                new Game("Need for Speed",2,Genre.Racing,123),
                new Game("Slender",35,Genre.Horror,20),
                new Game("Nba 2K10",59,Genre.Sport,200)


        ));
//        games.stream().forEach(s->System.out.println(s.toString()));
//        games.remove(1);
//        games.stream().forEach(s->s.print());
        //ascending
        games.sort(Comparator.comparing(Game ::getPrice));
        games.stream().forEach(s->System.out.println(s.toString()));
        //descending
        Collections.reverse(games);
        games.stream().forEach(s->System.out.println(s.toString()));
        //==============================================================================================================

        games.forEach(s->s.incrementPrice(5));
        games.stream().forEach(s->System.out.println(s.toString()));
        List<Game> expensiveGames=  games.stream().filter(s->s.getPrice()>10).collect(Collectors.toList());
        expensiveGames.stream().forEach(s->System.out.println(s.toString()));

        List<Game> LikedGames=  games.stream().filter(s->s.getCopiesSold()>50).collect(Collectors.toList());
        LikedGames.stream().forEach(s->System.out.println(s.toString()));
//======================================================================================================================
       List<Game> sortedGames= games.stream().sorted(Comparator.comparing(Game::getPrice)).collect(Collectors.toList());
        System.out.println("===========================================");
        System.out.println(sortedGames);
        System.out.println(games.stream().max(Comparator.comparing(Game::getCopiesSold)));
        System.out.println(games.stream().min(Comparator.comparing(Game::getCopiesSold)));

    }
}