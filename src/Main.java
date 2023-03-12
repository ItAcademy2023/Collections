
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(18, "Tom", Grade.MEDIUM, 3));
        students.add(new Student(29, "Tom", Grade.MEDIUM, 4));
        students.add(new Student(25, "Anna", Grade.BAD, 5));
        students.add(new Student(19, "Some",  Grade.BAD, 6));
        students.add(new Student(20, "rita",  Grade.MEDIUM, 7));
        students.add(new Student(20, "rita",  Grade.MEDIUM, 8));

        // without streams

//        List<Student> leftAfterRemoving = new ArrayList<>();

//        for (Student student : students) {
//            if (student.getAge() < 25) {
//
//                leftAfterRemoving.add(student);
//                System.out.println(student);
//            }
//        }

        students.removeIf(streamStudent -> streamStudent.getAge() > 25);
        System.out.println(students);

        // Set

        Set<Student> uniqueStudents = new HashSet<>(students);

        System.out.println("List size: " + students.size());
        System.out.println("Set size: " + uniqueStudents.size());

        uniqueStudents.removeIf(s -> Grade.MEDIUM.equals(s.getGrade()));
        System.out.println(uniqueStudents);

        // Map

        Map<String, Student> keyValuePairs = uniqueStudents.stream().collect(Collectors.toMap(Student::getName, item -> item));

        Map<String, Student> studentMap = new HashMap<>();

//        keyValuePairs.put("nothing", new Student(23, "Bob", Grade.GOOD));

        System.out.println(keyValuePairs.keySet());
        System.out.println(keyValuePairs.values());

        System.out.println(keyValuePairs.get("Some"));

        // Last task

        Map<Integer, Student> studentMap1 = students.stream().collect(Collectors.toMap(Student::getId, student -> student));
        System.out.println(studentMap1);

//        studentMap1.get(4).getName()

//        Student newStudent = new Student(18, "Anna", Grade.MEDIUM, 4, studentMap1.get(4).getName());
//        System.out.println(4, newStudent);


        // Sorting

        students.stream().forEach(s-> System.out.println(s.getName()));
        students.sort(Comparator.comparing(Student::getName));
        students.stream().forEach(s-> System.out.println(s.getName()));

        Set<String> name = students.stream()
                .filter(student -> student.getAge() > 25).map(Student::getName).collect(Collectors.toSet());

    }
}