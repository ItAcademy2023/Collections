import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(1, 25, "Anthony", Grade.UNIVERSITY),
                new Student(2, 24, "Doe", Grade.PRIMARY),
                new Student(3, 15, "Robert", Grade.UNIVERSITY),
                new Student(4, 60, "John", Grade.PRIMARY),
                new Student(5, 11, "Rita", Grade.PRIMARY)
        );
        // SORT
        students.sort(Comparator.comparing(Student::getId));
        System.out.println(students);

    }
}