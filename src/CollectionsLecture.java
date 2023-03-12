import java.util.*;
import java.util.stream.Collectors;

public class CollectionsLecture {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("John", Grade.SECONDARY, 22, 0),
                new Student("Doe", Grade.PRIMARY, 12, 1),
                new Student("Smith", Grade.SECONDARY, 30, 2),
                new Student("Robert", Grade.SECONDARY, 40, 3),
                new Student("Rita", Grade.SECONDARY, 22, 4),
                new Student("Rita", Grade.SECONDARY, 22, 4));
//
//        for (Student student : students) {
//            System.out.println(student);
//        }
//
//        Student rita = students.get(4);
//
//        if (students.contains(rita)) {
//            students.remove(rita);
////            students.remove(4);
//        }

        Integer[] numbers = {1, 2, 4, 5, 10, 12, 40};
        List<Integer> numberList = Arrays.asList(numbers);

        System.out.println(numberList);

        ArrayList<Student> studentsList = new ArrayList<>(students);
        studentsList.removeIf(studentStream -> studentStream.getAge() > 25);

//        Iterator<Student> it = studentsList.iterator();
//        while (it.hasNext()) {
//            if (it.next().getAge() > 25) {
//                it.remove();
//            }
//        }

        System.out.println(studentsList.toString()); //toString not necessary


//      Set<Student> uniqueStudents = students.stream().collect(Collectors.toSet());
        HashSet<Student> uniqueStudents = new HashSet<>(students);
        System.out.println("List size students " + students.size());
        System.out.println("List size unique students " + uniqueStudents.size());

//        uniqueStudents.removeIf(s -> Grade.PRIMARY.equals(s.getGrade()));
        System.out.println(uniqueStudents);

//        Map<String, Student> keyValuePairs = uniqueStudents.stream().collect(Collectors.toMap(Student::getName, item -> item));

//        Map<String, Student> keyValuePairs = new HashMap<>();
//        keyValuePairs.put();
//        keyValuePairs.putIfAbsent();
//        System.out.println(keyValuePairs.keySet());
//        System.out.println(keyValuePairs.values());
//        System.out.println(keyValuePairs.get("John"));

        Map<Integer, Student> studentMap = uniqueStudents.stream().collect(Collectors.toMap(Student::getId, student -> student));
        Student modifiedStudent = new Student(studentMap.get(4).getName(),Grade.PRIMARY,20,4);
        studentMap.put(4, modifiedStudent);
        System.out.println(studentMap.keySet());
        System.out.println(studentMap.values());

        students.stream().forEach(s -> System.out.println(s.getName()));
        students.stream()
                .sorted(Comparator.comparing(Student::getName))
                .forEach(s -> System.out.println(s.getName()));

        Set<Student> names = students.stream()
                .filter(student -> student.getAge() > 25)
                .collect(Collectors.toSet());
        //      .map(Student::getName).collect(Collectors.toSet());
        Optional<Student> optionalStudent = students.stream()
                .filter(student -> student.getGrade().equals(null))
                .findFirst();
        optionalStudent.ifPresent(s -> System.out.println(s.getName()));

        Integer sum = students.stream().map(Student::getAge).reduce(0, Integer::sum);

    }
}
