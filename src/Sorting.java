import java.util.*;
import java.util.stream.Collectors;

public class Sorting {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(1, 25, "Anthony", Grade.UNIVERSITY),
                new Student(2, 24, "John", Grade.PRIMARY),
                new Student(3, 15, "Robert", Grade.UNIVERSITY),
                new Student(4, 60, "Doe", Grade.PRIMARY),
                new Student(5, 11, "Rita", Grade.PRIMARY)
        );

        students.stream().forEach(s -> System.out.println(s.getName()));
        System.out.println();
        students.sort(Comparator.comparing(Student::getName));
//        students.stream()
//                .sorted(Comparator.comparing(Student::getName))
//                .forEach(s -> System.out.println(s.getName()));
        System.out.println();
        students.stream().forEach(s -> System.out.println(s.getName()));

        Set<Student> uniqueStudentsAbove25 = students.stream()
                .filter(student -> student.getAge() > 25)
                .collect(Collectors.toSet());
//                .map(Student::getName).collect(Collectors.toSet());

        System.out.println("\nunique above 25");
        System.out.println(uniqueStudentsAbove25);

        Optional<Student> optionalStudent = students.stream()
                .filter(student -> student.getGrade().equals(Grade.PRIMARY))
                .findFirst();
        //System.out.println(optionalStudent.get().getAge());
        optionalStudent.ifPresent(s -> System.out.println("\n" + s.getName()));

        Integer sum = students.stream()
                .map(Student::getAge)
                .reduce(0, Integer::sum);
        System.out.println("\n" + sum);

    }
}
