import java.util.*;
import java.util.stream.Collectors;

public class Demo {
    public static void demo(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(32, "John", Grade.UNIVERSITY, 1));
        students.add(new Student(18, "Doe", Grade.PRIMARY, 2));
        students.add(new Student(20, "Smith", Grade.UNIVERSITY, 3));
        students.add(new Student(41, "Rita", Grade.PRIMARY, 4));
        students.add(new Student(31,"Mavis", Grade.UNIVERSITY, 5));
        students.add(new Student(31,"Mavis", Grade.UNIVERSITY, 6));

//        students.removeIf(streamStudent -> streamStudent.getAge() > 25);
//        System.out.println(students);


//        set
//        Set<Student> uniqueStudents = new HashSet<>(students);
//        System.out.println("List size " + students.size());
//        System.out.println("Set size " + uniqueStudents.size());

        //remove student
//        uniqueStudents.removeIf(s -> Grade.PRIMARY.equals(s.getGrade()));
//        System.out.println(uniqueStudents);

        //Add id and change grade
//        Map<Integer, Student> studentMap= students.stream().collect(Collectors.toMap(Student::getId, student -> student));
//        System.out.println(studentMap);
//        Student modifiedStudent = new Student(20, studentMap.get(4).getName(), Grade.UNIVERSITY, 4);
//        studentMap.put(4, modifiedStudent);
//        System.out.println(studentMap.keySet());
//        System.out.println(studentMap.values());



    }


}
