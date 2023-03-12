import enums.Grade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Course {

    public static void run() {
        //Use already created Student class and create 5 students, add them to the list.
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student(1, "First", 25, Grade.SECONDARY),
                new Student(2, "Second", 20, Grade.PRIMARY),
                new Student(3, "Third", 26, Grade.SECONDARY),
                new Student(4, "Fourth", 23, Grade.SECONDARY),
                new Student(6, "Fifth", 45, Grade.SECONDARY)));

        /** If student age is more than 25 then delete it from student list.*/
/*      List<Student> studentsToRemove = new ArrayList<>();
        for (Student student : students) {
            if (student.getAge() > 25) {
                studentsToRemove.add(student);
            }
        }
        students.removeAll(studentsToRemove);
        System.out.println(Arrays.toString(students.toArray()));
*/
        // removing older than 25 using stream
        students.removeIf(student -> student.getAge() > 25);
        System.out.println("\nOlder than 25 years old students removed");

        // Print student list using toString method.
        for (Student student : students) {
            System.out.println(student.toString());
        }


        // Convert ArrayList of Students to the Map.
        Map<Integer, Student> studentsMap = students.stream().collect(Collectors.toMap(Student::getStudentID, student -> student));
        // Print map
        System.out.println("Printing map: ");
        System.out.println(studentsMap);

        // Take 4 index Student and change his grade and age.
        // task implemented using changeGradeAndAge method
        studentsMap.get(4).changeGradeAndAge(Grade.PRIMARY, 43);
        // task implemented by overriding 4th key of the map
        studentsMap.put(4, new Student(4, studentsMap.get(4).getName(), 99, Grade.SECONDARY));

        // Print map key and value. For value use toString.
        System.out.println("Printing map key and value: ");
        for (int key : studentsMap.keySet()) {
            System.out.println("Key: " + key + "\nStudent: " + studentsMap.get(key).toString());
        }


//
//        //Sorting
//        students.forEach(s -> System.out.println(s.getName()));
//        students.sort(Comparator.comparing(Student::getName));
//        System.out.println();
//        students.forEach(s -> System.out.println(s.getName()));
//        Optional<Student> optionalStudent = students.stream().filter(student -> student.getGrade().equals(null)).findFirst();
//
//        System.out.println("looking for an optional student...");
//        optionalStudent.ifPresent(student -> System.out.println(student.getName()));

    }
}