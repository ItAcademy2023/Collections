import java.util.*;
import java.util.stream.Collectors;

public class LessonNotes {

    public static void main(String[] args) {
//        ArrayList<Student> students = new ArrayList<>( List.of(new Student("John", 25, Grade.UNIVERSITY),  // new ArrayList<>()
//                students.add();  for arraylist
//                new Student("John", 14, Grade.UNIVERSITY),
//                new Student("Tom", 23, Grade.PRIMARY),
//                new Student("Boris", 22, Grade.UNIVERSITY),
//                new Student("Denis", 26, Grade.PRIMARY)));

//        List<Student> studentsList = new ArrayList<>();
//        studentsList.add(new Student("Harry", 14, Grade.UNIVERSITY));
//        studentsList.add(new Student("John", 29, Grade.UNIVERSITY));
//        studentsList.add(new Student("Tom", 23, Grade.PRIMARY));
//        studentsList.add(new Student("Boris", 22, Grade.UNIVERSITY));
//        studentsList.add(new Student("Denis", 26, Grade.PRIMARY));


//
//        ArrayList<Student> students = new ArrayList<>();
//        students.add(new Student("Harry", 14, Grade.UNIVERSITY));
//        students.add(new Student("John", 14, Grade.UNIVERSITY));
//        students.add(new Student("Tom", 23, Grade.PRIMARY));
//        students.add(new Student("Boris", 22, Grade.UNIVERSITY));
//        students.add(new Student("Denis", 26, Grade.PRIMARY));
//        students.add(new Student("John", 25, Grade.UNIVERSITY));
//
//        for (Student student : students) {
//            System.out.println(student);
//        }
//
//        Student student3 = students.get(2);
//        if (students.contains(student3)) {
//            students.remove(student3);
////            students.remove(3);
//        }
//
//        for (Student student : students) {
//            System.out.println(student);
//        }



//        Integer[] numbers = {0, 1, 2};
//
//        for (int number : numbers) {
//            System.out.println(number);
//        }
//
//        List<Integer> numbersAsList = Arrays.asList(numbers);


        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Harry", 14, Grade.UNIVERSITY,0));
        students.add(new Student("John", 29, Grade.UNIVERSITY, 1));
        students.add(new Student("Tom", 23, Grade.PRIMARY, 2));
        students.add(new Student("Boris", 22, Grade.UNIVERSITY, 3));
        students.add(new Student("Denis", 26, Grade.PRIMARY, 4));
//
//        students.removeIf(streamStudent -> streamStudent.getAge() > 25);
//        students.forEach(System.out::println);



//        Set<Student> uniqueStudents = new HashSet<>(studentsList);
//        System.out.println("List size: " + students.size());
//        System.out.println("Set size " + uniqueStudents);


//        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Pear", "Banana", "Apple", "Cherry", "Fig", "Orange", "Banana", "Apple"));
//        fruits.forEach(System.out::println);
//        HashSet<String> fruitsSet = new HashSet<>(fruits);
//        fruitsSet.forEach(System.out::println);
//        System.out.println(fruitsSet.size());


        Map<String, Student> keyValuePairs = students.stream().collect(Collectors.toMap(Student::getName, student -> student));

//        Map<String, Student> studentMap = new HashMap<>();
//        keyValuePairs.put("Evaldas", new Student("Evaldas", 26, Grade.UNIVERSITY, 5));
//        keyValuePairs.put("Evaldass", new Student("Evaldass", 26, Grade.UNIVERSITY, 6));

        Map<Integer, Student> studentMap = students.stream().collect(Collectors.toMap(Student::getId, student -> student));
        System.out.println(studentMap);
        Student studentForMap = new Student(studentMap.get(4).getName(), 11, Grade.UNIVERSITY, 4);
        studentMap.put(4, studentForMap);

//        students.stream().forEach(s -> System.out.println(s.getName()));
//        students.sort(Comparator.comparing(Student::getName));
//        System.out.println(students);
//        students.stream().forEach(s -> System.out.println(s.getName()));





        System.out.println(keyValuePairs.keySet());
        System.out.println(keyValuePairs.values());





    }


}
