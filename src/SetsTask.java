import java.util.*;

public class SetsTask {
    public static void main(String[] args) {
        // populating students list
        List<Student> students = Arrays.asList(
                new Student(1, 25, "Anthony", Grade.UNIVERSITY),
                new Student(2, 24, "Doe", Grade.PRIMARY),
                new Student(3, 15, "Robert", Grade.UNIVERSITY),
                new Student(4, 60, "John", Grade.PRIMARY),
                new Student(5, 11, "Rita", Grade.PRIMARY)
        );

        Set<Student> uniqueStudents = new HashSet<>(students);
        //uniqueStudents.removeIf(student -> Grade.PRIMARY.equals(student.getGrade()));

        // sets task
        List<String> fruits = Arrays.asList("Apple", "Pear", "Banana", "Apple", "Cherry", "Fig", "Orange", "Banana", "Apple");
        System.out.println("\nFruit List Size: "+ fruits.size());
        //System.out.println(Arrays.toString(fruits.toArray()));

        Set<String> fruitsSet = new HashSet<>(fruits);
        for (String fruit : fruitsSet) System.out.print(fruit + " ");
        System.out.println("\nFruit Set Size: " + fruitsSet.size());
    }
}
