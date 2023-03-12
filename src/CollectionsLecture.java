import java.util.*;
import java.util.stream.Collectors;

public class CollectionsLecture {

    public static void main(String[] args) {

//        List<Student> students = new ArrayList<>();
//        students.add();

//        List<Student> students = List.of(
//                new Student(25, "Laura", Grade.UNIVERSITY),
//                new Student(27, "Dan", Grade.SCHOOL),
//                new Student(33, "Mary", Grade.UNIVERSITY),
//                new Student(29, "Robert", Grade.UNIVERSITY));
//                students.add(new Student(17, "Ryan", Grade.HIGHCHOOL));

        List<Student> students = new ArrayList<>();
        students.add(new Student(25, "Laura", Grade.UNIVERSITY, 1));
        students.add(new Student(17, "Ryan", Grade.HIGH_SCHOOL, 2));
        students.add(new Student(25, "Laura", Grade.UNIVERSITY, 3));
        students.add(new Student(27, "Dan", Grade.SCHOOL, 4));
        students.add(new Student(33, "Mary", Grade.UNIVERSITY, 5));
        students.add(new Student(29, "Robert", Grade.UNIVERSITY, 6));
        students.add(new Student(29, "Robert", Grade.UNIVERSITY, 7));

        for (Student student : students) {
            System.out.println(student);
        }

        students.get(0).setAge(28);         // we set the age of first student to 28.
        // students.remove(3);             //removing student from the list

//      List<Student> youngStudents = new ArrayList<>();
//     List<Student> oldStudents = new ArrayList<>();

//        for (Student student : students) {
//            if (!(student.getAge() > 25)) {
//                youngStudents.add(student);
//            }
//        }

//        for (Student student : students) {
//            if (student.getAge() > 25) {
//                oldStudents.add(student);
//            }
//        }
//        students.removeAll(oldStudents);

        // Easier way to remove or change things in a list, using streams:

        students.removeIf(streamStudent -> streamStudent.getAge() > 25);  // the easiest way to remove students
        System.out.println(students);

        // SET (two ways):  need to have equals method implemented to identify uniqueness.

        //Set<Student> uniqueStudents = students.stream().collect(Collectors.toSet());
        Set<Student> uniqueStudents = new HashSet<>(students);      // removes duplicates

        System.out.println("List size: " + students.size());
        System.out.println("Set size: " + uniqueStudents.size());

        uniqueStudents.removeIf(s -> Grade.UNIVERSITY.equals(s.getGrade()));

        System.out.println(uniqueStudents);

        //Mapping: (String is key, Student is value)
        //I want my key to be a name of a Student.

        Map<String, Student> keyValuePairs = uniqueStudents.stream().
                collect(Collectors.toMap(Student::getName, student -> student));

        //  Map<String, Student> studentMap = new HashMap<>();
        keyValuePairs.put("Ruta", new Student(28, "Ruta", Grade.HIGH_SCHOOL, 8));
        keyValuePairs.put("John", new Student(29, "John", Grade.HIGH_SCHOOL, 9));

        System.out.println(keyValuePairs.keySet());
        System.out.println(keyValuePairs.values());

        keyValuePairs.putIfAbsent("Laura", new Student(18, "Laura", Grade.SCHOOL, 10));

        System.out.println(keyValuePairs.get("Ryan"));

        //Exercise:

        Map<Integer, Student> studentMap = students.stream().
                collect(Collectors.toMap(Student::getId, student -> student));
        System.out.println(studentMap);

        Student modifiedStudent = new Student(26, studentMap.get(1).getName(), Grade.SCHOOL, 1);
        studentMap.put(1, modifiedStudent);

        System.out.println(studentMap.keySet());     // returns the Ids
        System.out.println(studentMap.values());    // returns students in the map

        //SORTING:

//        students.sort(Comparator.comparing(Student::getName));
//        students.stream()
//                .sorted(Comparator.comparing(Student::getName));
//        students.stream().forEach();
//
//        System.out.println(students);

        // Filtering:

        //take all of the students above 25, and extract to show their names
        Set<Student> names = students.stream()
                .filter(student -> student.getAge() > 25)
                .collect(Collectors.toSet());
        //.map(Student::getName).collect(Collectors.toSet());

//        Optional<Student> optionalStudent = students.stream()
//                .findFirst()
//                .filter(student -> student.getGrade().equals(null));
//
//        System.out.println(optionalStudent.get().getAge());
//        optionalStudent.ifPresent(s -> System.out.println(s.getName()));
    }
}