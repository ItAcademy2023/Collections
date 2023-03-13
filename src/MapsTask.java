import java.util.*;
import java.util.stream.Collectors;

public class MapsTask {
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

        Map<String, Student> studentMap = uniqueStudents.stream().collect(Collectors.toMap(Student::getName, student -> student));
        System.out.println(studentMap.keySet());
        System.out.println(studentMap.values());
        System.out.println(studentMap.get("Rita"));

        Map<String, Student> newStudentMap = new HashMap<>();
        newStudentMap.put("Jurate", new Student(6, 32, "Jurate", Grade.UNIVERSITY));
        newStudentMap.putIfAbsent("Jurate", new Student(7, 33, "JJ", Grade.PRIMARY));
        System.out.println(newStudentMap);

        // maps task
        Map<Integer, Student> studentMapId = students.stream().collect(Collectors.toMap(Student::getId, student -> student));
        System.out.println(studentMapId);
        Student modifiedStudent = new Student(4, 99, "Jessica", Grade.UNIVERSITY);
        studentMapId.put(4, modifiedStudent);
        System.out.println(studentMapId.keySet());
        System.out.println(studentMapId.values());
    }
}
