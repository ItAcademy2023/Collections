import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main{

    public static void main(String[] args) {
        Warmup warmup = new Warmup();
        warmup.warmup();
        List<Student> students = List.of(new Student(2,"John", Grade.MID, 1), new Student(45, "Doe", Grade.JUNIOR, 2), new Student(52, "Robert", Grade.SENIOR, 3), new Student(31, "Rite", Grade.MID, 4), new Student(11, "Rite", Grade.MID, 5));
//        students.stream().filter(student -> student.getAge() <= 25).forEach(System.out::println);

        students.stream().filter(student -> student.getAge() < 25 && student.getID() <= 2);

        Map<Integer, Student> studentMap = students.stream().collect(Collectors.toMap(Student::getID, student -> student));
        String name = studentMap.get(4).getName();
        studentMap.put(4, new Student(39, name, Grade.SENIOR, 4));
        System.out.println(studentMap);
        System.out.println(studentMap.keySet());
        System.out.println(studentMap.values());

        Fruits fruits = new Fruits();
        fruits.fruits();
//        List<Student> filteredList = new ArrayList<>();
//        for (Student student : students) {
//            if(student.getAge() <= 25){
//                filteredList.add(student);
//            }
//        }
//        for (Student student : filteredList) {
//            System.out.println(student);
//        }
//        List<Student> students = new ArrayList<>(
//                Arrays.asList(
//                new Student(22, "John", Grade.MID),
//                new Student(12, "Doe", Grade.JUNIOR),
//                new Student(52, "Robert", Grade.SENIOR),
//                new Student(11, "Rite", Grade.MID)
//        )
//);
//        for (Student student : students) {
//            System.out.println(student);
//        }
//        students.remove(2);
        Game witcher = new Game("Witcher 3 Wild hunt", Genre.ADVENTURE, 8.99, 40000000);
        Game lol = new Game("League of legends", Genre.MOBA, 0, 180000000);
        Game csgo = new Game("Counter Strike Global Offensive", Genre.SHOOTER, 8.99, 40000000);
        Game gta = new Game("Grand Theft Auto V", Genre.ACTION, 12.99, 175000000);

        ArrayList<Game> games = new ArrayList<> (Arrays.asList(witcher, lol, csgo, gta));
        games.remove(2);
        games.forEach(System.out::println);

    }

}


